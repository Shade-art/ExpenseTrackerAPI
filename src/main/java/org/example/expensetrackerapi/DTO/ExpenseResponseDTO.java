package org.example.expensetrackerapi.DTO;

import java.math.BigDecimal;
import java.time.LocalDate;


// very important to kill the infinite user to expense to user cycle as it does not have User user
public record ExpenseResponseDTO(
        BigDecimal amount,
        String remarks,
        String category,
        LocalDate expenseDate
) {}
