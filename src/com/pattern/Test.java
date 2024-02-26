package com.pattern;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++)//for spaces
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{ 
			
				System.out.print((char)(k+64));
			}
			int a=i-1;
			for(int m=1;m<=i-1;m++)
			{
				System.out.print((char)(a+64));
				a--;
			}
			System.out.println();
		}

	}

}
