package com.Binarysearch;

public class PeakOfMounatain {

	public static void main(String[] args) {
		int []arr= {0,3,4,7,1,0};
		System.out.println(peak(arr));
		//System.out.println(largestElement(arr));
		System.out.println(mountain(arr)) ;

	}
	
	public static  int peak(int []nums)
	{
		int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid + 1]) {
                end=mid;
            } else {
                start = mid + 1;
            }
            
        }
        return start;
	}
	public static int mountain(int []arr)
	{
		int start=0;int end=arr.length-1;
		while(start<end)
		{
			int mid=start+(end-start)/2;
			if(arr[mid]>arr[mid+1])
			{
				end=mid;
			}
			else {
				start=mid+1;
			}
		}
		return start;
	}
	public static int largestElement(int []arr)
    {

    	int first=Integer.MIN_VALUE;
    	int second=Integer.MIN_VALUE;
    	for(int i=0;i<arr.length;i++)
    	{
    		if(first<arr[i])
    		{
    			second=first;
    			first=arr[i];
    		}
    		else if(second<arr[i])
    		{
    			second=arr[i];
    		}
    	}
    	return second;
    }
}
