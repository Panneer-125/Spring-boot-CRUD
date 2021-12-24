package Expense.expensemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Expense.expensemanagement.entity.ExpenseEntity;
import Expense.expensemanagement.pojo.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<ExpenseEntity, Long>{


}