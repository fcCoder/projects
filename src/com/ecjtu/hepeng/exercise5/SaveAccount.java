package com.ecjtu.hepeng.exercise5;

/**
 * �޸� Account �ࣻ�� balance ���Եķ��ʷ�ʽ��Ϊ protected 
 * b. ���� SavingAccount �࣬����̳� Account ��
c. ����������һ������Ϊ double �� interestRate ����

d. ������������������������balance �� interest_rate���Ĺ��й�������
�� �� ��������ͨ������ super(balance)�� balance �������ݸ����๹�� ����
 * @author Administrator
 *
 */
public class SaveAccount extends Account{

	private double interestRate;
	
	
	public SaveAccount(double balance,double interest_rate) {
		super(balance,customer);
		this.interestRate=interest_rate;
		System.out.println("Creating an account with a "+balance+" balance and "+interestRate+"% interest.");
		
	}

}
