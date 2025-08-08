package geeksForGeeks;

import java.util.ArrayList;
import java.util.Arrays;

public class Firstandlastoccurrencesofx {

	public static void main(String[] args) {
		int x = 5; int  arr[] = {1, 3, 3, 4};
	     firstAndLast(x,arr);
	}
	

	public static ArrayList<Integer> firstAndLast(int x, int arr[]) {
		ArrayList<Integer> list =new ArrayList<>();
		int first=firstInddex(arr,x);
		int last=lastInddex(arr,x);
		System.out.println(first +" "+last);
		if(first !=-1 && last !=-1) {
		list.add(first);
		list.add(last);;
		return list;
		}
		list.add(-1);
		return list;
	}

	public static int lastInddex(int[] arr, int x) {
		
		int start=0;
		int end=arr.length-1;
		int res=-1;
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(arr[mid]==x)
			{
				res=mid;
				start=mid+1;
			}
			else if(arr[mid]>x)
			{
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		return res;
	}

	public static int firstInddex(int[] arr, int x) {
		int start=0;
		int end=arr.length-1;
		int res=-1;
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(arr[mid]==x)
			{
				res=mid;
				end=mid-1;
			}
			else if(arr[mid]>x)
			{
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		return res;
	}

}
