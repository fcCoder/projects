package com.ecjtu.hepeng.exercise5;

/**
 * ��������˵������� Bank �ࡣ Bank ���������������ͻ���Ĺ�ϵ���� Customer ���������ʵ��������ϻ��Ĺ�ϵ����Ҫ����һ���������������� �� �е�ǰ�ж��ٿͻ���

a. ���� Bank��

b. Ϊ Bank �� �� �� �� �� �� �� �� customers(Customer��������� ) ��
numberOfCustomers(������������һ�� customers ��������)

c. ��ӹ��й��������Ժ��ʵ����ߴ磨���ٴ��� 5����ʼ�� customers ���顣

d. ��� addCustomer �������÷����������ղ����� �գ����� ����һ���µ�
Customer
����Ȼ������ŵ� customer �����С�������� numberofCustomers
���Ե�ֵ�� 1��


e. ��� getNumOfCustomers ���ʷ����������� numberofCustomers �� ��ֵ��

f.  ��� getCustomer�������������������index������صĿͻ���

g. ���벢���� TestBanking ���򡣿��Կ���������������
Customer [1] is Simms,Jane
Customer [2] is Bryant,Owen
Customer [3] is Soley,Tim 
Customer [4] is Soley,Maria
 * @author Administrator
 *
 */
public class Bank {

	//private Customer customer;
	private Customer[] customers;
	private  int numberOfCustomers;
	
	public Bank(){
		numberOfCustomers=0;
		customers=new Customer[5];
	}
	
	public void addCustomer(String f,String l){
		customers[numberOfCustomers]=new Customer(f, l);
		numberOfCustomers++;
	}
	
	public int getNumberOfCustomers(){
		return this.numberOfCustomers;
	}
	
	public Customer getCustomer(int numberOfCustomers){
		//System.out.println("Customer ["+(numberOfCustomers+1)+"] is "+customers[numberOfCustomers]);
		System.out.println("Creating the customer "+customers[numberOfCustomers]+".");
		return customers[numberOfCustomers];
	}
}
