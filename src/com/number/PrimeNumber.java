package com.number;

public class PrimeNumber {
	
	
//	Write program weather the number is PERFECT NUMBER or not? 
//			Def: 
//			Perfect number, a positive integer that is equal to the sum of its proper 
//			divisors. The smallest perfect number is 6, which is the sum of 1, 2, and 3.
	
	
	
	
	
//check number is prime or not
	public static boolean isPrime(int n)
	{
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
// print all prime between 1 to 100
	
	public static void allPrime()
	{
		for(int i=2;i<=100;i++)
		{
			if(isPrime(i))
			{
				System.out.print(i+" ");
			}
		}
	}
	//sum of all prime
	
	public static  int sumPrime()
	{
		int sum=0;
		for(int i=2;i<=100;i++)
		{
			if(isPrime(i))
			{
				sum=sum+i;
			}
		}
		return sum;
	}
	// 5th prime
	public static void specificprime()
	{
		int count =0;
		for(int i=2;;i++)
		{
			if(isPrime(i))
			{
				count++;
			}
			if(count==5)
			{
				System.out.println(i);
				break;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 // System.out.println(isPrime(11));
 //  allPrime();
// System.out.println(sumPrime());
	specificprime();
	}

}
