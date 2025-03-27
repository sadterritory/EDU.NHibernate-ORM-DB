package com.study.dao;

import com.study.entity.BookAuthors;

import java.time.LocalDate;
import java.util.List;

public class BookAuthorsDao extends AbstractDao<BookAuthors>{

    public BookAuthorsDao() {
        super(BookAuthors.class);
    }

    public List<BookAuthors> findByBookTitle(String title) {
        return findByField("books.title", title);
    }

    public List<BookAuthors> findByBookPublicationDate(LocalDate publication_date) {
        return findByField("books.publication_date", publication_date);
    }

    public List<BookAuthors> findByBookSellingPrice(Float selling_price) {
        return findByField("books.selling_price", selling_price);
    }

    public List<BookAuthors> findByAuthorLastName(String last_name) {
        return findByField("writers.last_name", last_name);
    }

    public List<BookAuthors> findByAuthorFirstName(String first_name) {
        return findByField("writers.first_name", first_name);
    }

    public List<BookAuthors> findByAuthorPhone(String phone) {
        return findByField("writers.phone", phone);
    }

}
