package com.study.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "contracts")
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class Contracts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contract_id")
    private Integer contractId;

    @Column(name = "contract_date", nullable = false)
    private LocalDate contract_date;

    @Column(name = "contract_duration", nullable = false)
    private Integer contract_duration;

    @Column(name = "is_terminated", nullable = false)
    private Boolean is_terminated;

    @Column(name = "termination_date")
    private LocalDate termination_date;

    @ManyToOne
    @JoinColumn(name = "writer_id", nullable = false)
    private Writers writer;

    @Override
    public String toString() {
        String terminationDateFormatted = termination_date != null ? termination_date.toString() : "N/A";
        return String.format("%s %d %s %s, %s",
                contract_date, contract_duration, is_terminated, terminationDateFormatted,
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
        Contracts contracts = (Contracts) o;
        return getContractId() != null && Objects.equals(getContractId(), contracts.getContractId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
