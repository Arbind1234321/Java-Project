package com.kunal;

public class Swap {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		//Integer a=2;
		//Integer b=3;
		swap(a,b);
		
	}
	static void swap(Integer a,Integer b)
	{
		Integer temp=a;
		a=b;
		b=temp;
		System.out.println("a: "+a+"   b: "+b);

	}

}
