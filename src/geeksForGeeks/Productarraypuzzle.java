package geeksForGeeks;

import java.util.Arrays;

public class Productarraypuzzle {

	public static void main(String[] args) {
		int []arr= {10, 3, 5, 6, 2};
		System.out.println(Arrays.toString(productExceptSelf2(arr)));

	}
	public static int[] productExceptSelf2(int arr[]) {
		int n=arr.length;
		//Array to soring left multiplication
		int []left=new int[n];
		//Array to soring left multiplication
		int []right=new int[n];
		
		//left
		left[0]=1;
		for(int i=1;i<n;i++)
		{
			left[i]=left[i-1]*arr[i-1];
		}
		right[n-1]=1;
		for(int i=n-2;i>-1;i--)
		{
			right[i]=right[i+1]*arr[i+1];
		}
		//sorting multiplication
		for(int i=0;i<n;i++)
		{
			
			arr[i]=left[i]*right[i];
			
		}
		return  arr;
	}
	public static int[] productExceptSelf1(int arr[]) {
		 int n = arr.length;
	        int[] result = new int[n];

	        // Compute left products
	        result[0] = 1;
	        for (int i = 1; i < n; i++) {
	            result[i] = arr[i - 1] * result[i - 1];
	        }

	        // Compute right products and final result
	        int right = 1;
	        for (int i = n - 1; i >= 0; i--) {
	            result[i] = result[i] * right;
	            right *= arr[i];
	        }

	        return result;
	}
	 public static int[] productExceptSelf(int arr[]) {
	       int a[]=new int[arr.length];
	      
	       for(int i=0;i<arr.length;i++)
	       {
	    	   int pord=1;
	    	  for(int j=0;j<arr.length;j++)
	    	  {
	    		 if(j==i) 
	    		 {
	    			 
	    		 }
	    		 else {
	    			 pord *=arr[j];
	    		 }
	    	  }
	    	  a[i]=pord;
	       }
	       return a;
	        
	    }

}
