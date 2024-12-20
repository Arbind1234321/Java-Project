package arbind.BinarySearch;

//order agnostic problem
public class OrderAgnostic {
	public static void main(String[] args) {
     int [] arr= {1};
     int target=2;
     System.out.println(orderAgnosticSeacrch(arr, target));
	}

	public static int orderAgnosticSeacrch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {

			if (arr.length <= 1) {
				System.out.println("contain only one element");
				return -1;
				
			}

			if (arr[0] < arr[1]) {
				int mid = start + (end - start) / 2;
				if (target < arr[mid]) {
					end = mid - 1;
				} else if(target > arr[mid]){
					start = mid + 1;
				}
				else
				{
					return mid;
				}
			} else {
				int mid = start + (end - start) / 2;
				if (target < arr[mid]) {
					start = mid + 1;
				} else if(target >arr[mid]){
					end = mid - 1;
				}
				else
				{
					return  mid;
				}
			}
			
		}
		return -1;
	}

}
