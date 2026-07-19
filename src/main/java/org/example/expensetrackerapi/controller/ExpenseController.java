package org.example.expensetrackerapi.controller;

import org.example.expensetrackerapi.DTO.CategoryTotalResponseDTO;
import org.example.expensetrackerapi.DTO.CreateExpenseDTO;
import org.example.expensetrackerapi.DTO.ExpenseResponseDTO;
import org.example.expensetrackerapi.Services.ExpenseService;
import org.example.expensetrackerapi.entity.Expense;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

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



    @GetMapping("/{id}/expenses")
    public List<ExpenseResponseDTO> showExpenseById(@PathVariable Integer id)
    {
        return expenseService.showExpenseOfUser(id);
    }

    @GetMapping("/{id}/total")
    public List<CategoryTotalResponseDTO> getTotalByUser(@PathVariable Integer id)
    {
        return expenseService.getTotalByUser(id);
    }

    @DeleteMapping("/expense/{id}")
    public String deleteExpense(@PathVariable Integer id)
    {
        expenseService.deleteExpenseByID(id);
        return "expense deleted";
    }

}
