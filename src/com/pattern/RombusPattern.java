package com.pattern;

public class RombusPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++)
		{
          //for spaces
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			//for star
			for(int k=1;k<=n;k++) {
				System.out.print("*");
			}
			System.out.println();//for new line
		}

	}

}
