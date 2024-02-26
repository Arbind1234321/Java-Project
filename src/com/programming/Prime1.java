package com.programming;

import java.util.Scanner;

public class Prime1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int num=sc.nextInt();
		boolean rs=isPrime(num);
		if(rs)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("not prime");
		}
		

	}

	 public static boolean isPrime(int n) {
		 for(int i=2;i<n/2;i++)
		 {
			 if(n%i==0)
			 {
				 return false;
			 }
		 }
		
		return true;
	}

}
