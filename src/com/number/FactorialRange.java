package com.number;

import java.util.Scanner;

public class FactorialRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=6;
		for(int i=1;i<=n;i++)
		{
			int fact=getFactorial(i);
			System.out.println(i+" factorial is :"+fact);
		}

	}

	private static int getFactorial(int n) {
		   int p=1;
		   for(int j=1;j<=n;j++)
		   {
			   p=p*j;
		   }
		return p;
	}

}
