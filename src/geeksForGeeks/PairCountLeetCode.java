package geeksForGeeks;

import java.util.Arrays;
import java.util.HashMap;

public class PairCountLeetCode {

	public static void main(String[] args) {
	int []arr= {1,-1,0};int  k = 0;
	System.out.println(pair(arr, k));
	System.out.println(leetpair(arr, k));
	System.out.println(leetBrute(arr, k));

	}
	public static int pair(int []arr,int k)
	{
		int sum=0, i=0,j=0,count=0;
		int n=arr.length;
		while(j<n)
		{
			sum=sum+arr[j];
			if(sum<k)
			{
				j++;
			}
			else if(sum==k)
			{
				count++;
				j++;
			}
			if(sum>k) {
				while(sum>k) {
					sum=sum-arr[i];
					i++;
				}
				j++;
			}
		}
		return count;
	}
    
	public static int leetpair(int []arr,int k)

	{
		if (arr == null || arr.length == 0) return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int preSum = 0, max = 0;
        for (int i = 0; i < arr.length; i++) {
            preSum += arr[i];
            if (map.containsKey(preSum - k)) {
              //max = Math.max(max, i - map.get(preSum - k));
            	max++;
            }
            if (!map.containsKey(preSum)) {
                map.put(preSum, i);
            }
        }
        return max;
	}
   public static int leetBrute(int []nums,int k)
   {
	   int count = 0;
	      
       int[] sum = new int[nums.length + 1];
       sum[0] = 0;
       for (int i = 1; i <= nums.length; i++)
           sum[i] = sum[i - 1] + nums[i - 1];
       System.out.println(Arrays.toString(sum));
     
       for (int start = 0; start < sum.length; start++) {
           for (int end = start + 1; end < sum.length; end++) {
               if (sum[end] - sum[start] == k)
                   count++;
           }
       }
     
       return count;
	 
   }

}
