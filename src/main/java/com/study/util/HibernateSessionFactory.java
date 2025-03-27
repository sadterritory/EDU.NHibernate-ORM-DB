package com.study.util;

import com.study.entity.*;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Service;

@Service
public class HibernateSessionFactory {

    private static SessionFactory sessionFactory;

    private HibernateSessionFactory() {}

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration().configure();

                configuration.addAnnotatedClass(Contracts.class);
                configuration.addAnnotatedClass(Writers.class);
                configuration.addAnnotatedClass(BookAuthors.class);
                configuration.addAnnotatedClass(Books.class);
                configuration.addAnnotatedClass(Orders.class);
                configuration.addAnnotatedClass(Customers.class);


                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                                                        .applySettings(configuration.getProperties());
                sessionFactory = configuration.buildSessionFactory(builder.build());
            } catch (Exception exc) {
                exc.printStackTrace();
            }
        }
        return sessionFactory;
    }


}
