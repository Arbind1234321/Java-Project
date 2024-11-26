package com.slidingwindow;

import java.util.HashMap;
import java.util.Set;

public class Demo {

	public static  int majority(int []arr) {
		int count=0;
		int cand=0;
		if(arr.length==1)
		{
			return arr[0];
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(count==0)
			{
				cand=arr[i];
			}
			if(cand==arr[i])
			{
				count++;
			}
			else
			{
				count--;
			}
		}
		return cand;
	}

	public static  int majority1(int []arr) {
		int max=0;
		boolean flag=false;
		
		HashMap<Integer, Integer> hm=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(hm.containsKey(arr[i]))
			{
				hm.put(arr[i],hm.get(arr[i])+1);
			}
			else
			{
				hm.put(arr[i], 1);
			}
		}
		Set<Integer> k=hm.keySet();
		for(Integer i:k)
		{
			
			if(hm.get(i)>arr.length/2)
			{
				max=i;
				flag=true;
			}
		}
		if(flag)
		{
			return max;
		}
		else
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = {2};
		System.out.println(majority1(arr));
	}

}
