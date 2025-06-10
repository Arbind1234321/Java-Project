package arbind.BinarySearch;



public class BinarySearchDemo {

	public static void main(String[] args) {
		//int arr[]= {1,2,3,4,6,7,8,9,10};
		//int[] arr = {5,10,30,20,40};
		 //int[] arr = {80, 59, 26, 46};
		 
		//int ele = 28;
		
		char []arr= {'a','b','c','f','h'};
				 char target='f';
				 System.out.println(nextLatter(arr, target));
	

	}
	//WAP for next alphabet element
	public static char nextLatte1r(char []arr,char ele)
	{
		char c='$';
		int start=0;
		int end=arr.length-1;
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(ele==arr[mid])
			{
			 start=mid+1;
			}
			else if(ele<arr[mid]) {
				
				c=arr[mid];
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		return c;
	}
	public static char nextLatter(char []arr,char ele)
	{
		int start=0;
		int end=arr.length-1;
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(ele==arr[mid])
			{
				return (char)arr[(mid+1)%arr.length];
			}
			else if(ele<arr[mid]) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		return (char) arr[start % arr.length];
	}
	//WAP to find floor of an element in sorted array
	public static int floor(int arr[],int ele)
	{
		
		int start=0;
		int end=arr.length-1;
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(ele==arr[mid])
			{
				return arr[mid];
			}
			if(ele<arr[mid])
			{
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		return arr[start];
	}
	//WAP to search in sorted roted array
	public static  int searchInRotedArray(int []arr,int ele)
	{
		int index=indexMin(arr);
		int index1=binarySearch(arr,0,index,ele);
		int index2=binarySearch(arr,index,arr.length-1,ele);
		if(index1==-1 && index2==-1)
		{
			return -1;
		}
		if(index1 !=-1)
		return index1;
		else return index2;
	}
	public static int binarySearch(int[] arr, int start, int end, int ele) {
		
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(arr[mid]==ele)
			{
				return mid;
			}
			else if(ele<arr[mid])
			{
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		return -1;
	}
    //WAP to search in nearly sorted  array
	public static int Search(int []arr,int ele)
	{
		int start=0;
		int end=arr.length-1;
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(ele==arr[mid])
			{
				return mid;
			}
			if(mid-1 >= start && arr[mid-1]==ele)
			{
				return mid-1;
			}
			if(mid+1<=end && arr[mid+1]==ele)
			{
				return mid+1;
			}
			else if(ele<arr[mid])
			{
				end=mid-2;
			}
			else {
				start=mid+2;
			}
		}
		return -1;
		
	}
	//WAP to count the number of rotation in sorted array
	public static int indexMin(int []arr)
	{
		int n=arr.length;
		int start=0;
		int end=n-1;
		while(start<=end)
		{
			if(arr[start]<=arr[end])
			{
				return start;
			}
			int  mid=start+(end-start)/2;
			int next=(mid+1)%n;
			int prev=(mid+n-1)%n;
			if(arr[mid]<=arr[next] && arr[mid]<=arr[prev])
			{
				return mid;
			}
			if(arr[mid]>=arr[start])
			{
				start=mid+1;
			}
			else {
				end=mid-1;
			}
		}
		return -1;
	}
	// WAP to  return index of smallest element in sorted   rotated  array
	public static int rotation(int []arr)
	{
		int n=arr.length;
		int start=0;
		int end=n-1;
		
		while(start<=end)
		{
			if (arr[start] <= arr[end]) {
	            return start;
	        }
			
			int mid=start+(end-start)/2;
			int next=(mid+1)%n;
			int prev=(mid+n-1)%n;
			
			if(arr[mid]<=arr[next] && arr[mid]<=arr[prev])
			{
				return mid;
			}
			//decide which side we need to move
			if(arr[mid]>=arr[start])
			{
				//left part is  sorted
				start=mid+1;
			}
			else if (arr[mid]<=arr[end]) {
				end=mid-1;
			}
		}
	
		return -1;
	}
    //WAP to count given element in sorted array
	public static int countElement(int []arr,int ele)
	{
		int first=firstOccurance(arr,ele);
		int last=lastOcurance(arr,ele);
		System.out.println(first+" "+last);
		return last-first+1;
	}
	private static int lastOcurance(int[] arr, int ele) {
		int res=-1;
		int start=0;
		int end=arr.length-1;
		while(start<=end)
		{
			int mid = start+(end-start)/2;
			if(ele==arr[mid])
			{
				res=mid;
				start=mid+1;
			}
			else if(ele<arr[mid])
			{
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		
		return res;
	}
	public  static int firstOccurance(int[] arr, int ele) {
		
		int res=-1;
		int start=0;
		int end=arr.length-1;
		while(start<=end)
		{
			int mid = start+(end-start)/2;
			if(ele==arr[mid])
			{
				res=mid;
				end=mid-1;
			}
			else if(ele<arr[mid])
			{
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		
		return res;
	}
	// WAP to find first and last index of sorted array
	public static int[] firstAndLastIndex(int arr[], int ele) {
		int first=-1;
		int last=-1;
		int a[] = { first, last };
		int start = 0;
		int end = arr.length - 1;
		// first index
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (ele == arr[mid]) {
				first=mid;
				a[0] = mid;
				end = mid - 1;

			} else if (ele < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		 start = 0;
		 end = arr.length - 1;

		// for last index
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (ele == arr[mid]) {
				last=mid;
				a[1] = mid;
				start = mid + 1;
			} else if (ele < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		if(first==last && first !=-1)
		{
			a[0]=first;
			a[1]=-1;
			return a;
		}
		
		return a;

	}

	// WAP to find first and last index in duplicated sorted array
	public static int lastOccurance(int[] arr, int ele) {
		int max = -1;
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (ele == arr[mid]) {
				max = mid;
				// end = mid - 1;
				start = mid + 1;
			} else if (ele < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return max;
	}
	// WAP for order Agnostic not sure about order

	public static int orderAgnostic(int arr[], int ele) {
		if (arr.length == 1) {
			if (arr[0] == ele)
				return 0;
			else
				return -1;
		}
		int start = 0;
		int end = arr.length - 1;
		if (arr[0] < arr[1])// Ascending order
		{
			while (start <= end) {
				int mid = start + (end - start) / 2;
				if (ele == arr[mid]) {
					return mid;
				} else if (ele < arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		} else {
			while (start <= end) {
				int mid = start + (end - start) / 2;
				if (ele == arr[mid]) {
					return mid;
				} else if (ele < arr[mid]) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			}

		}
		return -1;
	}

	// WAP to retrun the index from desc sorted array
	public static int indexDesc(int arr[], int ele) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (ele == arr[mid]) {
				return mid;
			} else if (ele < arr[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}

		}
		return -1;
	}

	// WAP to return index of element that are present in sorted array
	public static int indesPresent(int[] arr, int ele) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (ele == arr[mid]) {
				return mid;
			} else if (ele < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}

	// WAP to search an element present in sorted Array or not
	public static boolean isPresent(int[] arr, int target) {
		if (arr.length == 1) {
			if (target == arr[0])
				return true;
			else
				return false;
		}
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target == arr[mid]) {
				return true;
			} else if (target < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return false;
	}

}
