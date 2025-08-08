package geeksForGeeks;

import java.util.HashMap;

public class SubarrayswithsumK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {10, 2, -2, -20, 10}; int k = -10;
		System.out.println(countSubarrays(arr, k));
		
	}
	  public static int countSubarrays(int arr[], int k) {
	      int ans=0;
	      HashMap<Integer, Integer> map= new HashMap<>();
	      map.put(0, 1);
	      int sum=0;
	      for(int i=0;i<arr.length;i++)
	      {
	    	  sum=sum+arr[i];
	    	  if(map.containsKey(sum-k))
	    	  {
	    		  ans=ans+map.get(sum-k);
	    	  }
	    	  map.put(sum, map.getOrDefault(sum, 0)+1);
	      }
	      return ans;
	        
	    }

}
