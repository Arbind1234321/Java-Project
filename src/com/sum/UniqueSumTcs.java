package com.sum;

import java.util.HashMap;

public class UniqueSumTcs {

	public static void main(String[] args) {
		int  []arr= {10,20,10,30,20,40};
		count(arr);

	}
	public static void count(int []arr)
	{
		HashMap<Integer, Integer> hm=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(hm.containsKey(arr[i]))
			{
				hm.put(arr[i], hm.get(arr[i])+1);
			}
			else
			{
			  hm.put(arr[i], 1);	
			}
		}
		System.out.println(sum(arr, hm));
	}

	public static  int sum(int []arr,HashMap<Integer, Integer> hm)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(hm.get(arr[i])==1)
			{
				sum=sum+arr[i];
			}
		}
		return sum;
	}

}
