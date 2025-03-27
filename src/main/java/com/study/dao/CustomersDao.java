package com.study.dao;

import com.study.entity.Customers;

import java.util.List;

public class CustomersDao extends AbstractDao<Customers> {

    public CustomersDao() {
        super(Customers.class);
    }

    public List<Customers> findByName(String name) {
        return findByField("name", name);
    }

    public List<Customers> findByAddress(String address) {
        return findByField("address", address);
    }

    public List<Customers> findByPhone(String phone) {
        return findByField("phone", phone);
    }

    public List<Customers> findByContactPerson(String contact_person) {
        return findByField("contact_person", contact_person);
    }
}
