package com.ecjtu.hepeng.exercise7;

import com.ecjtu.hepeng.banking.domain.OverdraftException;

public class TestBanking {

	public static void main(String[] args) {
		Bank bank=Bank.getBanking();
		bank.addCustomer("Jane", "Smith");
		Customer c1=bank.getCustomer(0);
		Account account1=new CheckingAccount(200.0,500.0,c1);
		
		try {
			account1.withdraw(150);
			account1.deposit(22.5);
			account1.withdraw(147.62);
			account1.withdraw(470);
		} catch (OverdraftException e) {
			e.getMessage();
		} finally{
			System.out.println("Customer ["+c1+"]has a checking balance of "+account1.balance);
		}
		
		bank.addCustomer("Bryant", "Owen");
		Customer c2=bank.getCustomer(1);
		Account account2=new CheckingAccount(200, 0, c2);
		
		try {
			account2.withdraw(100);
			account2.deposit(25);
			account2.withdraw(175);
		} catch (OverdraftException e) {
			e.getMessage();
		} finally{
			System.out.println("Customer ["+c2+"]has a checking balance of "+account2.balance);
		}
		
	}

}
