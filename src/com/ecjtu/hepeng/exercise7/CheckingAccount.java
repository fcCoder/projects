package com.ecjtu.hepeng.exercise7;

import com.ecjtu.hepeng.banking.domain.OverdraftException;

/**
 * 1． CheckingAccount 类必须扩展 Account 类

2． 该类必须包含一个类型为 double 的 overdraftProtection 属性。

3． 该类必须包含一个带有参数（balance）的共有构造器。该构造器必须通过调 用 super(balance)将 balance 参数传递给父类构造器。


4． 给类必须包括另一个带有两个参数（balance 和 protect）的公有构造器。该 构造器必须通过调用 super(balance)并设置 overdragtProtection 属性， 将 balance 参数传递给父类构造器。

5． CheckingAccount 类必须覆盖 withdraw 方法。此方法必须执行下列检 查。如 果当前余额足够弥补取款 amount,则正常进行。如果不够弥补但是 存在透支 保护，则尝试用 overdraftProtection 得值来弥补该差值
（balance-amount）. 如果弥补该透支所需要的金额大于当前的保护级别。 则整个交易失败，但余 额未受影响。
 * @author Administrator
 *
 */
public class CheckingAccount extends Account {

	private double overdraftProtection;
	Customer c;
	private double overdraft=0;	//已透支的钱
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
