package arbind.BinarySearch;

import java.util.Arrays;

public class SmallestNumber {

	public static void main(String[] args)
	{
		int []arr = {11,12,15,18,5,6,8};//0 
		
		//System.out.println(smalestInarray(arr));
		//System.out.println(smalestByLinearsearh(arr));
		System.out.println(smallByBinarySearch(arr));
	

	}
	//By using Array method
	public static int smalestInarray(int []arr)
	{
		Arrays.sort(arr);
		return arr[0];
	}

	//By using linear search
	public static int smalestByLinearsearh(int []arr)
	{
		int small=Integer.MAX_VALUE;
		int index=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(small>arr[i])
			{
				small=arr[i];
				index=i;
			}
		}
		return arr.length-index;
	}

	public static int smallByBinarySearch(int []arr)
	{
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			//consider 4 case
			int mid = start + (end - start) / 2;
			if (mid<end && arr[mid] < arr[mid + 1]) {
				return arr[mid];
			}
			if (start< mid && arr[mid] >arr[mid - 1]) {
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

}
