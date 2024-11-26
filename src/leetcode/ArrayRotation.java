package leetcode;

import java.util.Arrays;

public class ArrayRotation {
	public static void arrayRotateONE(int[] nums) {
		int temp = nums[0];
		for (int i = 1; i < nums.length; i++) {
			nums[i - 1] = nums[i];
		}
		nums[nums.length - 1] = temp;
	}
	
	public static void rotate(int []a,int k)
	{
		k=k%a.length;
		if(k<0)
		{
			k=k+a.length;
		}
		for(int i=0;i<k;i++)
		{
			arrayRotateONE(a);
			//System.out.println(Arrays.toString(a));
		}
		
	}

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4, 5,6,7 };
		int k = 3;
		arrayRotateONE(nums);
		//rotate(nums,k);
		System.out.println(Arrays.toString(nums));
		
	}

}
