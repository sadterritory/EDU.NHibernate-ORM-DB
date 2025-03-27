package com.study.dao;

import java.util.List;

public interface Crud<T> {

    T getById(int id);
    List<T> getAll();
    T saveOrUpdate(T entity);
    void delete(T entity);
}
