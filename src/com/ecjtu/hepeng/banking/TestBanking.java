package com.ecjtu.hepeng.banking;

public class TestBanking {
	
	public static void main(String[] args) {
		Account account=new Account(500.0);
		account.withdraw(150.0);
		account.deposit(22.5);
		account.withdraw(47.62);
		account.getBalance();
	}
	
	
}
