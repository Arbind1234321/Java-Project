package Sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,4,3,2,1};
		sort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));

	}
	public static void sort(int [] arr,int low,int high) {
		
		if(low>=high)
		{
			return ;
		}
		int s=low;
		int e=high;
		int mid=s+(e-s)/2;
		int piviot=arr[mid];
		while(s<=e) {
			while(arr[s]<piviot)
			{
				s++;
			}
			while(arr[e]>piviot)
			{
				e--;
			}
			if(s<=e)
			{
				int temp=arr[s];
				arr[s]=arr[e];
				arr[e]=temp;
				s++;
				e--;
			}
		}
		sort(arr,low,e);
		sort(arr,s,high);
	}

}
