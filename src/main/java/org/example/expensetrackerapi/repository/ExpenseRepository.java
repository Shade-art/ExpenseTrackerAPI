package org.example.expensetrackerapi.repository;

import org.example.expensetrackerapi.DTO.CategoryTotalResponseDTO;
import org.example.expensetrackerapi.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense,Integer> {

    // generates a query to return list of expense of user
    List<Expense> findByUserId(Integer userId);

    @Query("""
SELECT new org.example.expensetrackerapi.DTO.CategoryTotalResponseDTO(
    e.category,
    SUM(e.amount)
)
FROM Expense e
WHERE e.user.id = :userId
GROUP BY e.category
""")
    List<CategoryTotalResponseDTO> getCategoryTotals(Integer userId);

}
