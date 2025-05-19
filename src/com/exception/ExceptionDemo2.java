package com.exception;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		try {
	//Thread.sleep(100000);
			//System.out.println(10/0);
			String s=null;
			System.out.println(s.length());
			//int [] s= {2,4};
			//s[4]=0;
		}
		catch (ArithmeticException  | NullPointerException |ArrayIndexOutOfBoundsException e) {
      System.out.println(e);
		}

	}

}
