package com.ecjtu.hepeng.exercise4;

public class TestBanking {
	
	public static void main(String[] args) {
		Bank bank=new Bank();
		bank.addCustomers("Jane", "Smith");
		bank.addCustomers("Bryant", "Owen");
		bank.addCustomers("Soley", "Tim");
		bank.addCustomers("Soley", "Maria");
		
		for(int i=0;i<4;i++){
			System.out.println("Customer ["+(i+1)+"] is "+bank.getCustomer(i));
		}
	}
	
	
}
