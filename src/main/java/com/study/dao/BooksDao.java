package com.study.dao;

import com.study.entity.Books;

import java.time.LocalDate;
import java.util.List;

public class BooksDao extends AbstractDao<Books> {

    public BooksDao() {
        super(Books.class);
    }

    public List<Books> findByTitle(String title) {
        return findByField("title", title);
    }

    public List<Books> findByPrintRun(Integer print_run) {
        return findByField("print_run", print_run);
    }

    public List<Books> findByPublicationDate(LocalDate publication_date) {
        return findByField("publication_date", publication_date);
    }

    public List<Books> findByCostPrice(Float cost_price) {
        return findByField("cost_price", cost_price);
    }

    public List<Books> findBySellingPrice(Float selling_price) {
        return findByField("selling_price", selling_price);
    }

    public List<Books> findByRoyalty(Float royalty) {
        return findByField("royalty", royalty);
    }
}
