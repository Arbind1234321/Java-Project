package geeksForGeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		int nums1[] = { 4, 1, 2 };
		int nums2[] = { 1, 3, 4, 2 };// [-1,3,-1]
		System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
	}// [3, 4, 4, -1] [8, -1, 1, 3, -1]

	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
		   int[] a = new int[nums1.length];

		       long max=Integer.MIN_VALUE;
		       long min= Integer.MAX_VALUE;
		    for (int i = 0; i < nums1.length; i++) {
		        int ele = nums1[i];
		        int idx = -1;

		        // Find the index of ele in nums2
		        for (int j = 0; j < nums2.length; j++) {
		            if (nums2[j] == ele) {
		                idx = j;
		                break;
		            }
		        }

		        // Now search for the next greater element in nums2 starting from idx + 1
		        int nextGreater = -1;
		        for (int j = idx + 1; j < nums2.length; j++) {
		            if (nums2[j] > ele) {
		                nextGreater = nums2[j];
		                break;
		            }
		        }

		        a[i] = nextGreater;
		    }

		    return a;

	}

	public static ArrayList<Integer> nextLargerElement1(int[] arr) {
		ArrayList<Integer> list = new ArrayList<>();
		Stack<Integer> stack = new Stack<>();
		for (int i = arr.length - 1; i >= 0; i--) {
			// if stack is emptyy
			int ele = arr[i];

			if (stack.isEmpty()) {
				stack.push(ele);
				list.add(-1);
				continue;

			}
			// if top of the stack is greater then next is top
			if (stack.peek() > ele) {

				list.add(stack.peek());
				stack.push(ele);
				continue;

			}
			while (!stack.isEmpty() && stack.peek() <= ele) {
				stack.pop();
			}
			if (stack.isEmpty()) {
				list.add(-1);
			} else {
				list.add(stack.peek());
			}
			stack.push(ele);

		}
		Collections.reverse(list);
		System.out.println(list);
		return list;

	}

	public static ArrayList<Integer> nextLargerElement(int[] arr) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			int n = arr[i];
			boolean t = true;
			int count = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (n < arr[j] && count == 0) {
					list.add(arr[j]);
					t = false;
					count++;
				}
			}
			if (t)
				list.add(-1);
		}
		System.out.println(list);
		return list;

	}

}
