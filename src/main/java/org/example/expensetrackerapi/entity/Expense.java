package org.example.expensetrackerapi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    private BigDecimal amount;
    private String remarks;
    private String category;
    private LocalDate expenseDate;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

}
