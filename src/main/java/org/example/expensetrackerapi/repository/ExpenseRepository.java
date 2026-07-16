package org.example.expensetrackerapi.repository;

import org.example.expensetrackerapi.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense,Integer> {
}
