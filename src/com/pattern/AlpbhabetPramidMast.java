package com.pattern;

public class AlpbhabetPramidMast {

	public static void main(String[] args) {
		int n=3;
		int sps=1;
		for(int i=1;i<=2*n+1;i++)//for first line
		{
			System.out.print((char)(i+64));
		}
		System.out.println();
		for(int i=1;i<=n;i++)// for second line
		{
			int a=1;
			for(int j=1;j<=n-i+1;j++)
			{
				System.out.print((char)(a+64));
				a++;
			}
			for(int k=1;k<=sps;k++) {
				System.out.print(" ");
				a++;
			}
			for(int j=1;j<=n-i+1;j++)
			{
				System.out.print((char)(a+64));
				a++;
			}
			sps+=2;
			
			System.out.println();
		}


	}

}
