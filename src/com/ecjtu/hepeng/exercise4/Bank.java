package com.ecjtu.hepeng.exercise4;

/**
 * a. ���� Bank��
 * b. Ϊ Bank �� �� �� �� �� �� �� �� customers(Customer��������� ) ��
 *    numberOfCustomers(������������һ�� customers ��������)
 * c. ��ӹ��й��������Ժ��ʵ����ߴ磨���ٴ��� 5����ʼ�� customers ���顣
 * d. ��� addCustomer �������÷����������ղ����� �գ����� ����һ���µ�Customer
 *    ����Ȼ������ŵ� customer �����С�������� numberofCustomers���Ե�ֵ�� 1��
 * e. ��� getNumOfCustomers ���ʷ����������� numberofCustomers �� ��ֵ��
 * f. ��� getCustomer�������������������index������صĿͻ���
 * @author Administrator
 *
 */
public class Bank {
	private Customer[] customers;
	private int numberOfCustomer=0;
	
	public Bank(){
		customers=new Customer[5];
	}
	
	public void addCustomers(String f,String l){
		Customer customer=new Customer(f,l);
		customers[numberOfCustomer++]=customer;
	}
	
	public int getNumOfCustomers(){
		return numberOfCustomer;
		
	}
	
	public Customer getCustomer(int i){
		return customers[i];
		
	}
}
