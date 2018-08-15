package com.ecjtu.hepeng.exercise6;

/**
 * 修改 Account 类；将 balance 属性的访问方式改为 protected 
 * b. 创建 SavingAccount 类，该类继承 Account 类
c. 该类必须包含一个类型为 double 的 interestRate 属性

d. 该类必须包括带有两个参数（balance 和 interest_rate）的公有构造器。
该 构 造器必须通过调用 super(balance)将 balance 参数传递给父类构造 器。
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
