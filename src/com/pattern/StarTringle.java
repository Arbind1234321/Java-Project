package com.pattern;

public class StarTringle {

	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=n;i++)
		   {
			   for(int j=1;j<=n;j++)
			   {
				   if(i<=j)
				   System.out.print("* ");
			   }
			   System.out.println();
				   
		   }

	}

}
