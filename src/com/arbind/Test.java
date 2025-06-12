package com.arbind;

public class Test {

	public static void main(String[] args) {
		int arr[]= {3, 1, 2, 4, 5};
		System.out.println(maxContainer(arr));

	}
	public static int maxContainer(int []arr)
	{
		int n=arr.length;
		int maxcontainer=0;
		int left=0;
		int  right=n-1;
		while(left<right)
		{
			//int area=l*b
			int area=Math.min(arr[left], arr[right])*(right-left);
			maxcontainer=Math.max(maxcontainer, area);
			if(arr[left]< arr[right])
			{
				left++;
			}
			else {
				right--;
			}
		}
		return maxcontainer;
	
	}

}
