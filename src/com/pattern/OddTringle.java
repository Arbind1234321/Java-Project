package com.pattern;

public class OddTringle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int a=1;
		for(int i=1;i<=n;i++)
		{
			for(int  j=1;j<=i;j++)
			{
				System.out.print(a+" ");
				a=a+2;
			}
		   System.out.println();
		}

	}

}
