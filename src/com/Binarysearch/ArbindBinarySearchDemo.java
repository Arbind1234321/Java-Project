package com.Binarysearch;

public class ArbindBinarySearchDemo {

	public static void main(String[] args) {
		int[] arr = {1, 28 ,36 ,44 ,48 ,64 ,78 ,78};
		// int[] arr = { 5, 10, 30, 20, 40 };
		int target = 1;
		// char []arr= {'a','b','c','f','h'};
		// char target='h';
		// System.out.println(indexOfElement(arr, target));
		// System.out.println(indexOfElementdes(arr, target));
		// System.out.println(orderAgnostic(arr, target));
		 System.out.println(firstIndex(arr, target));
		// System.out.println(lastIndex(arr, target));
		// System.out.println(countOfElement(arr, target));
		// System.out.println(numberOfTimesRoated(arr));
		// System.out.println(searchIndexInRotatedArray(arr, target));
		// System.out.println(nearlySorted(arr, target));
		// System.out.println(floorOfNumber(arr, target));
		// System.out.println(ceilOfNumber(arr, target));
		// System.out.println(ceil(arr, target));
		// System.out.println((char)nextLatter(arr, target));
		// System.out.println(infinteArray(arr, target));
		// System.out.println(infiniteArray1(arr, target));
		// System.out.println(infiniteBinarySorted(arr, target));
	 System.out.println(minimumDiff(arr, target));
		//System.out.println(peakElement(arr));
		//System.out.println(bitonicArray(arr));
		//System.out.println(searchBiotonic(arr, target));

	}

	// 1. )Find the index for given target element in ascending sorted array
	public static int indexOfElement(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target == arr[mid]) {
				return mid;
			} else if (target < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}

	// 2.)Find the index for given target element in descending sorted array
	public static int indexOfElementdes(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target == arr[mid]) {
				return mid;
			} else if (target < arr[mid]) {
				start = start + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
	}
	// 3.) find the index of given target number and the array is in order agnostic

	public static int orderAgnostic(int[] arr, int target) {
		int size = arr.length;
		if (size == 1) {
			if (target == arr[0]) {
				return 0;
			} else {
				return -1;
			}
		}
		int start = 0;
		int end = size - 1;
		if (arr[0] < arr[1])// ascding order
		{
			while (start <= end) {
				int mid = start + (end - start) / 2;
				if (target == arr[mid]) {
					return mid;
				} else if (target < arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
			return -1;
		} else {

			while (start <= end) {
				int mid = start + (end - start) / 2;
				if (target == arr[mid]) {
					return mid;
				} else if (target < arr[mid]) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			}
			return -1;
		}

	}

	// 4.)Find the first occurrence in duplicated sorted array

	public static int firstIndex(int[] arr, int target) {
		int start = 0;
		int res = -1;
		int end = arr.length - 1;
		while (start <=end) {
			int mid = start + (end - start) / 2;
			if (target == arr[mid]) {
				res = mid;
				end = mid - 1;
			} else if (target < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}

		}
			return res;
	}

	// 4.)Find the last occurrence in duplicated sorted array
	public static int lastIndex(int[] arr, int target) {
		int start = 0;
		int res = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target == arr[mid]) {
				res = mid;
				start = mid + 1;
			} else if (target < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		if (res == 0) {
			return -1;
		} else
			return res;
	}

	// 5.) count of element in sorted array
	public static int countOfElement(int[] arr, int target) {
		int first = firstIndex(arr, target);
		int last = lastIndex(arr, target);
		if (first == -1 && last == -1) {
			return -1;
		} else
			return last - first + 1;
	}

	// 6.)Number of times a sorted array is rotated
	public static int numberOfTimesRoated(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		int size = arr.length;
		int mid = 0;
		while (start <= end) {
			mid = start + (end - start) / 2;
			if (arr[mid] <= arr[(mid + size - 1) % size] && arr[mid] <= arr[(mid + 1) % size]) {
				return size - mid;
			}
			if (arr[start] < arr[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return 0;
	}

	// 7.) Find an element in a sorted rotated array

	public static int searchIndexInRotatedArray(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;

		int mid = start + (end - start) / 2;
		if (target == arr[mid]) {
			return mid;
		}

		int number = binarySearch(arr, target, numberOfTimesRoated(arr));
		int number1 = binarySearch1(arr, target, numberOfTimesRoated(arr));
		// System.out.println(number+" "+number1);
		if (number == number1) {
			return -1;
		}
		if (number > number1) {
			return number;
		} else {
			return number1;
		}
	}

	public static int binarySearch(int[] arr, int target, int index) {

		int start = 0;
		int end = index - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target == arr[mid]) {
				return mid;
			} else if (target < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}

	public static int binarySearch1(int[] arr, int target, int index) {

		int start = index;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target == arr[mid]) {
				return mid;
			} else if (target < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}

	// 8.)Searing nearly sorted array

	public static int nearlySorted(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target == arr[mid]) {
				return mid;
			}
			if (mid - 1 >= start && arr[mid - 1] == target) {
				return mid - 1;
			}
			if (mid + 1 <= end && arr[mid + 1] == target) {
				return mid + 1;
			}
			if (target < arr[mid]) {
				end = mid - 2;
			} else {
				start = mid + 2;
			}
		}
		return -1;
	}

	// 9.)Find the floor of an element in sorted Array
	public static int floorOfNumber(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		int mid = 0;
		while (start <= end) {
			mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (target < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return end;
	}

	// 10.)Find The ceil of number in sorted array

	public static int ceilOfNumber(int[] arr, int target) {
		if (target > arr[arr.length - 1]) {
			return -1;
		}
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (target < arr[mid]) {
				end = mid - 1;
			} else {

				start = mid + 1;
			}
		}
		return start;
	}
	// 11Approach 2 ceil of number

	public static int ceil(int[] arr, int target) {

		if (target > arr[arr.length - 1]) {
			return -1;
		}
		int start = 0;
		int end = arr.length - 1;
		int res = 0;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (target < arr[mid]) {
				res = mid;
				end = mid - 1;
			} else {

				start = mid + 1;
			}
		}
		return res;
	}

	// 12.) Next letter in sorted alphabet
	public static int nextLatter(char[] arr, char target) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target == arr[mid]) {
				return (char) arr[(mid + 1) % arr.length];
			} else if (target < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return (char) arr[start % arr.length];
	}

	// 13.)Find the position of an element in an infinite sorted array
	public static int infinteArray(int[] arr, int target) {
		int start = 0;
		int end = 1;
		boolean b = true;
		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (target == arr[mid]) {
				b = false;
				return mid;
			} else if (target < arr[mid]) {
				b = false;
				end = mid - 1;

			} else {
				start = mid + 1;
			}
			if (b) {
				end = end + (end - start + 1) * 2;
			}
		}
		return -1;
	}
	// 14.Approach 2 for infinite array

	public static int infiniteArray1(int[] arr, int target) {
		int start = 0;
		int end = 1;
		while (target > arr[end]) {
			start = end;
			end = end * 2;
		}
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (target < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}
	// 15.)Find the index of 1st 1 in a infinite binary sorted Array.

	public static int infiniteBinarySorted(int[] arr, int target) {

		int start = 0;
		int end = 1;
		int res = 0;
		while (target > arr[end]) {
			start = end;
			end = end * 2;
		}
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target == arr[mid]) {
				res = mid;
				end = mid - 1;
			} else if (target < arr[mid]) {
				end = mid - 1;
			} else {
				start = start + 1;
			}
		}
		return res;
	}

