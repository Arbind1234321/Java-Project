package com.array;
//sorted array
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class ReoveDuplicateFromArray {

	public static void main(String[] args) {
	  int [] arr= {2,2,3,4,5,6,6,6};//2 3 4 5 6 
	  int n=arr.length;
	   int temp[]=new int[n];
	   int j=0;
	   for(int i=0;i<n-1;i++)
	   {
		   if(arr[i]!=arr[i+1])
		   {
			   temp[j++]=arr[i];
		   }
	   }
	   temp[j++]=arr[n-1];
	   for(int k=0;k<j;k++)
	   {
		   System.out.print(temp[k]+" ");
		   
	   }
//	  for(int i=0;i<n-1;i++)
//	  {
//		  if(arr[i]!=arr[i+1])
//		  {
//			  arr[j++]=arr[i];
//		  }
//	  }
//	  arr[j++]=arr[n-1];
//	  for(int i=0;i<j;i++)
//	  {
//		  System.out.println(arr[i]);
//	  }
	   //using hash map
	  /* HashMap<Integer, Integer> hm=new HashMap<>();
	   for(int i=0;i<n;i++)
	   {
		  if(hm.containsKey(arr[i]))
		  {
			  
	      }
		  else
		  {
			  hm.put(arr[i],1);
		  }
	   }
	   System.out.println(hm.keySet());
	   System.out.println(hm.values());
	   for(Integer k :hm.keySet())
	   {
		   System.out.println(k+"---->"+hm.get(k));
	   }
      for(Integer y:hm.keySet())
      {
    	  System.out.println(y);
      }*/
	}

}







