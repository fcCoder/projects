package com.ecjtu.hepeng.exercise7;

import com.ecjtu.hepeng.banking.domain.OverdraftException;

/**
 * 
 * @author Administrator
 *
 */
public class Account {
	
	protected static Customer customer;
	protected double balance;
	//private Customer[] customers;
	
	public Account(double balance){
		this.balance=balance;
		//this.customer=customer;
		
		//System.out.println("Creating an account with a "+balance+" balance");
	}
	
	public void setAccount(Customer customer){
		this.customer=customer;
	}
	
	public double getBalance(Customer c){
		System.out.println(c.toString()+" has a balance of "+balance);
		return balance;
	}
	
	public double deposit(double amt){
		this.balance+=amt;
		System.out.println("”‡∂Ó‘ˆº”£∫"+amt+" :true");
		return balance;
	}
	
	public void withdraw(double amt)throws OverdraftException{
		if(amt<=balance){
			this.balance-=amt;
		}else{
			throw new OverdraftException("”‡∂Ó≤ª◊„", 0.0);
		}
		//System.out.println("”‡∂Óºı…Ÿ£∫"+amt+" :"+b);
	}
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
