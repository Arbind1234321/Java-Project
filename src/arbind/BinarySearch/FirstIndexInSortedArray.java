package arbind.BinarySearch;

public class FirstIndexInSortedArray {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 7, 9, 11, 11, 11, 13, 34,45,45,47,49,50,111,11111, };
		int target = 100;
		//System.out.println(Firstindex(arr, target));
		//System.out.println(lastIndex(arr, target));
		System.out.println(totalCount(arr, target));

	}

	public static int Firstindex(int []arr,int target)
	{
		int start=0;
		int end=arr.length-1;
		int ans=-1;
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(target==arr[mid])
			{
				ans=mid;
				end=mid-1;
			}
			else if(target<arr[mid])
			{
			end=mid-1;
			}
			else
			{
				start=mid+1;
			}
			
		}
		return ans;
	}

	public static int lastIndex(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		int ans = -1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target == arr[mid]) {
				ans = mid;
				start=mid+1;
			}
			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} 
		}
		return ans;
	}


//Total number of repeated character for  given target
	public static int totalCount(int [] arr,int target)
	{
		int first=Firstindex(arr, target);
		int last=lastIndex(arr, target);
		if(first==-1)
		{
		 return 0;	
		}
		return last-first+1;
	}

}
