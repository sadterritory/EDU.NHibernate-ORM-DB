package com.study.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "books")
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Integer bookId;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "print_run", nullable = false)
    private Integer print_run;

    @Column(name = "publication_date", nullable = false)
    private LocalDate publication_date;

    @Column(name = "cost_price", nullable = false)
    private Float cost_price;

    @Column(name = "selling_price", nullable = false)
    private Float selling_price;

    @Column(name = "royalty", nullable = false)
    private Float royalty;

    @Override
    public String toString() {
        return String.format("%s %d %s %f %f %f",
                title, print_run, publication_date, cost_price, selling_price, royalty
        );
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        Books books = (Books) o;
        return getBookId() != null && Objects.equals(getBookId(), books.getBookId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
