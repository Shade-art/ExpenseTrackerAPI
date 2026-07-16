package org.example.expensetrackerapi.repository;

import org.example.expensetrackerapi.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExpenseRepository extends JpaRepository<Expense,Integer> {
    List<Expense> findByUserId(Integer userId);
}
