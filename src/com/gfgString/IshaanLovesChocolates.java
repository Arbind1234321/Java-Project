package com.gfgString;

public class IshaanLovesChocolates {

	public static void main(String[] args) {
		int arr[ ] = {5, 9, 2, 6};
		System.out.println(chocolates(0, arr));
	
	}
	 public static int chocolates(int n, int[] arr) {
	       int s=0;
	       int l=arr.length-1;
	       while(s<=l)
	       {
	    	   if(arr[s]<arr[l])
	    	   {
	    		   l--;
	    	   }
	    	   else {
	    		   s++;
	    	   }
	       }
	       return arr[l];
	        
	    }
}
