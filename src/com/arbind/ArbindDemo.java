package com.arbind;

public class ArbindDemo {

	public static void main(String[] args) {
		int arr[]= {1,1,1,1,1};
		largest(arr);

	}
	public static void  largest(int arr[])
	{
		int largest=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(largest<arr[i])
			{
				second=largest;
				largest=arr[i];
			}
			else if(second<arr[i] && largest !=arr[i])
			{
				second=arr[i];
			}
		}
		if(second==Integer.MIN_VALUE)
		{
			System.out.println(0);
		}
		else
		System.out.println(second);
	}

}
