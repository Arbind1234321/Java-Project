package geeksForGeeks;

import java.util.HashSet;

public class TwoSumPairwithGivenSum {

	public static void main(String[] args) {
		
		int arr[]= {1};
		int target=16;
		System.out.println(twoSum1(arr, target));
	}
	 public static boolean twoSum1(int arr[], int target) 
	 {
		 if(arr.length<2)
		 {
			 return false;
		 }
	       HashSet<Integer> set=new HashSet<>();
	       for(int a:arr)
	       {
	    	 
	    	   int x=target-a;
	    	   if(set.contains(x))
	    	   {
	    		   return true;
	    	   }
	    	   set.add(a);
	       }
	       
	       
	      return false;
	       
	 }
	 public static boolean twoSum(int arr[], int target) 
	 {
	       
	       if(arr.length<2) 
	       {
	    	   return false;
	       }
	       
	       for(int i =0;i<arr.length-1;i++)
	       {
	    	   for(int j=i;j<arr.length;j++)
	    	   {
	    		   if(target==arr[i]+arr[j])
	    		   {
	    			  return true; 
	    		   }
	    	   }
	       }
	       return false;
	       
	 }

}
