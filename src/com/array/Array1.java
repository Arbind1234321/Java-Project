package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) { 

         int [] a= {4,5,6,2,6,9,9,6,9,9};
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
		return sec;
	}

}
