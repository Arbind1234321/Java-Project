package com.array;

import java.util.Arrays;

public class MoveAllZeroleft {

	public static void main(String[] args) {
		int  arr[]= {1,0,3,0,2,0,5,0,3};
		System.out.println(Arrays.toString(movezeroleft(arr)));
		

	}
	public static int [] movezeroleft(int []arr)//0 0 0 0 1 3 2 5 3
	{
		int a[]=new int[arr.length];
		int index=arr.length-1;
		for(int i=index;i>=0;i--)
		{
			if(arr[i]!=0)
			{
				a[index--]=arr[i];
			}
			
		}
		while(index>=0)
		{
			a[index--]=0;
		}
		return a;
	}

}
