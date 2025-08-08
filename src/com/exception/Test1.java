package com.exception;

public class Test1 {
	public  static void divide(int a,int b) {
		if(b==0)
		{
			throw new RunTimeException("can not divide by zero");
		}
		System.out.println(a/b);
	}

	public static void main(String[] args) {
		 divide(10, 0);

	}

}
