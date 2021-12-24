package Expense.expensemanagement.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="Expense")
public class ExpenseEntity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)	
private Long id;
private String item;
private float amount;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getItem() {
	return item;
}
public void setItem(String item) {
	this.item = item;
}
public float getAmount() {
	return amount;
}
public void setAmount(float amount) {
	this.amount = amount;
}

}
