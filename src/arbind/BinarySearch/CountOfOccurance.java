package arbind.BinarySearch;

public class CountOfOccurance {

	public static void main(String[] args) {
       int []arr= {1,2,4,5,7,8,8,8,8,9,11};
       int target=2;
       System.out.println(count(arr, target));


	}
	
	public static int count(int []arr,int target)
	{
	   int first=firstindx(arr, target);
	   int last=laststindx(arr, target);
	   if(first==-1)
		   return -1;
	   else
		return last-first+1;
		
	}
	public static int firstindx(int []arr,int target)
	{
		int start=0;
		int end=arr.length-1;
		int ans=-1;
		while(start<=end)
		{
			int mid=start+ (end-start)/2;
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
	public static int laststindx(int []arr,int target)
	{
		int start=0;
		int end=arr.length-1;
		int ans=-1;
		while(start<=end)
		{
			int mid=start+ (end-start)/2;
			if(target==arr[mid])
			{
				ans=mid;
			    start=mid+1;;
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

}
