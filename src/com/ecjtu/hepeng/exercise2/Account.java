package com.ecjtu.hepeng.exercise2;

/**
 * a. 声明三个私有对象属性：firstName、lastName 和 account。
 * b. 声明一个公有构造器，这个构造器带有两个代表对象属性的参数（f 和 l）
 * c. 声明两个公有存取器来访问该对象属性，方法 getFirstName 和 getLastName
 *       返回相应的属性。
 * d. 声明 setAccount 方法来对 account 属性赋值。
 * e. 声明 getAccount 方法以获取 account 属性。
 * @author Administrator
 *
 */
public class Account {

	private double balance;
	Customer customer;
	
	public Account(double init_balance){
		this.balance=init_balance;
		System.out.println("Creating an account with a "+init_balance+" balance.");
	}
	
	public double getBalance(Customer customer){
		System.out.println("Customer "+customer.toString()+" has a balance of "+balance+".");
		return balance;
	}
	
	public void deposit(double amt){
		balance+=amt;
		System.out.println("Deposit: "+amt);
	}
	
	public void withdraw(double amt){
		balance-=amt;
		System.out.println("Withdraw: "+amt);
	}
}
