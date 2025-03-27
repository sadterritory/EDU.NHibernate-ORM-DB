package com.study.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;

import java.util.Objects;

@Entity
@Table(name = "writers")
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class Writers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "writer_id")
    private Integer writerId;

    @Column(name = "passport_num", nullable = false)
    private Integer passport_num;

    @Column(name = "last_name", nullable = false)
    private String  last_name;

    @Column(name = "first_name", nullable = false)
    private String first_name;

    @Column(name = "middle_name", nullable = false)
    private String  middle_name;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Override
    public String toString() {
        return String.format("%d %s %s %s %s %s",
                passport_num, last_name, first_name, middle_name, address, phone
        );
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        Writers writers = (Writers) o;
        return getWriterId() != null && Objects.equals(getWriterId(), writers.getWriterId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
