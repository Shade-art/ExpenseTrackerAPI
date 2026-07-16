package org.example.expensetrackerapi.controller;

import org.example.expensetrackerapi.DTO.CreateExpenseDTO;
import org.example.expensetrackerapi.Services.ExpenseService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class ExpenseController {
   private final ExpenseService expenseService;
   ExpenseController(ExpenseService expenseService)
   {
       this.expenseService = expenseService;
   }
    @PostMapping("/{id}/expenses")
    public String addExpense(@RequestBody CreateExpenseDTO expense , @PathVariable Integer id)
    {
        expenseService.saveExpense(expense,id);
        return "Expense ADDED";
    }
}
