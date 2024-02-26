package com.programming;

import java.util.Scanner;

public class SumOfNaturalNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		int sum=0;
		while (n!=0)
		{
		 sum= sum+n;
		 n--;
		}
		System.out.println("Sum of numer :"+sum);
	}

}
