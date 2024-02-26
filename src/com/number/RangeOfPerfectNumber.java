package com.number;

import java.util.Scanner;

public class RangeOfPerfectNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number ");
		int num=sc.nextInt();
		
		for(int n=1;n<=num;n++)
		{
			int sum=1;
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					sum=sum+i;
				}
			}
			if(sum==n)
			{
				System.out.println(n+" is perfect number");
			}
		}
		
	} 

}
