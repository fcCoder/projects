package com.ecjtu.hepeng.exercise6;

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
	
	
	public SaveAccount(double balance) {
		super(balance);
		
		System.out.println("    Savings Account:current balance is $"+balance);
		
	}

}
