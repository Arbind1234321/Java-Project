package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter leength of array");
		int len=sc.nextInt();
		int[]arr=new int[len];
		//Reading array
		for(int i=0;i<len;i++)
		{
		  arr[i]=sc.nextInt();	
		}
	System.out.println("Before swaping");
	for(int i=0;i<len;i++)
	{
		System.out.println("arr["+i+"]--->"+arr[i]);
	}
	//Swapping array 
	for(int i=0;i<len/2;i++)
	{
		int t=arr[i];
		arr[i]=arr[len-i-1];
		arr[len-i-1]=t;
	}
	System.out.println("After swaping");
	//System.out.println(Arrays.toString(arr));
	/*for(int i=0;i<len;i++)
	{
		System.out.println("arr["+i+"]--->"+arr[i]);
	}*/
	for(int a:arr)
	{
		System.out.print(a+" ");
	}

	}
	

}
