package org.example.expensetrackerapi.DTO;

import java.math.BigDecimal;

public record CategoryTotalResponseDTO(
        String category,
        BigDecimal total
) {}
