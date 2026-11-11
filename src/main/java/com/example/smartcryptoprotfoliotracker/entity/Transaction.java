package com.example.smartcryptoprotfoliotracker.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;

    @ManyToOne
    @JoinColumn(name = "portfolio_id", nullable = false)
    private Portfolio portfolio;

    @Column(nullable = false)
    private String transactionType;

    @Column(nullable = false)
    private String assetSymbol;

    @Column(nullable = false)
    private Long transactionAmount;
}
