package com.number;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number");
		
		int num=sc.nextInt();
		int p=1;
		for(int i=num;i>0;i--)
		{
			p=p*i;
		}
		System.out.println(p);

	}

}
