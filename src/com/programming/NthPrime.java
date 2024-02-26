package com.programming;

import java.util.Scanner;

public class NthPrime {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("which prime number you want");
		int num=scanner.nextInt();
		int i=1;
		//for( i=2;i<=num;i++)
		while(num>0)
		{
			i++;
			if(isprime(i))
			{
				num--;
			}
			
		}
		System.out.println(i);
		

	}

	public  static boolean isprime(int n) {
		for(int j=2;j<=n/2;j++)
		{
			if(n%j==0)
			return false;
		}
		return true;
	}

}

