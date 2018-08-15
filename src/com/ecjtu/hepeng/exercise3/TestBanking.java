package com.ecjtu.hepeng.exercise3;

public class TestBanking {
	
	public static void main(String[] args) {
		Customer c=new Customer("Jane","Smith");
		Account account=new Account(500.0);
		c.getAccount();
		account.withdraw(150.0);
		account.deposit(22.5);
		account.withdraw(47.62);
		account.withdraw(400.0);
		account.getBalance(c);
	}
	
	
}
