package com.study.dao;

import com.study.util.HibernateSessionFactory;
import org.antlr.v4.runtime.misc.Pair;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.SelectionQuery;
import org.postgresql.shaded.com.ongres.scram.common.util.Preconditions;

import java.util.List;

public abstract class AbstractDao<T> implements Crud<T> {

    private final Class<T> tClass;
    private final SessionFactory factory;

    public AbstractDao(Class<T> tClass) {
        this.tClass = tClass;
        this.factory = HibernateSessionFactory.getSessionFactory();
    }

    @Override
    public T getById(int id) {
        return factory.openSession().get(tClass, id);
    }

    @Override
    public List<T> getAll() {
        Session session = factory.openSession();
        return session.createSelectionQuery(
                        "FROM %s".formatted(tClass.getName()), tClass)
                .list();
    }

    @Override
    public T saveOrUpdate(T entity) {
        Preconditions.checkNotNull(entity, entity.toString());

        T persistEntity;
        try (Session session = factory.openSession()) {
            Transaction transaction = session.getTransaction();
            transaction.begin();
            persistEntity = session.merge(entity);
            transaction.commit();
        }
        return persistEntity;
    }

    @Override
    public void delete(T entity) {
        Preconditions.checkNotNull(entity, entity.toString());

        try (Session session = factory.openSession()) {
            Transaction transaction = session.getTransaction();
            transaction.begin();
            session.refresh(entity);
            session.remove(entity);
            transaction.commit();
        }
    }

    public List<T> findByField(String fieldName, Object value) {
        Preconditions.checkNotNull(fieldName, fieldName);
        Preconditions.checkNotNull(value, value.toString());

        Session session = factory.openSession();
        Pair<String, Object> queryParams = defineTypes(fieldName, value);
        SelectionQuery<T> hqlQuery = session.createSelectionQuery(queryParams.a, tClass)
                .setParameter("value", queryParams.b);
        return hqlQuery.getResultList();
    }

    public List<Object[]> getAllCountTable() {
        Session session = factory.openSession();
        return session.createNativeQuery("SELECT * FROM workwear_count_v", Object[].class)
                .getResultList();
    }

    private Pair<String, Object> defineTypes(String fieldName, Object value) {
        Object castedValue;
        String queryString;
        if (value instanceof String) {
            castedValue = "%%%s%%".formatted(value);
            queryString = new String("FROM %s WHERE %s ILIKE :value");
        } else {
            castedValue = value;
            queryString = new String("FROM %s WHERE %s = :value");
        }
        queryString = queryString.formatted(tClass.getName(), fieldName);
        return new Pair<>(queryString, castedValue);
    }
}
