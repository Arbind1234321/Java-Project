package com.array;

import java.util.Arrays;

public class InsertingArray {

	public static void main(String[] args) {
		int pos=2;
		
		int ele=100;
		int[]arr= {1,2,3,4,5};
	/*	int[]b=new int [arr.length];
        for(int i=arr.length-1;i>pos-1;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[pos-1]=ele;
		for(int a:arr)
		{
			//System.out.print(a+" ");
		}
     System.out.println(Arrays.toString(arr));
     for(int i=0;i<arr.length;i++)
     {
    	 System.out.print(arr[i]+" ");
     }
  System.out.println(Arrays.toString(arr));		
*/	
	int[]a=new int [arr.length+1];	
	  for(int i=0;i<a.length;i++)
	  {
		  //a[i]=arr[i];
		  
		  if(i<pos-1)
			 a[i]=arr[i];
		  else if(i==pos-1)
			  a[i]=ele;
		  
		  else
			  a[i]=arr[i-1];
		  
		  
	  }
	  for(int c:a)
	  {
		  System.out.print(c+" ");
	  }
	  System.out.println();
	  System.out.println(Arrays.toString(a));
     
	}

}
