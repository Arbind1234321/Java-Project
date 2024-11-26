package arbind.BinarySearch;
//find the  first and last index for given target element
public class FirstAndLastIndex {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 7, 9, 11, 11, 11, 13, 34,45,45,47,49,50,111,111 };
		int target = 11;
		System.out.println(firstIndex(arr, target));
		System.out.println(lastIndex(arr, target));
	}
	public static int firstIndex(int []arr,int target)
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
   
	public  static int lastIndex(int []arr,int target)
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
				start=mid+1;
			}
			else if(target<arr[mid])
			{
				end=end-1;
			}
			else 
			{				
				start=mid+1;
			}
			
			
		}
		return ans;
	}
}

