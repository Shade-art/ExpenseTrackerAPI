package org.example.expensetrackerapi.repository;

import org.example.expensetrackerapi.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExpenseRepository extends JpaRepository<Expense,Integer> {

    // generates a query to return list of expense of user
    List<Expense> findByUserId(Integer userId);
}
