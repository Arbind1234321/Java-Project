package com.kunal;

public class FibonnciNumber {
  static int fib(int  n)
  {
	  if(n==0)
	  {
		  return n;
	  }
	  if(n==1)
	  {
		  return n;
	  }
	 
	  return fib(n-2)+fib(n-1);
  }
	public static void main(String[] args) {
		for(int i=0;i<10;i++)
		{
			System.out.print(fib(i)+" ");
		}
		

	}

}
