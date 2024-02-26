package com.pattern;

public class HallowRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=2*n-2;j++)
			{
				if(i==1||i==n||j==1||j==2*n-2)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
