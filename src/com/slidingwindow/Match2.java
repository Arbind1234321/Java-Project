package com.slidingwindow;

import java.util.ArrayList;
import java.util.Collections;

public class Match2 {

	public static void main(String[] args) {
		int arr[] = {8 ,5 ,10 ,7 ,9 ,4 ,15 ,12 ,90 ,13};
		int N=arr.length;
		int k=4;
	    maxSubArray(arr, N, k);


	}
	public static void maxSubArray(int []arr, int n,int k)//3 3 4 5 5 5 6
	{
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<n-k+1;i++)
		{
			for(int j=i;j<k+i;j++)
			{
				list.add(arr[j]);
			}
			Collections.sort(list);
			System.out.print(list.get(list.size()-1)+" ");
			list.remove(i);
		}
	}

}
