package com.pattern;

public class StarPluse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   int n=3;
	   for(int i=1;i<=n;i++)
	   {
		   
		   for(int j=1;j<=n;j++)
		   {
			   int a=n/2+1;
			   if(j==a||i==a)
				   System.out.print("* ");
			   else
				   System.out.print("  ");
		   }
		   System.out.println();
	   }

	}

}
