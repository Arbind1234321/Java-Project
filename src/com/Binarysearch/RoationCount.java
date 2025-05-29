package com.Binarysearch;

public class RoationCount
{
  public static void main(String[] args) {
	  int []arr= {5,6,7,8,9,10,4};
	     System.out.println(rotationCount(arr));
	    // System.out.println(smallest(arr));
}
  public static int rotationCount(int []arr)
  {
	  int ans=pivo(arr);
	  return ans+1;
  }
public static int pivo(int[] arr)
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
		if (arr[start] >= arr[mid]) {
			end = mid - 1;
		} else {
			start = mid + 1;
		} 

	}
	return -1;
}

  //smallest number in sorted array 
  public static int smallest(int []arr)
  {    int index=0;
       int count=0;
	  int min=Integer.MAX_VALUE;
	  for(int i=0;i<arr.length;i++)
	  {
		  if(min>arr[i])
		  {
			  min=arr[i];
			  index=i;
			  count++;
		  }
	  }
	  if(count==1)
	  {
		  return 0;
	  }
	  else {
	  return arr.length- index;
	  
	  }
  }
}
