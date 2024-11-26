package com.number;

public class NumberUtilsClass {
	public static int gcd(int a,int b)
	{
		if(a==0)
		{
			return b;
		}
		return gcd(b%a,a);
	}
	public  static int lcm(int a,int b)
	{
		return (a*b)/gcd(a,b);
	}
   public static boolean odd_Even(int n)
   {
	   if(n%2==0) return true;
	   else return false;
	   
   }
   public  static boolean prime(int n)
   {
	 return true;
   }
	public static void main(String[] args)
	{
	   System.out.println(odd_Even(8));	

	}

}
