package arbind.BinarySearch;

public class SearchOfElement {
	//Basic binary search and its index
    // Array must be sorted
	public static void main(String[] args) {
		int []arr= {2,4,5,7,8,9,11,34};
		int target=8;
		//System.out.println(search(arr, target));
		System.out.println(indexSearch(arr, target));

	}
	public static boolean search(int []arr,int target)
	{
		int start=0;
		int end=arr.length-1;
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(target<arr[mid])
			{
				end=mid-1;
			}else if(target>arr[mid])
			{
				start=mid+1;
			}
			else
			{
				return true;
			}
		}
		return false;
	}
	
	public static int indexSearch(int [] arr,int target)
	{
		int start=0;
		int end=arr.length-1;
		while(start<= end)
		{
			int mid=start+(end-start)/2;
			if(target<arr[mid])
				{
				end=mid-1;
				}
			else if(target>arr[mid])
			{
				start=mid+1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
}
