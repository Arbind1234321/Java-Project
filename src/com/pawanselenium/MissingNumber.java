package com.pawanselenium;

public class MissingNumber {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,7,8};
		System.out.println(missingNumber(arr));

	}
	public static int missingNumber(int []arr)
	{
		int sum=0;
		for(int a:arr)
		{
			sum=sum+a;
		}
		int total= 0;
		for(int i=1;i<=8;i++)
		{
			total=total+i;
		}
		return total-sum;
	}

}
