package com.slidingwindow;

public class MaximumNumberOfToy {

	public static void main(String[] args) {
		 int []  cost = {1, 12, 5, 111, 200, 1000, 10};
		int  N = 7, K =  50;
		System.out.println(maxToy(cost, N, K));

	}
	public static int maxToy(int [] cost,int n, int k)
	{
		if(n==0)
		{
			return 0;
		}
		int sum=0;
		int i=0;
		int count=0;
		while(i<n)
		{
			sum=sum+cost[i];
			if(sum<=k)
			{
				count++;
				i++;
			}
			else if(sum>k)
			{
				sum=sum-cost[i];
				i++;
			}
		}
		return count;
	}

}
