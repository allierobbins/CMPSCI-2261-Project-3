package robbinsProject3;

import java.util.Date;

public class Account {

	private int ID;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated = new java.util.Date();
	
	Account() {
		ID = 0;
		balance = 0;
		annualInterestRate = 0;
	}
	
	Account(int i, double b) {
		ID = i;
		balance = b;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setID(int i) {
		ID = i;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double b) {
		balance = b;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public void setAnnualInterestRate(double a) {
		annualInterestRate = a;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
	
	public double getMonthlyInterestRate() {
		double monthlyInterestRate = annualInterestRate / 12;
		return monthlyInterestRate;
	}
	
	public double getMonthlyInterest() {
		return (balance * annualInterestRate) / 12;
	}
	
	public void withdraw(int w) {
		balance -= w;
	}
	
	public void deposit(int d) {
		balance += d;
	}
}
