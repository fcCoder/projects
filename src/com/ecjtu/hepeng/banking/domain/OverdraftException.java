package com.ecjtu.hepeng.banking.domain;

public class OverdraftException extends Exception{
	private double deficit;

	public double getDeficit() {
		return deficit;
	}
	
	public OverdraftException(String message,double deficit){
		this.deficit=deficit;
		System.out.println(message+deficit);
	}
}
