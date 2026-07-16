package org.example.expensetrackerapi.DTO;


import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class CreateExpenseDTO {

    private BigDecimal amount;

    private String remarks;

    private String category;

    private LocalDate expenseDate;
}