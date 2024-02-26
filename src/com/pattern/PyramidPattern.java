package com.pattern;

public class PyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=4;
		int st=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			//for(int k=1;k<=2*i-1;k++)
			for(int k=1;k<=st;k++)
			{
				System.out.print("*");
			}
			st=st+2;
			System.out.println();
		}

	}

}
