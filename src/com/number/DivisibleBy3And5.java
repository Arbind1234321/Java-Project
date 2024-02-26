package com.number;

import java.util.Scanner;

public class DivisibleBy3And5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		
		
	
			if(num%3==0&&num%5==0)
			{
			System.out.println("number divisible by 3 and 5");
			}
			else {
				System.out.println("number not divisible by 3 and 5");
			}
	}

}
