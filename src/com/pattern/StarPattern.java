package com.pattern;

public class StarPattern {

	public static void main(String[] args) {
		//Pattern1(5);
		pattern2(3);
		

	}
	static void Pattern1(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==0 || j==(n-1)||i==2 )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	static void pattern2(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=2*n-1;j++)
			{
				System.out.print("* ");
			}
			System.out.println();	
				
		}
	}
}

