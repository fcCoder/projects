package com.ecjtu.hepeng.exercise4;

/**
 * a. 声明一个私有对象属性：balance，这个属性保留了银行帐户的当前（或 即
 *         时）余额。
 * b. 声 明 一 个 带 有 一 个 参 数 （ init_balance ） 的 公 有 构 造 器 ， 这 个 参 数 为
 *    balance 属性赋值。
 * c. 声明一个公有方法 geBalance，该方法用于获取经常余额。
 * d. 声明一个公有方法 deposit,该方法向当前余额增加金额。
 * e. 声明一个公有方法 withdraw 从当前余额中减去金额。
 * 
 * 修改 Account 类
 * a. 修改 deposit 方法返回 true（意味所有存款是成功的）。
 * b. 修改 withdraw 方法来检查提款数目是否大于余额。
 *    如果amt 小于 balance, 则从余额中扣除提款数目并返回 true ，否则余额不变返回 false。
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
		System.out.println("Deposit: "+amt+" :true");
	}
	
	public void withdraw(double amt){
		boolean b=false;
		if(balance>amt){
			balance-=amt;
			b=true;
		}
		
		System.out.println("Withdraw: "+amt+" :"+b);
	}
}