	// 16.)Find minimum difference of element in sorted Array

	public static int minimumDiff(int[] arr, int target) {
		if (target < arr[0] || target > arr[arr.length - 1]) {
			return -1;
		}
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target == arr[mid]) {
				return arr[mid];
			} else if (target < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		int x = Math.abs(arr[start] - target);
		int y = Math.abs(arr[end] - target);
		return x > y ? arr[end] : arr[start];
	}
	// 17.)Find the peak element in unsorted array

	public static int peakElement(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (mid > 0 && mid < end) {
				if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
					return mid;
				}

				else if (arr[mid] < arr[mid + 1]) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			}
			else if(mid==0)
			{
				if(arr[0]>arr[1]) return 0;
				else
					return 1;
			}
			else if(mid==end)
			{
				if(arr[end]>arr[end-1])
				{
					return end;
				}
				else return end-1;
			}

		}

		return -1;
	}
 
	//18.)Find the maximum element in Bitonic in array.
   public static int bitonicArray(int []arr)
   {
	   int start=0;
	   int  end=arr.length-1;
	   while(start<=end)
	   {
		   int mid=start+(end-start)/2;
		   if(mid>0 &&mid<end)
		   {
			  if(arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1])
			  {
				  return mid;
			  }
			  else if(arr[mid]<arr[mid+1])
			  {
				  start=mid+1;
			  }
			  else {
				  end=mid-1;
			  }
		   }
		   else if(mid==0)
			{
				if(arr[0]>arr[1]) return 0;
				else
					return 1;
			}
			else if(mid==end)
			{
				if(arr[end]>arr[end-1])
				{
					return end;
				}
				else return end-1;
			}
	   }
	   
	   return -1;
   }
	
   //19.) Search in biotonic Array
   
   public static int  searchBiotonic(int [] arr, int target)
   {
	    int index=peakElement(arr);
	    int x=binarySerachasc(arr,0,index-1,target );
	    int y=binarySerachdes(arr,index,arr.length-1,target );
	   
	   
	  if(x==-1&&y==-1)
	  {
		  return -1;
	  }
	  return x>y?x:y;
	   
   }

public static int binarySerachasc(int[] arr, int start, int end,int target) {
	
	while(start<=end)
	{
		int mid=start+(end-start)/2;
		if(target==arr[mid])
		{
			return mid;
		}
		else if(target<arr[mid])
		{
			end=end-1;
		}
		else
		{
			start=start+1;
		}
	}
	return -1;
}
public static int binarySerachdes(int[] arr, int start, int end,int target) {
	while(start<=end)
	{
		int mid=start+(end-start)/2;
		if(target==arr[mid])
		{
			return mid;
		}
		else if(target<arr[mid])
		{
			start=start+1;
		}
		else
		{
			end=mid-1;
		}
	}
	return -1;
}
   
}


