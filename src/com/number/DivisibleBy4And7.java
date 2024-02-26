package com.number;

import java.util.Scanner;

public class DivisibleBy4And7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		if(num%4==0&&num%7==0)
		{
			System.out.println("Fizz And Buzz");
		}
		else if (num%7==0) 
		{
		  System.out.println("Buzz");	
		}
		else if (num%4==0) {
			System.out.println("Fizz");
		}
		else
		{
			System.out.println("Number not divisible by 7 and 4");
		}
      
	}

}
