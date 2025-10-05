package com.tnsif.excep;

public class Throwkey {

	public static void main(String[] args) {
		int age=4;
		if(age<18)
			throw new ArithmeticException("NotEligible");
		else 
			System.out.println("eligible");
	}
}
