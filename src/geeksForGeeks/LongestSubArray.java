package geeksForGeeks;

import java.util.HashMap;

public class LongestSubArray {

	public static void main(String[] args) {
		int[] arr = {4,1,1,1,2,3,5};
		int n = arr.length;
		int k = 5;
		//System.out.println(longestSubArray(arr, k, n));
//5
		//17 15
		//-13, 0, 6, 15, 16, 2, 15, -12, 17, -16, 0, -3, 19, -3 ,2 ,-9, -6
		//System.out.println(longestSubArrayBrute(arr, k, n));
		System.out.println(subArraySum(arr, k, n));
		
	}

	
   public static int longestSubArray(int[] arr, int k, int n) {
		int i = 0;
		int j = 0;
		int max = 0;
		int sum = 0;
		boolean flag=false;
		while (j < n) {
			sum = sum + arr[j];
			
			if (sum < k) {
				j++;
			} else if (sum == k) {
				flag=true;
				if (max < j - i + 1) {
					max = j - i + 1;
				
				}
				j++;

			}
			if (sum > k) {
				while (sum > k) {
					sum = sum - arr[i];
					i++;
				}
				j++;

			}

		}
		if(flag)
		return max;
		else
			return 0;
	}

  public static int longestSubArrayBrute(int []arr,int k,int n)
  {
	  int max=0;
	  for(int i=0;i<n-1;i++)
	  {
		  for(int j=i+1;j<n;j++)
		  {
			  if(arr[i]+arr[j]==k)
			  {
				max=j-i+1;  
			  }
		  }
	  }
	  return max;
  }
  public static int subArraySum(int []nums,int k,int n)
  {
	  if (nums == null || nums.length == 0) return 0;
      HashMap<Integer, Integer> map = new HashMap<>();
     // map.put(0, -1);
      int preSum = 0, max = 0;
      for (int i = 0; i < nums.length; i++) {
          preSum += nums[i];
          if (map.containsKey(preSum - k)) {
              max = Math.max(max, i - map.get(preSum - k));
          }
          else {
              map.put(preSum, i);
          }
      }
      return max;
  }

}
