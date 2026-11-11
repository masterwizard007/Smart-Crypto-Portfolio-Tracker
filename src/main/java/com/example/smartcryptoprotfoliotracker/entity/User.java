package com.example.smartcryptoprotfoliotracker.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column( nullable = false)
    private String name;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Portfolio> portfolios;
}
