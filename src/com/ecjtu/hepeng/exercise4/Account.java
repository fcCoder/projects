package com.ecjtu.hepeng.exercise4;

/**
 * a. ����һ��˽�ж������ԣ�balance��������Ա����������ʻ��ĵ�ǰ���� ��
 *         ʱ����
 * b. �� �� һ �� �� �� һ �� �� �� �� init_balance �� �� �� �� �� �� �� �� �� �� �� �� Ϊ
 *    balance ���Ը�ֵ��
 * c. ����һ�����з��� geBalance���÷������ڻ�ȡ������
 * d. ����һ�����з��� deposit,�÷�����ǰ������ӽ�
 * e. ����һ�����з��� withdraw �ӵ�ǰ����м�ȥ��
 * 
 * �޸� Account ��
 * a. �޸� deposit �������� true����ζ���д���ǳɹ��ģ���
 * b. �޸� withdraw ��������������Ŀ�Ƿ������
 *    ���amt С�� balance, �������п۳������Ŀ������ true ���������䷵�� false��
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
