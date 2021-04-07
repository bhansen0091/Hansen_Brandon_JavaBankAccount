package com.javaoop.bankaccount;

import java.util.Random;

public class BankAccount {
	private String accountNumber;
	private double checking = 0;
	private double savings = 0;
	private static int numberOfAccounts = 0;
	private static double totalMoney = 0;
	
	private String makeAccountNumber() {
		Random random = new Random();
		
		String accountNo = "";
		for (int i = 0; i < 10; i++) {
			accountNo += (char) (48 + random.nextInt(10));
		}
		return accountNo;
	}

	public BankAccount(double checking, double savings) {
		super();
		this.accountNumber = makeAccountNumber();
		this.checking = checking;
		this.savings = savings;
		numberOfAccounts++;
		totalMoney = this.checking + this.savings;
	}

	public double getChecking() {
		return checking;
	}

	public double getSavings() {
		return savings;
	}

	public void deposit(String type, double amount) {
		if (type == "checking" || type == "Checking") {
			this.checking += amount;
			totalMoney += amount;
			System.out.printf("\n%.2f Deposited. Checking total: %.2f.", amount, this.checking);
//			System.out.println(amount + " Deposited");
		} else if (type == "savings" || type == "Savings") {
			this.savings += amount;
			totalMoney += amount;
			System.out.printf("\n%.2f Deposited. Checking total: %.2f.", amount, this.savings);
		} else {
			System.out.println("Checking or Savings... Try again...");
		}
	}

	public void withdraw(String type, double amount) {
		if (type == "checking" || type == "Checking") {
			if (amount > this.checking) {
				System.out.println("No...");
			} else {
				this.checking -= amount;
				totalMoney -= amount;
				System.out.printf("\n%.2f Withdrawn. Checking total: %.2f.\n", amount, this.checking);
			}			
		} else if (type == "savings" || type == "Savings") {
			if (amount > this.savings) {
				System.out.println("No...");
			} else {
				this.savings -= amount;
				totalMoney -= amount;
				System.out.printf("\n%.2f Withdrawn. Checking total: %.2f.", amount, this.savings);
			}			
		} else {
			System.out.println("Checking or Savings... Try again...");
		}
	}
	
	public static double seeTotal() {
		System.out.println(totalMoney);
		return totalMoney;
	}
	
	
	
	
}
