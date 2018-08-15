package com.ecjtu.hepeng.exercise3;

import com.ecjtu.hepeng.exercise5.Account;

public class Customer {
	private String firstName;
	private String lastName;
	private Account account;
	
	public Customer(String f,String l){
		this.firstName=f;
		this.lastName=l;
		System.out.println("Creating the customer "+this.lastName+" "+this.firstName+".");
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public void setFirstName(String f){
		this.firstName=f;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public void setLastName(String l){
		this.lastName=l;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return lastName + ", " + firstName;
	}
}
