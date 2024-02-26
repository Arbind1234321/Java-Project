package com.number;

public class SwapingNumber {

	public static void main(String[] args) {
		
		int a=20;
		int b=30;
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a);
		System.out.println(b);

	}

}
