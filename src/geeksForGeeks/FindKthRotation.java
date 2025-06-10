package geeksForGeeks;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FindKthRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer []arr = {5, 1, 2, 3, 4};
		   List<Integer>li =new LinkedList(Arrays.asList(arr));
		  System.out.println(findKRotation(li));

	}
	 public static int findKRotation(List<Integer> arr) {
		 int n = arr.size();
		    int low = 0;
		    int high = n - 1;

		    while (low <= high) {
		        // Case when the subarray is already sorted
		        if (arr.get(low) <= arr.get(high)) {
		            return low;
		        }

		        int mid = low + (high - low) / 2;
		        int next = (mid + 1) % n;
		        int prev = (mid + n - 1) % n;

		        // Check if mid is minimum
		        if (arr.get(mid) <= arr.get(next) && arr.get(mid) <= arr.get(prev)) {
		            return mid;
		        }

		        // Decide which side to go
		        if (arr.get(mid) >= arr.get(low)) {
		            // Left part is sorted, go right
		            low = mid + 1;
		        } else {
		            // Right part is sorted, go left
		            high = mid - 1;
		        }
		    }

		    return 0; // fallback, should never hit for valid rotated sorted arrays
	        
	    }

}
