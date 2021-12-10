package ru.pcs.web.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "customer")
public class User {
    public enum Role {
        ADMIN, CUSTOMER
    }

    @Enumerated(value = EnumType.STRING)
    private Role role;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @Column(unique = true)
    private String email;

    private String hashPassword;

    @OneToMany(mappedBy = "customer")
    private List<Booking> bookings;
}
