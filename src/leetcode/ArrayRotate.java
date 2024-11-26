package leetcode;

import java.util.Arrays;

public class ArrayRotate {

	public static void reverse(int[] a, int start, int end) {
		while (start < end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
	}

	public static void rotate(int[] nums, int k) {
		int n=nums.length;
		k = k % nums.length;
		if(k<0)
		{
			k=k+nums.length;
		}
		reverse(nums, 0, n - 1);
		reverse(nums, 0, k-1);
		reverse(nums,k,n - 1);
		

	}

	public static void main(String[] args) {
		int nums[] = {1,2,3,4,5,6,7};
		int k = 3;
		rotate(nums, k);
		System.out.println(Arrays.toString(nums));

	}

}
