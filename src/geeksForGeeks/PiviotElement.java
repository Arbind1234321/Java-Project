package geeksForGeeks;

public class PiviotElement {

	public static void main(String[] args) {
	int arr[]={2,3,5,6,9,0,1,4,7};
	int target=1;
	System.out.println(pivit(arr));
	System.out.println(search(arr, target));

	}
	
public static int search(int[] arr, int target) {
	
	//start point
	int n=pivit(arr);
	if(n==-1)
	{
		return binarySearch(arr,target,0,arr.length-1);			
	}
	if(target==arr[n])
	{
		return n;
	}
	if(target>=arr[0])
	{
	   return binarySearch(arr, target, 0, n-1);	
	}
	return binarySearch(arr, target, n+1, arr.length-1);
	
    }
public static  int binarySearch(int arr[],int target,int start,int end)
{
	
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
	return -1;
}
	public static int pivit(int []arr)
	{
		 int start=0;
		    int end=arr.length-1;
		    while(start<=end)
		    { 
		    	int mid = start + (end - start) / 2;
		    	if (mid <end && arr[mid] > arr[mid + 1]) {
					return mid;
				}
				if (start<mid&&arr[mid] < arr[mid - 1]) {
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
