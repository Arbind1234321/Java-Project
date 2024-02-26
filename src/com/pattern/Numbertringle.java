package com.pattern;

public class Numbertringle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		for(int i=1;i<=n;i++)
		   {
			  // for(int j=1;j<=i;j++)
			   for(int j=1;j<=n+1-i;j++)
			   {
				   System.out.print(j+" ");
			   }
			   System.out.println();
				   
		   }

	}

}
