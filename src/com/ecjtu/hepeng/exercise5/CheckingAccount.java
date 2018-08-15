package com.ecjtu.hepeng.exercise5;

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
	
	/*public CheckingAccount(double balance,Customer customer) {
		super(balance,customer);	
	}*/
	
	public CheckingAccount(double balance,double protect){
		super(balance,customer);
		this.overdraftProtection=protect;
		if(overdraftProtection==0){
			System.out.println("Creating an account with a "+balance+" balance and no overdraft protection.");
		}else{
		System.out.println("Creating an account with a "+balance+" balance and "+overdraftProtection+" in overdraft protection.");
		}
	}
	
	public boolean withdraw(double amt){
		boolean b=false;
		if(balance>=amt||(balance+overdraftProtection)>amt){
			balance-=amt;
			if(balance<0){
				balance=0.0;
			}
			b=true;
		}
		System.out.println("�����٣�"+amt+" :"+b);
		return b;
		
	}

}
