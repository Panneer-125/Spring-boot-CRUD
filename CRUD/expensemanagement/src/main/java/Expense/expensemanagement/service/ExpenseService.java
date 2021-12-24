package Expense.expensemanagement.service;
import java.util.List;
import Expense.expensemanagement.pojo.Expense;
public interface ExpenseService {
Expense saveExpense(Expense Expense);
Expense getExpense(Long id);
void updateExpense(Expense expense);
void deleteExpense(Long id);

}
