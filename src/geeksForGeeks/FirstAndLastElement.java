package geeksForGeeks;

import java.util.Arrays;

public class FirstAndLastElement {

	public static void main(String[] args) {
		int []arr= {5,7,7,7,7,8,8,10};
		int target=9;
		System.out.println(firstElement(arr, target));
		System.out.println(lastElement(arr, target));
		System.out.println(Arrays.toString(serarch(arr, target)));

	}
	public static int[] serarch(int arr[],int target) {
		int ans[]= {-1,-1};
		ans[0]=firstElement(arr, target);
		ans[1]=lastElement(arr, target);
		return ans;
	}
	public static int firstElement(int []arr,int target)
	{
		int start=0;
		int end=arr.length-1;
		int temp=-1;
		while(start<=end)
		{
			int mid= start+(end-start)/2;
			if(target==arr[mid])
			{
				temp=mid;
				end=mid-1;
			}
			else if(target<arr[mid])
			{
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		return temp;
	}
	public static int lastElement(int []arr,int target)
	{
		int start=0;
		int end=arr.length-1;
		int temp=-1;
		while(start<=end)
		{
			int mid= start+(end-start)/2;
			if(target==arr[mid])
			{
				temp=mid;
				start=mid+1;
			}
			else if(target<arr[mid])
			{
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		return temp;
	}


}
