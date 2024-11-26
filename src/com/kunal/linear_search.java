package com.kunal;

import java.util.ArrayList;

public class linear_search {
	
	public static boolean leanerSearch(int []arr,int target)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==target)
			{
				return true;
			}
		}
		return false;
	}
	public static ArrayList<Integer> leanerSearchAllIndex(int []arr,int target,ArrayList<Integer> list)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==target)
			{
				list.add(i);
			}
		}
		return list;
	}

	public static void main(String[] args) 
	{
		int arr[]= {2,4,3,10,12,3,56,66};
		int target=3;
		ArrayList<Integer> list=new ArrayList<>();
//	   boolean rs=leanerSearch(arr, target);
//	   System.out.println(rs);
//	   
//	   if(rs)
//	   {
//		   System.out.println("Element found");
//	   }
//	   else
//	   {
//		   System.out.println("not found");
//	   }
		System.out.println(leanerSearchAllIndex(arr,target,list));

	}

}
