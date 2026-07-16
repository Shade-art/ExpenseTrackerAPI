package org.example.expensetrackerapi.Services;

import org.example.expensetrackerapi.DTO.CreateExpenseDTO;
import org.example.expensetrackerapi.entity.Expense;
import org.example.expensetrackerapi.entity.User;
import org.example.expensetrackerapi.exception.UserNotFoundException;
import org.example.expensetrackerapi.repository.ExpenseRepository;
import org.example.expensetrackerapi.repository.UserRepository;
import org.springframework.stereotype.Service;


@Service
public class ExpenseService {
    private final ExpenseRepository expenseRepository;
    private final UserRepository userRepository;

    ExpenseService(ExpenseRepository expenseRepository, UserRepository userRepository)
    {
        this.expenseRepository = expenseRepository;
        this.userRepository = userRepository;
    }
    public void saveExpense(CreateExpenseDTO expenseDTO,Integer id)
    {
        // importing the user object instead of just userId
        User user = userRepository.findById(id)
                .orElseThrow(() ->
                        new UserNotFoundException("User not found with id: " + id)); // custom exception throw

        Expense expense = new Expense();
        expense.setAmount(expenseDTO.getAmount());
        expense.setUser(user);
        expense.setRemarks(expenseDTO.getRemarks());
        expense.setCategory(expenseDTO.getCategory());
        expense.setExpenseDate(expenseDTO.getExpenseDate());
        expenseRepository.save(expense);
    }
}

