package Expense.expensemanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Expense.expensemanagement.entity.ExpenseEntity;
import Expense.expensemanagement.pojo.Expense;
import Expense.expensemanagement.repository.ExpenseRepository;
@Service
public class ExpenseServiceImpl implements ExpenseService {
	
@Autowired
	private ExpenseRepository expenseRepository;

	@Override
	public Expense saveExpense(Expense expense) {
		
		ExpenseEntity e = new ExpenseEntity();
		e.setId(expense.getId());
		e.setItem(expense.getItem());
		e.setAmount(expense.getAmount());
		
		
		expenseRepository.save(e);
		
		return expense;
	}

	@Override
	public Expense getExpense(Long 	id) {
		ExpenseEntity e = expenseRepository.getById(id);
		Expense e1 = new Expense();
		e1.setId(e.getId());
		e1.setItem(e.getItem());
		e1.setAmount(e.getAmount());
		
		return e1;
	}

	@Override
	public void updateExpense(Expense expense) {
		ExpenseEntity ex= expenseRepository.getById(expense.getId());
		ex.setId(expense.getId());
	    ex.setItem(expense.getItem());
		ex.setAmount(expense.getAmount());
		
		System.out.println("Update successful");	
	}

	@Override
	public void deleteExpense(Long id) {
		expenseRepository.deleteById(id);

		
	}
}