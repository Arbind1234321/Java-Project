package com.Binarysearch;

public class IfinteArray {

	public static void main(String[] args) 
	{
		int []arr= {2,3,5,8,11,15,25,30,33,34,45};
		int target=20;
		//System.out.println(infinite(arr, target));
		System.out.println(minimumDiff(arr, target));

	}
	public static boolean infinite(int []arr,int target)
	{
		int start=0;
		int end=1;
		boolean b=true;
		
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(target<arr[mid])
			{
				b=false;
				end=mid-1;
				
			}
			else if(target>arr[mid])
			{
				
				start=mid+1;
			}
			else 
			{
				b=false;
				return true;
			}
			if(b) {
				
				end=end+(end-start+1)*2;
			}
			
			
		}
		return false;
		
		
	}
   
	
	//Minimum difference element in sorted array
	
	public static int minimumDiff(int [] arr,int target)
	{    int x=0;
		int min=Integer.MAX_VALUE;
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			int ab=arr[i]-target;
			x=Math.abs(ab);
			if(x<min)
			{
				min=x;
				index=i;
			
			}
		}
		return arr[index];
	}
}
