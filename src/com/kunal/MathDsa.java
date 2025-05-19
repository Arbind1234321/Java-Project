package com.kunal;

public class MathDsa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(isPrime(4));
		//noPrime();
		allPrime(20);
		

	}
	//write a program to check number is prime.
	
	public static boolean isPrime(int n)
	{
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	//print all prime between 1 to n
	public static void allPrime(int n)
	{
		for(int i=2;i<=n;i++)
		{
			if(isPrime(i))
			{
				System.out.println(i);
			}
		}
	}
	
	
	//print first five prime number
	public static void noPrime()
	{
		int a=2;
      int count =0;
      while(count<=8)
      {
    	  if(isPrime(a))
    	  {
    		  count++;
    		  System.out.println(a+" " +count);
    	  }
    	  a++;  
      }
	}


}
