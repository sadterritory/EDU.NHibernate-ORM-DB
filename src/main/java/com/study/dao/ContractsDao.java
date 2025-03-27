package com.study.dao;

import com.study.entity.Contracts;

import java.time.LocalDate;
import java.util.List;

public class ContractsDao extends AbstractDao<Contracts>{

    public ContractsDao() {
        super(Contracts.class);
    }

    public List<Contracts> findByContactDate(LocalDate contract_date) {
        return findByField("contract_date", contract_date);
    }

    public List<Contracts> findByContractDuration(Integer contract_duration) {
        return findByField("contract_duration", contract_duration);
    }

    public List<Contracts> findByIsTerminated(Boolean is_terminated) {
        return findByField("is_terminated", is_terminated);
    }

    public List<Contracts> findByTerminationDate(LocalDate termination_date) {
        return findByField("termination_date", termination_date);
    }

    public List<Contracts> findByWriterLastName(String last_name) {
        return findByField("writers.last_name", last_name);
    }

    public List<Contracts> findByWriterFirstName(String first_name) {
        return findByField("writers.first_name", first_name);
    }

    public List<Contracts> findByWriterPhone(String phone) {
        return findByField("writers.phone", phone);
    }

}
