package com.ecjtu.hepeng.exercise5;

public class TestBanking {
	
	public static void main(String[] args) {

		Account a = null;
		Bank bank=new Bank();
		bank.addCustomer("Smith", "Jane");
		bank.addCustomer("Bryant", "Owen");
		bank.addCustomer("Soley", "Tim");
		bank.addCustomer("Soley", "Maria");
		
		for(int i=0;i<4;i++){
		
			Customer user=bank.getCustomer(i);
			if(i==0){
				a=new SaveAccount(500.0, 3);
			}else if(i==1){
				a=new CheckingAccount(500.0,0);
			}else if(i==2){
				a=new CheckingAccount(500.0,500.0);
				
			}else if(i==3){
				System.out.println("Maria shares her Checking Account with her husband Tim.");
				a.deposit(150);
				a.withdraw(750);
				a.getBalance(user);
				break;
			}
			
			a.withdraw(150.00);
			a.deposit(22.50);
			a.withdraw(47.62);
			a.withdraw(400.0);
			a.getBalance(user);
			System.out.println();
			
		}
	}
}
