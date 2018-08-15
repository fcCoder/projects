package com.ecjtu.hepeng.exercise7;

import com.ecjtu.hepeng.banking.domain.OverdraftException;

/**
 * 1�� CheckingAccount �������չ Account ��

2�� ����������һ������Ϊ double �� overdraftProtection ���ԡ�

3�� ����������һ�����в�����balance���Ĺ��й��������ù���������ͨ���� �� super(balance)�� balance �������ݸ����๹������


4�� ������������һ����������������balance �� protect���Ĺ��й��������� ����������ͨ������ super(balance)������ overdragtProtection ���ԣ� �� balance �������ݸ����๹������

5�� CheckingAccount ����븲�� withdraw �������˷�������ִ�����м� �顣�� ����ǰ����㹻�ֲ�ȡ�� amount,���������С���������ֲ����� ����͸֧ ������������ overdraftProtection ��ֵ���ֲ��ò�ֵ
��balance-amount��. ����ֲ���͸֧����Ҫ�Ľ����ڵ�ǰ�ı������� ����������ʧ�ܣ����� ��δ��Ӱ�졣
 * @author Administrator
 *
 */
public class CheckingAccount extends Account {

	private double overdraftProtection;
	Customer c;
	private double overdraft=0;	//��͸֧��Ǯ
	/*public CheckingAccount(double balance,Customer customer) {
		super(balance,customer);	
	}*/
	
	public CheckingAccount(double balance,double protect,Customer c){
		super(balance);
		this.overdraftProtection=protect;
		this.c=c;
		/*if(overdraftProtection==0){
			System.out.println("Creating an account with a "+balance+" balance and no overdraft protection.");
		}else{
		System.out.println("Creating an account with a "+balance+" balance and "+overdraftProtection+" in overdraft protection.");
		}*/
		System.out.println("Customer ["+c+"]has a checking balance of "+balance+" with a "+protect+" overdraft protection");
	}
	
	public double deposit(double amt){
		this.balance+=amt;
		System.out.println("Checking Acct["+c+"]: deposit "+amt);
		return balance;
	}
	
	public void withdraw(double amt)throws OverdraftException{
		
		if(overdraft<0){
			if((overdraft+overdraftProtection)>=amt){
				overdraft-=amt;
			}else{
				System.out.println("Checking Acct["+c+"]: withdraw "+amt);
				throw new OverdraftException("Exception: Insufficient funds for overdraft protection Deifcit:", amt);
			}
		
		}else if(balance>=amt||(balance+overdraftProtection)>amt){
					balance-=amt;
					if(balance<0){
						overdraft=balance;
						balance=0.0;
					}
				System.out.println("Checking Acct["+c+"]: withdraw "+amt);
			
		}else if(overdraftProtection==0){
			throw new OverdraftException("Exception: no overdraft protection Deficit:", amt-balance);
		}
	}

}
