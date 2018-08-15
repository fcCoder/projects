package com.ecjtu.hepeng.exercise2;

/**
 * a. ��������˽�ж������ԣ�firstName��lastName �� account��
 * b. ����һ�����й����������������������������������ԵĲ�����f �� l��
 * c. �����������д�ȡ�������ʸö������ԣ����� getFirstName �� getLastName
 *       ������Ӧ�����ԡ�
 * d. ���� setAccount �������� account ���Ը�ֵ��
 * e. ���� getAccount �����Ի�ȡ account ���ԡ�
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
