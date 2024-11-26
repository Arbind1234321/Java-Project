package com.arbind;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {8,4,5,7,3};
		System.out.println(seconLargest(arr));

	}
	public static int seconLargest(int [] arr)
	{
		int max=Integer.MIN_VALUE;
		int sec=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
			  sec=max;
			  max=arr[i];
			}
			else if(sec<arr[i ])
			{
				sec=arr[i];
			}
		}
		return sec;
	}

}
