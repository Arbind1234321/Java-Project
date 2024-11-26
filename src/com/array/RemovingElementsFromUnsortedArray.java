package com.array;

import java.util.Arrays;

public class RemovingElementsFromUnsortedArray {

	public static void main(String[] args) {
		int a[]= {3,4,5,3,23,1,3,0,5};
		int n=a.length;
		Arrays.sort(a);
		int j=0;
		System.out.println(Arrays.toString(a));
		for(int i=0;i<n-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				a[j++]=a[i];
				
			}
		}
		a[j++]=a[n-1];
		for(int i=0;i<j;i++)
		{
			System.out.println(a[i]);
		}
		//System.out.println(Arrays.toString(a));
   
	}

}
