package com.slidingwindow;

import java.util.ArrayList;

public class SubArraySum {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 7, 5 };//
		int n = 5, s = 12;
		System.out.println(subarraySum3(arr, n, s));

	}

	public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) // 2,4
	{
		ArrayList<Integer> list = new ArrayList<>();

		int count = 0;
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i; j < n; j++) {
				sum = sum + arr[j];
				if (sum == s && count == 0) {
					list.add(i + 1);
					list.add(j + 1);
					count++;
					break;
				}
			}
		}
		if (list.size() > 0) {
			return list;
		} else {
			list.add(-1);
			return list;
		}

	}

	public static ArrayList<Integer> subarraySum1(int[] arr, int n, int s) // 2,4
	{
		ArrayList<Integer> list = new ArrayList<>();

		int sum = 0;
		int i = 0, j = 0;
		while (j < n) {
			sum = sum + arr[j];
			if (s > sum) {
				j++;
			}
			if (s == sum) {
				list.add(i + 1);
				list.add(j + 1);
				break;
			}
			if (s < sum) {
				i++;
				sum = 0;
				j = i;

			}

		}
		if (list.size() > 0) {
			return list;
		} else {
			list.add(-1);
			return list;
		}

	}

	public static ArrayList<Integer> subarraySum3(int[] arr, int n, int s) // 2,4
	{
		
		int r=0;//right window
		int l=0;//left window
		int sum=0;
		ArrayList< Integer> list =new ArrayList<>();
		while(r<n)
		{
			//tracking sum
			sum+=arr[r];
			
			while(l<r &&sum>s)
			{
				sum-=arr[l];
				//sliding left window
				l++;
			}
			if(sum==s)
			{
				list.add(l+1);
				list.add(r+1);
				return list;
			}
			//sliding right window
			r++;
		}
		list.add(-1);
		return list;
		
	}
}
