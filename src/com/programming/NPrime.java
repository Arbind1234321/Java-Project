package com.programming;

import java.util.Scanner;

public class NPrime {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("How many prime you want:");
		int no=scanner.nextInt();
		for(int i=2;no>0;i++)
		{
			if(isprime(i))
			{
				System.out.print(i);
				if(no>1)
				{
			    System.out.print(",");
				}
				no--;
				
			}
		}
		scanner.close();

	}

	public static boolean isprime(int n) {
		for(int j=2;j<=n/2;j++)
		{
		    if(n%j==0)
		    {
		    	return false;
		    }
		}
		return true;
	}

}
