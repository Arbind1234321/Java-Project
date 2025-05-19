package com.exception;

import java.io.File;

public class ExceptionDemo1 {
	
   static  String s=new String();
   static ExceptionDemo1 r=new ExceptionDemo1();
	public static void main(String[] args) {
	   eat();
	   System.out.println("Hello");
	  // File file =new File(".//file");

	}
	public static  void eat() throws ArithmeticException  {
	
		run();
		System.out.println(10/0);
		System.out.println("hii");
	}
	public static void run() {
		try {
		System.out.println(10/0);
		}
		catch (Exception e) {
			System.out.println("exception");
		}
	}

}
