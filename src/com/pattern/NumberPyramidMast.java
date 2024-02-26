package com.pattern;

public class NumberPyramidMast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int n=3;
          int nst=n;
          int nsp=1;
          for(int m=1;m<=2*n+1;m++)
          {
        	  System.out.print("*");
          }
          System.out.println();
          for(int i=1;i<=n;i++) {
        	  for(int j=1;j<=nst;j++)
        	  {
        		  System.out.print("*");
        		  
        	  }
        	  for(int k=1;k<=nsp;k++)
        	  {
        		  System.out.print(" ");
        	  }
        	  for(int j=1;j<=nst;j++)
        	  {
        		  System.out.print("*");
        	  }
        	  nsp+=2;
        	  nst--;
        	  System.out.println();
          }
	}

}
