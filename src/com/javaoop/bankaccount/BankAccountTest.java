package com.javaoop.bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount ba1 = new BankAccount(100, 200);
		
		BankAccount.seeTotal();
		
		System.out.println(ba1.getChecking());
		System.out.println(ba1.getSavings());
		
		ba1.deposit("", 50.00);
		ba1.deposit("checking", 100.00);
		ba1.deposit("Savings", 100.00);
		ba1.withdraw("savings", 100.00);
		ba1.withdraw("checking", 100.00);
		
		
		System.out.println(ba1.getChecking());
		System.out.println(ba1.getSavings());
		
	}

}
