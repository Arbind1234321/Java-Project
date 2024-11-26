package com.slidingwindow;

import java.util.ArrayList;
import java.util.Collections;

public class MaxSubArray {
	public static ArrayList<Integer> maxSubArray(int []arr,int k,int n)
	{
		ArrayList<Integer> list=new ArrayList<>();
		ArrayList<Integer> list1=new ArrayList<>();
		
		
		int i=0,j=0;
		while(j<n)
		{
			list.add(arr[j]);
			if((j-i+1)<k)
			{
				j++;
			}
			else if(j-i+1==k)
			{
				Collections.sort(list);
				list1.add(list.get(list.size()-1));
				list.remove(0);
				i++;
				j++;
				
			}
		}
		return list1;
	}

	public static void main(String[] args) {
		int []arr= {1,3,-1,-3,5,3};
		int k=3;
		int n=6;
		System.out.println(maxSubArray(arr, k, n));

	}

}
