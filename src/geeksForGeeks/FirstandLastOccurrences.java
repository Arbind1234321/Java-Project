package geeksForGeeks;

import java.util.ArrayList;

public class FirstandLastOccurrences {

	public static void main(String[] args) {

		int arr[]= {1, 2, 3};
		int target=7;
		System.out.println(find(arr, target));
	}

	public static ArrayList<Integer> find(int arr[], int target) {
		ArrayList<Integer> list=new ArrayList<>();
		int first= firstIndex(arr,target);
		int last=lastIndex(arr,target);
		list.add(first);
		list.add(last);
		return list;

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

}
