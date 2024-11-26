package com.Binarysearch;

public class PiviotInDuplicate {

	public static void main(String[] args) {
		int arr[]= {2,9,2,2,2,2,2};
System.out.println(duplicate(arr));
	}
	public static int duplicate(int []arr)
	{
		 int start=0;
		    int end=arr.length-1;
		    while(start<=end)
		    { 
		    	int mid = start + (end - start) / 2;
		    	if (mid <end && arr[mid] > arr[mid + 1]) {
					return mid;
				}
				if (start<mid&&arr[mid] < arr[mid - 1]) {
					return mid - 1;
		 		}
				if(arr[mid]==arr[start]&&arr[mid]==arr[end]) {
					
					if(arr[start]>arr[start+1])
					{
						return start;
					}
					start++;
				if(arr[end]<arr[end-1])
				{
					return end-1;
				}
					end--;
				} 
				else if(arr[start]<arr[mid]||(arr[start])==arr[mid]&&arr[mid]>arr[end])
				{
					start=mid-1;
				}
				else {
					end=mid-1;
				}

			}
			return -1;
	}

}
