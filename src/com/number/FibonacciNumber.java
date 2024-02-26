package com.number;

import java.util.Scanner;

public class FibonacciNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int a=0;
		int b=1;
	
		
		//System.out.print(a+" "+b+" ");
		
		for(int i=3;i<=n;i++)
		{
		int temp=b;
		b=a+b;
		a=temp;
		}
        System.out.println(b);

	}

}
