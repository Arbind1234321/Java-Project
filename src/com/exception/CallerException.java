package com.exception;

public class CallerException {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	throw new ArithmeticException("i am not robot");

	}
	public static void m1() throws ArithmeticException {
		System.out.println(10/0);
		System.out.println("hi");
	}

}
