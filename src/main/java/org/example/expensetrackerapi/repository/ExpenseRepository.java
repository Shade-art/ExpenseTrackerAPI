package org.example.expensetrackerapi.repository;

import org.example.expensetrackerapi.entity.Expenses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expenses,Integer> {
}
