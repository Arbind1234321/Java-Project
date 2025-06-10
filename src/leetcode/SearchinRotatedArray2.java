package leetcode;

public class SearchinRotatedArray2 {

	public static void main(String[] args) {
		int arr[] = {3, 3, 3, 1, 2, 3};int  k = 11;
		System.out.println(Search(arr, k));

	}
	public static  boolean Search(int[] arr, int k) {
		
        int start=0;
        int end=arr.length-1;
        while(start<=end) {
        	int mid =start+(end-start)/2;
        	if(k==arr[mid])
        	{
        		return true;
        	}
        	else if(k <= arr[mid])
        	{
        		end=mid-1;
        	}
        	else {
        		start=mid+1;
        	}
        }
		return false;
        
    }

}
