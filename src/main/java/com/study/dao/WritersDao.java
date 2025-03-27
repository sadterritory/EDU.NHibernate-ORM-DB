package com.study.dao;

import com.study.entity.Writers;

import java.util.List;

public class WritersDao extends AbstractDao<Writers> {

    public WritersDao() {
        super(Writers.class);
    }

    public List<Writers> findByPassportNum(Integer passport_num) {
        return findByField("passport_num", passport_num);
    }

    public List<Writers> findByLastName(String last_name) {
        return findByField("last_name", last_name);
    }

    public List<Writers> findByFirstName(String first_name) {
        return findByField("first_name", first_name);
    }

    public List<Writers> findByMiddleName(String middle_name) {
        return findByField("middle_name", middle_name);
    }

    public List<Writers> findByAddress(String address) {
        return findByField("address", address);
    }

    public List<Writers> findByPhone(String phone) {
        return findByField("phone", phone);
    }
}
