package com.arbind;

import java.util.ArrayList;
import java.util.Arrays;

public class IsArraySorted {

	public static void main(String[] args) {
		int []arr= {2,1,5,1,6,8,1};
		//linear search --->
		//recursion
//		System.out.println(isSorted(arr));
//		System.out.println(smallest(arr));
//		System.out.println(largest(arr));
//        System.out.println(secondLargest(arr));
		//System.out.println(Arrays.toString(arr));
		//sorted(arr);
		//System.out.println(Arrays.toString(sorted(arr)));
		//System.out.println(reSortd(arr, 0));
		//System.out.println(linearSearch(arr, 1 , 0))
     ArrayList<Integer> list=new ArrayList<>();
     //System.out.println(indexsOfArray(arr, 1, 0, list));
    // System.out.println(list.get(2));
     recAllIndex(arr, 0, list, 1);
     System.out.println(list);
     
	}
	public static boolean isSorted(int []arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			if(i<arr.length&&arr[i]>arr[i+1])
			{
				return false;
			}
		}
		return true;
	}

public static int smallest(int []arr)
{
	int small=Integer.MAX_VALUE;
	int second=Integer.MAX_VALUE;
	for(int i=0;i<arr.length;i++) {
		if(small>arr[i]) {
			second=small;
			small=arr[i];
			
		}
		else if(second>arr[i])
		{
			second=arr[i];
		}
	}
	return second;
}
public static int largest(int arr[])
{
	int largest=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++)
	{
		if(largest<arr[i])
		{
			largest=arr[i];
		}
	}
	return largest;
}

public static int secondLargest(int []arr)
{
	int f=Integer.MIN_VALUE;
	int s=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++)
	{
		if(f<arr[i])
		{
			s=f;
			f=arr[i];
		}
		else if(s<arr[i])
		{
			s=arr[i];
		}
	}
	return s;
}

public static int [] sorted(int []arr)
{
	for(int i=0;i<arr.length-1;i++)
	{
		for(int j=1;j<arr.length-i;j++)
		{
		  if(arr[j]<arr[j-1])
		  {
			  int temp=arr[j-1];
			  arr[j-1]=arr[j];
			  arr[j]=temp;
		  }
			
	    }
	}
	return arr;
}

 public static boolean reSortd(int [] arr,int index)
 {
	if(index==arr.length-1)
	{
		return true;
	}
	return arr[index]<arr[index+1]&& (reSortd(arr, index+1));
 }

 
 public static boolean linearSearch(int []arr ,int target,int index)
 {
	 if(index==arr.length-1)
	 {
		 return false;
	 }
	 return arr[index]==target||(linearSearch(arr, target, index+1));
 }
    
 public static ArrayList<Integer> indexsOfArray(int []arr, int target, int index,ArrayList<Integer> list)
 {
	 for(int i=arr.length-1;i>=0;i--)
	 {
		 if(arr[i]==target)
		 {
			 list.add(i);
			 break;
		 }
	 }
	 return list;
 }

public static  void recAllIndex(int []arr,int index,ArrayList<Integer>list,int target)
{
	if(index==arr.length)
	{
		return ;
	}
	if(arr[index]==target)
	{
		list.add(index);
	}
	recAllIndex(arr, index+1, list, target);
}



}

























