package com.pawanselenium;

public class SecondLargest {

	public static void main(String[] args) {
		//int arr[]= {13817 ,15695, 4474, 8356, 12695, 24341, 8839, 28059, 8337, 3532};
		int arr[]= {10,10,10,5};
		System.out.println(largestNumber(arr));

	}
	public static int largestNumber(int []arr)
	{
		 // Function to find the second largest element in the array
	    
	        int n = arr.length;

	        int largest = -1, secondLargest = -1;

	        // Finding the largest element
	        for (int i = 0; i < n; i++) {
	            if (arr[i] > largest)
	                largest = arr[i];
	        }

	        // Finding the second largest element
	        for (int i = 0; i < n; i++) {
	            
	            // Update second largest if the current element is greater
	            // than second largest and not equal to the largest
	            if (arr[i] > secondLargest && arr[i] != largest) {
	                secondLargest = arr[i];
	            }
	        }
	        return secondLargest;
	} 

}
