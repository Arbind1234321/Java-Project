package geeksForGeeks;

import java.util.HashMap;

public class LongestSubarraywithSumK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static int longestSubarray(int[] arr, int k) {
		 int ans=0;
		 HashMap<Integer, Integer> map=new HashMap<>();
		 int n=arr.length;
		 int sum=0;
		 for(int i=0;i<n;i++)
		 {
			 sum +=arr[i];
			 if(sum==k)
			 {
				 ans=i+1;
			 }
			 else if(map.get(sum-k) !=null)
			 {
				 ans=Math.max(ans, i-map.get(sum-k));
			 }
			 if(map.get(sum)==null)
			 {
				 map.put(sum,i);
			 }
		 }
		 return ans;
	 }

}
