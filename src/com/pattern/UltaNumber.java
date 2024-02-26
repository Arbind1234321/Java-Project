package com.pattern;

public class UltaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
	    int nsp=n-1;
		for(int i=1;i<=n;i++)
		{    int a=i;
		      for(int k=1;k<=nsp;k++) {
		    	 System.out.print(" "); 
		      }
			for(int j=1;j<=i;j++ )
			{
				System.out.print(a);
				a--;
			}
			int p=2;
			for(int t=1;t<=i-1;t++) {
				System.out.print(p);
				p++;
			}
			nsp--;
			System.out.println();
		}

	}

}
