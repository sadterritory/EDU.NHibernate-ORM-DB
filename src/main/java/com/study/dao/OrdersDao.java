package com.study.dao;

import com.study.entity.Orders;

import java.time.LocalDate;
import java.util.List;

public class OrdersDao extends AbstractDao<Orders>{

    public OrdersDao() {
        super(Orders.class);
    }

    public List<Orders> findByOrderDate(LocalDate order_date) {
        return findByField("order_date", order_date);
    }

    public List<Orders> findByOrderCompletionDate(LocalDate completion_date) {
        return findByField("completion_date", completion_date);
    }

    public List<Orders> findByOrderQuantity(Integer quantity) {
        return findByField("quantity", quantity);
    }

    public List<Orders> findByCustomerName(String name) {
        return findByField("customers.name", name);
    }

    public List<Orders> findByCustomerPhone(String phone) {
        return findByField("customers.phone", phone);
    }

    public List<Orders> findByCustomerContactPerson(String contact_person) {
        return findByField("customers.contact_person", contact_person);
    }

    public List<Orders> findByBookTitle(String title) {
        return findByField("books.title", title);
    }

    public List<Orders> findByBookPublicationDate(LocalDate publication_date) {
        return findByField("books.publication_date", publication_date);
    }

    public List<Orders> findByBookSellingPrice(Float selling_price) {
        return findByField("books.selling_price", selling_price);
    }

}
