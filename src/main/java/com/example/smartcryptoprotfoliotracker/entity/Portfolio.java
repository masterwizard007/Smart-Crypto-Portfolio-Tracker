package com.example.smartcryptoprotfoliotracker.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "porfolios")
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long porfolioId;

    @Column(nullable = false)
    private String porfolioName;

    @ManyToOne()
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @OneToMany(mappedBy = "portfolio", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Transaction> transactionLedger;
}