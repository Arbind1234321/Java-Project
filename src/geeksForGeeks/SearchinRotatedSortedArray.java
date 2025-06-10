package geeksForGeeks;

public class SearchinRotatedSortedArray {

	public static void main(String[] args) {
		int arr[] = {2 ,3 ,4 ,5 ,1};
		int key = 1;
		System.out.println(search(arr, key));
	}

	public static int search(int[] arr, int key) {
		int index = indexMin(arr);
		System.out.println(index);
		int index1 = binarySearch(arr, 0, index, key);
		int index2 = binarySearch(arr, index, arr.length - 1, key);

		if (index1 == -1 && index2 == -1) {
			return -1;
		}
		if (index1 != -1) {
			return index1;
		} else
			return index2;
	}

	public static int binarySearch(int[] arr, int start, int end, int key) {
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (key == arr[mid]) {
				return mid;
			} else if (key < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}

	public static int indexMin(int[] arr) {
		int n = arr.length;
		int start = 0;
		int end = n - 1;
		while (start <= end) {
			if (arr[start] <=arr[end]) {
				return start;
			}
			int mid = start + (end - start) / 2;
			int next = (mid + 1) % n;
			int prev = (mid + n - 1) % n;
			if (arr[mid] <=arr[next] && arr[mid] <=arr[prev]) {
				return mid;
			} if (arr[mid] >= arr[start]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return 0;
	}
}
