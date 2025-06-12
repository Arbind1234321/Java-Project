package geeksForGeeks;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;

public class KSizedSubarrayMaximum {

	public static void main(String[] args) {
		int arr[] = { 8, 5, 10, 7, 9, 4, 15, 12, 90, 13 };
		int k = 4;
		System.out.println(maxOfSubarrays1(arr, k));

	}

	public static ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> list1 = new ArrayList<>();

		int i = 0, j = 0;
		int size = arr.length;
		while (j < size) {
			list.add(arr[j]);
			if (j - i + 1 == k) {
				Collections.sort(list);
				list1.add(list.get(k - 1));
				list.remove(Integer.valueOf(arr[i]));
				i++;
			}
			j++;
		}
		return list1;

	}

	public static ArrayList<Integer> maxOfSubarrays1(int[] arr, int k) {
		ArrayList<Integer> result = new ArrayList<>();
		Deque<Integer> deque = new ArrayDeque<>();
		int n = arr.length;

		int i = 0, j = 0;

		while (j < n) {
			// Remove all smaller elements from the end
			while (!deque.isEmpty() && arr[deque.peekLast()] < arr[j]) {
				deque.pollLast();
			}

			// Add current index
			deque.offerLast(j);

			// Maintain window size
			if (j - i + 1 == k) {
				// Max is at the front
				result.add(arr[deque.peekFirst()]);

				// Remove the element going out of the window
				if (deque.peekFirst() == i) {
					deque.pollFirst();
				}
				i++;
			}
			j++;
		}

		return result;
	}

	public static int[] maxSlidingWindow(int[] nums, int k) {
		ArrayList<Integer> result = new ArrayList<>();
		Deque<Integer> deque = new ArrayDeque<>();
		int n = nums.length;

		int i = 0, j = 0;

		while (j < n) {
			// Remove all smaller elements from the end
			while (!deque.isEmpty() && nums[deque.peekLast()] < nums[j]) {
				deque.pollLast();
			}

			// Add current index
			deque.offerLast(j);

			// Maintain window size
			if (j - i + 1 == k) {
				// Max is at the front
				result.add(nums[deque.peekFirst()]);

				// Remove the element going out of the window
				if (deque.peekFirst() == i) {
					deque.pollFirst();
				}
				i++;
			}
			j++;
		}
		int a[]=new int [result.size()];
		int t=0;
		for(int b:result)
		{
			a[t++]=b;
		}

		return a;

	}

}
