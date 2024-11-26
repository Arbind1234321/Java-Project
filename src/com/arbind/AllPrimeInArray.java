package com.arbind;

import java.util.ArrayList;
import java.util.HashSet;

public class AllPrimeInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] =  {1, 3, 5, 7, 9};
		int arr2[] = {2, 4, 6, 8, 10};
		//System.out.println(countPrime(arr1, arr2));
		System.out.println(commonPrime(arr1, arr2));

	}

	public static int countPrime(int[] arr1, int[] arr2) {
		int count =0;
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < arr1.length; i++) {
			set.add(arr1[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			set.add(arr2[i]);
		}
		
		for(Integer i:set)
		{
			if(i==1)
			{
			 continue;
			}
			if(isprime(i))
			{
				count++;
			}
		}
		System.out.println(set);
		
          return count;
	}

    public static boolean isprime(Integer n) {
	 
		
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}

    public static int commonPrime(int []arr1,int []arr2)
    {
    	ArrayList<Integer> list=new ArrayList<>();
    	ArrayList<Integer> list1=new ArrayList<>();
    	int count =0;
    	for(int i=0;i<arr1.length;i++)
    	{
    		if(arr1[i]==1)
    		{
    			continue;
    		}
    		if(isprime(arr1[i]))
    		{
    			list.add(arr1[i]);
    		}
    	}
    	for(int i=0;i<arr2.length;i++)
    	{
    		if(arr2[i]==1)
    		{
    			continue;
    		}
    		if(isprime(arr2[i]))
    		{
    			list1.add(arr2[i]);
    		}
    	}
    	for(int n:list)
    	{
    		if(list1.contains(n))
    		{
    			count++;
    		}
    	}
    	
    	return count;
    }
    
    
}
