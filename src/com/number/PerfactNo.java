package com.number;

import java.util.Scanner;

public class PerfactNo {
	public static boolean perfactNumber(int n)
	{
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==n)
			return  true;
		else
			return false;
	}
	public static boolean palindrome(int n)
	{
		int temp=n;
		int r=0;
		while(n!=0)
		{
			r=r*10+n%10;
			n=n/10;
		}
		if(r==temp)
			return true;
		else
			return false;
	}

 	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number");
      int n=sc.nextInt();
      int sum=0;
      for(int i=1;i<=n/2;i++)
      {
    	  if(n%i==0)
    		  sum=sum+i;
      }
      if(sum==n)
      {
    	  System.out.println(n+"is perfact number");
      }
      else {
    	  System.out.println(n+"is not  perfact number");
      }
     System.out.println( perfactNumber(6));
     System.out.println( palindrome(1212));
      }

}
