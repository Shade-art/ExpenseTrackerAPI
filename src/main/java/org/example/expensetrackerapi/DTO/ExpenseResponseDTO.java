package org.example.expensetrackerapi.DTO;

import java.math.BigDecimal;
import java.time.LocalDate;

public record ExpenseResponseDTO(
        BigDecimal amount,
        String remarks,
        String category,
        LocalDate expenseDate
) {}
