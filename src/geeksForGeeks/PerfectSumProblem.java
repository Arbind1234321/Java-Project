package geeksForGeeks;

import java.util.HashMap;

public class PerfectSumProblem {

	public static void main(String[] args) {
		int arr[] = {5, 2, 3, 10, 6, 8} ;int target = 10;
		System.out.println(perfectSum(arr, target));
	}
	 public static int perfectSum(int[] nums, int target) {
	        int ans=0;
	        int sum=0;
	        HashMap<Integer, Integer> map=new HashMap<>();
	        map.put(0, 1);
	        for(int i=0;i<nums.length;i++)
	        {
	        	sum +=nums[i];
	        	if(map.containsKey(sum-target))
	        	{
	        		ans +=map.get(sum-target);
	        	}
	        	map.put(sum, map.getOrDefault(sum, 0)+1);
	        }
	        return ans;
	        
	    }

}
