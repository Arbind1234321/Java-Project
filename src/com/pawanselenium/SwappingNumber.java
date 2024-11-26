package com.pawanselenium;

public class SwappingNumber {

	public static void main(String[] args) {
		int a=13;
		int b=6;
		sawap(a, b);

	}
	public static  void sawap(int a,int b)
	{
//		int temp=a;
//		a=b;
//		b=temp;
		 a=a+b;
		b=a-b;
		a=a-b;
	
		System.out.println("a : "+a+ "  b: "+b);
	}

}
