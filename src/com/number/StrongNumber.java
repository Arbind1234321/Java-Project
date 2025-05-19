package com.number;

public class StrongNumber {
	public static int fact(int n)
	{
		int prod=1;
		for(int i=1;i<=n;i++)
		{
			prod=prod*i;
		}
		return prod;
	}
	
	public static boolean strong(int n)
	{
		int sum=0;
		int temp=n;
		while(n!=0)
		{
			int r=n%10;
			sum=sum+fact(r);
			n=n/10;
		}
		if(sum==temp)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //System.out.println(fact(5));
		System.out.println(strong(142));
	}

}
