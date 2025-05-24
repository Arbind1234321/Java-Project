package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) { 

         int [] a= {10,10};
        // Arrays.sort(a);
        // System.out.println(Arrays.toString(a));
         System.out.println(secondLargest(a));
         

	}
	public static int secondLargest(int [] a)
	{
		int max=Integer.MIN_VALUE;
		int sec=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				sec=max;
				max=a[i];
			}
			else if(sec<a[i] && a[i]!=max)
			{
				sec=a[i];
			}
		}
		if(sec==Integer.MIN_VALUE)
		{
			return -1;
		}
		return sec;
	}

}
