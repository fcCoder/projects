package com.ecjtu.hepeng.banking;

/**
 * a. ����һ��˽�ж������ԣ�balance��������Ա����������ʻ��ĵ�ǰ���� ��
 *         ʱ����
 * b. �� �� һ �� �� �� һ �� �� �� �� init_balance �� �� �� �� �� �� �� �� �� �� �� �� Ϊ
 *    balance ���Ը�ֵ��
 * c. ����һ�����з��� geBalance���÷������ڻ�ȡ������
 * d. ����һ�����з��� deposit,�÷�����ǰ������ӽ�
 * e. ����һ�����з��� withdraw �ӵ�ǰ����м�ȥ��
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
