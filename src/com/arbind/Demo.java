package com.arbind;

public class Demo {

	public static void main(String[] args) {
		int []arr= {2,2,2,2,3,4,4,5,5};
		//System.out.println(secondLargest(arr));
		//System.out.println(secondSmallest(arr));
		//System.out.println(majorityElement(arr));
		removeduplicateArray(arr);

	}
	public static  int secondLargest(int []arr)
	{
		int first=Integer.MIN_VALUE;
		int sec=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(first<arr[i])
			{
				sec=first;
				first=arr[i];
			}
			else if(sec<first&& arr[i] != first)
			{
				sec=arr[i];
			}
		}
		return sec;
	}
	
	public static int secondSmallest(int []arr)
	{
		
		int first=Integer.MAX_VALUE;
		int sec=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			 if (arr[i] < first) {
	                sec = first;
	                first = arr[i];
	            }
	 
	            /* If arr[i] is in between first and second
	               then update second  */
	            else if (arr[i] < sec && arr[i] != first)
	                sec = arr[i];
		}
		return sec;
	}

	public static int majorityElement(int []arr)
	{
		int cand=0;
		int count=0;
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(count==0)
			{
				cand=arr[i];
				
			}
			if(cand==arr[i])
			{
				count++;
				max=count;
			}
			else {
				count--;
			}
			if(max>=count)
			{
				cand=arr[i];
			}
			
		}
		return cand;
	}

public static void removeduplicateArray(int []arr)
{
	int count =0;
	for(int i=0;i<arr.length;i++)
	{
	
		if(i<arr.length-1&&arr[i]==arr[i+1])
		{
			continue;
		}
		else {
			arr[count]=arr[i];
			count++;
		}
	}
	for(int i=0;i<count;i++)
	{
		System.out.print(arr[i]+" ");
	}
}
}
