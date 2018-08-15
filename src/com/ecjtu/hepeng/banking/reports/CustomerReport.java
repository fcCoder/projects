package com.ecjtu.hepeng.banking.reports;

import com.ecjtu.hepeng.exercise6.Account;
import com.ecjtu.hepeng.exercise6.Bank;
import com.ecjtu.hepeng.exercise6.CheckingAccount;
import com.ecjtu.hepeng.exercise6.Customer;
import com.ecjtu.hepeng.exercise6.SaveAccount;

public class CustomerReport {
	
	public CustomerReport(){
		Bank bankInstance=Bank.getBanking();
		Account account=new Account(0);
		bankInstance.addCustomer("Jane", "Smith");
		bankInstance.addCustomer("Bryant", "Owen");
		bankInstance.addCustomer("Soley", "Tim");
		bankInstance.addCustomer("Soley", "Maria");
		
		System.out.println("  CUSTOMER REPORT");
		System.out.println("=======================");
		
		System.out.println("Customer:"+bankInstance.getCustomer(0));
		account=new SaveAccount(500);
		account=new CheckingAccount(200);
		System.out.println();
		
		System.out.println("Customer:"+bankInstance.getCustomer(1));
		account=new CheckingAccount(200);
		System.out.println();
		
		System.out.println("Customer:"+bankInstance.getCustomer(2));
		account=new SaveAccount(1500);
		account=new CheckingAccount(200);
		System.out.println();
		
		System.out.println("Customer:"+bankInstance.getCustomer(3));
		account=new CheckingAccount(200);
		account=new SaveAccount(150);
		
	}
	
}
