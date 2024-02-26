package com.PatternNotes;

public class Pattern29 {

	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=n-i;k++)
			{
				System.out.print("  ");
			}
			int a=i;
		  for(int j=1;j<=i;j++)
		  {
			  System.out.print(a+" ");
			  a--;
		  }
		  int p=i-1;
		  int b=2;
		  for(int j=1;j<=p;j++) {
			  System.out.print(b+" ");
			  b++;
		  }
		  System.out.println();
		}

	}

}
