package com.pattern;

public class AlphabetStar {

	public static void main(String[] args) {
		int n=5;
		printx(n);

	}
	public static void printx(int n)
	{
		for(int i=1;i<=n;i++)
		{	
			for(int j=1;j<=n;j++)
			{
				if(i==j||i+j==n+1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(" ");
				}
					
			}
		System.out.println();
		}
	}

}
