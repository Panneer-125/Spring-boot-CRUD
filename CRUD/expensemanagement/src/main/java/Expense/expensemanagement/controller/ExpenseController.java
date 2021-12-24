package Expense.expensemanagement.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Expense.expensemanagement.pojo.Expense;
import Expense.expensemanagement.service.ExpenseService;

@RestController
public class ExpenseController {

	@Autowired
	ExpenseService expenseService;
	@PostMapping(value="/save")
     public Expense saveExpense(@RequestBody Expense expense) {
		expense=expenseService.saveExpense(expense);
		return expense;
	}
	@GetMapping(value="/expense/{id}")
	public Expense getExpense(@PathVariable("id") Long id) {
		Expense exp=expenseService.getExpense(id);
		return exp;	
}
	@PutMapping(value="/expense")
	public Expense updateExpense(Expense expense){
		expenseService.updateExpense(expense);
		expense=expenseService.getExpense(expense.getId());
		return expense;	
}
	@DeleteMapping(value="/delete/{id}")
	public void deleteExpense(@PathVariable("id") Long id) {
		expenseService.deleteExpense(id);
}
}
