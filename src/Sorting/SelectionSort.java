package Sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int [] arr= {3,2,1,5,4 };
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));

	}
//	public static void selectionSort(int []arr)
//	{
//		for(int i=0;i<arr.length;i++)
//		{
//			//find the max element index
//			int last=arr.length-i-1;
//			int maxindex=getmaxIndex(arr,0,last);
//			swap(arr,maxindex,last);
//		}
//	}
//   public  static void swap(int[] arr, int maxindex, int last) {
//		int temp=arr[maxindex];
//		arr[maxindex]=arr[last];
//				arr[last]=temp;
//		
//	}
//	
//	public  static int getmaxIndex(int[] arr, int a, int last) {
//		int max=a;
//		for(int i=a;i<=last;i++)
//		{
//			if(arr[max]<arr[i])
//			{
//				max=i;
//			}
//			
//		}
//		return max;
	public static void selectionSort(int []arr)
	{
	  for(int i=0;i<arr.length;i++)
	  {
		  int last  = arr.length-i-1;
		  //find max number in arr
		  int getmaxidex=getMaxIndex(arr,0,last);
		  swap(arr,getmaxidex,last);
	  }
	
	}
    public static void swap(int[] arr, int getmaxidex, int last) {
	int temp=arr[getmaxidex];
	arr[getmaxidex]=arr[last];
	arr[last]=temp;
	
}
	public static int getMaxIndex(int[] arr, int start, int last) {
    	
    int max=start;
    for(int i=start;i<=last;i++)	
    {
    	if(arr[max]<arr[i])
    	{
    		max=i;
    	}
    }
	
	return max;
}

}
