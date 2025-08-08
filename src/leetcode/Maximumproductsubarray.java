package leetcode;

public class Maximumproductsubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int maxProduct(int[] nums) {
		int max_prod=Integer.MIN_VALUE;
		int left_product=1;
		int right_product=1;
		for(int i=0;i<nums.length;i++)
		{
			if(left_product==0)
				left_product=1;
			if(right_product==0)
				right_product=1;
			
			left_product *= nums[i];
			right_product *= nums[nums.length-1-i];
			max_prod=Math.max(max_prod, Math.max(left_product, right_product));
		}
		
		return max_prod;

	}

}
