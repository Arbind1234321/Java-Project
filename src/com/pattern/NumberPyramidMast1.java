package com.pattern;

public class NumberPyramidMast1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		int sps=1;
		for(int i=1;i<=2*n+1;i++)
		{
			System.out.print(i);
		}
		System.out.println();
		for(int i=1;i<=n;i++)
		{      int a=1;
			for(int j=1;j<=n-i+1;j++)
			{
				System.out.print(a);
				a++;
			}
			for(int k=1;k<=sps;k++) {
				System.out.print(" ");
				a++;
			}
			for(int j=1;j<=n-i+1;j++)
			{
				System.out.print(a);
				a++;
			}
			sps+=2;
			
			System.out.println();
		}

	}

}
