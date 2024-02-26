package com.number;

import java.util.Scanner;

public class CountNumDivBY3And5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int count=0;
		while(num>0)
		{
		   if(num%3==0&&num%5==0)
		   {
			   count++;
		   }
			num--;
		}
		System.out.println(count);

	}

}
