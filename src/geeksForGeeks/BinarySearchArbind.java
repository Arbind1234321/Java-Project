package geeksForGeeks;

public class BinarySearchArbind {
	public static void main(String[] args) {
		int arr[]= {2,3,5,9,14,16,18,20,22,24,26,30,35,42,44,45,56,60,63,67,70,72,73,74};
		int target=44;
		//System.out.println(ceiling(arr, target));
		//System.out.println(flour(arr, target));
		//System.out.println(Thread.currentThread().getName());
		System.out.println(infiniteArray(arr, target));

	}
	public static int  ceiling(int []arr,int target)
	{
		//if target is greater than last element
		if(target>arr[arr.length-1])
		{
			return -1;
		}
		int start=0;
		int  end=arr.length-1;
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(target==arr[mid])
			{
				return mid;
			}
			else if(target<arr[mid])
			{
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		return start;
	}
	public static int  flour(int []arr,int target)
	{
		
		int start=0;
		int  end=arr.length-1;
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(target==arr[mid])
			{
				return mid;
			}
			else if(target<arr[mid])
			{
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		return end;
	}
	
    public static int infiniteArray(int arr[],int target) {
    	int start=0;
    	int end=1;
    	int count=0;
    	try {
    	while(target>arr[end])
    	{
    		int temp=end+1;
    		end=end+(end-start+1)*2;
    		start=temp;
    		count++;
    	}
    	}catch (ArrayIndexOutOfBoundsException e) {
		   end=end-count;
		   count=0;
		}
    	return biarySearch(arr, target, start, end);
    }
    
    public static int biarySearch(int []arr,int target,int start,int end) {
    	while(start<=end) {
    		int mid =start+(end-start)/2;
    		if(target==arr[mid])
    		{
    			return mid;
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
  
    	return -1;
    }
}
