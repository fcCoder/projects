package com.ecjtu.hepeng.banking;

/**
 * a. 声明一个私有对象属性：balance，这个属性保留了银行帐户的当前（或 即
 *         时）余额。
 * b. 声 明 一 个 带 有 一 个 参 数 （ init_balance ） 的 公 有 构 造 器 ， 这 个 参 数 为
 *    balance 属性赋值。
 * c. 声明一个公有方法 geBalance，该方法用于获取经常余额。
 * d. 声明一个公有方法 deposit,该方法向当前余额增加金额。
 * e. 声明一个公有方法 withdraw 从当前余额中减去金额。
 * @author Administrator
 *
 */
public class Account {

	private double balance;
	
	
	public Account(double init_balance){
		this.balance=init_balance;
		System.out.println("Creating an account with a "+init_balance+" balance.");
	}
	
	public double getBalance(){
		System.out.println("The account has a balance of "+balance+".");
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
