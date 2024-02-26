package com.pattern;

public class SqureMast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=4;
		int n=2*m-1;
		
	for(int i=0;i<=n;i++)
	{
		for(int j=0;j<=n;j++)
		{
			int t=m-Math.min(Math.min(i, j),Math.min(n-i, n-j));
			
			System.out.print(t+" ");
			
		}
		System.out.println();
	}

	}

}
