package com.study.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "book_authors")
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class BookAuthors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_authors_id")
    private Integer bookAuthorsId;

    @ManyToOne
    @JoinColumn(name = "book_id", nullable = false)
    private Books book;

    @ManyToOne
    @JoinColumn(name = "writer_id", nullable = false)
    private Writers writer;

    @Override
    public String toString() {
        return String.format("%s, %s",
                String.join(",", String.valueOf(book.getTitle()), book.getPublication_date().toString(), Float.toString(book.getSelling_price())),
                String.join(",", String.valueOf(writer.getLast_name()), writer.getFirst_name(), writer.getPhone())
        );
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        BookAuthors bookAuthors = (BookAuthors) o;
        return getBookAuthorsId() != null && Objects.equals(getBookAuthorsId(), bookAuthors.getBookAuthorsId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
