package geeksForGeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Firstnegativeineverywindowofsizek {

	public static void main(String[] args) {
	int arr[]= {1,-1,-3,-2,3}; int k=3,x=2;
	//System.out.println(firstNegInt(arr, k));
	System.out.println(Arrays.toString(getSubarrayBeauty(arr, k, x)));

	}
	 static List<Integer> firstNegInt(int arr[], int k) {
	      ArrayList<Integer> list=new ArrayList<>();
	      ArrayList<Integer> list1=new ArrayList<>();
	      int size=arr.length;
	      int i=0,j=0;
	      while(j<size)
	      {
	    	  //Calculation 
	    	  if(arr[j]<0)
	    	  {
	    		  list1.add(arr[j]);
	    	  }
	    	  if(j-i+1<k)
	    	  {
	    		  j++;
	    		  
	    	  }
	    	  //try to find ans from calculation and move the window
	    	  else if(j-i+1==k)
	    	  {
	    		 if(list1.size()==0)
	    		 {
	    			 list.add(0);
	    		 }
	    		 else {
	    			list.add(list1.get(0));
	    			
	    		 }
	    		 if(list1.contains(arr[i]))
		    			list1.remove(0);
	    		 i++;
	    		 j++;
	    	  }
	      }
	      
	      
	      return  list;
	        
	    }

	 public static int[] getSubarrayBeauty(int[] arr, int k, int x) {
		 
		 ArrayList<Integer> list=new ArrayList<>();
	      ArrayList<Integer> list1=new ArrayList<>();
	      int size=arr.length;
	      int i=0,j=0;
	      while(j<size)
	      {
	    	  //Calculation 
	    	  if(arr[j]<0)
	    	  {
	    		  list1.add(arr[j]);
	    	  }
	    	  if(j-i+1<k)
	    	  {
	    		  j++;
	    		  
	    	  }
	    	  //try to find ans from calculation and move the window
	    	  else if(j-i+1==k)
	    	  {
	    		  Collections.sort(list1);
	    		 if(list1.size()==0)
	    		 {
	    			 list.add(0);
	    		 }
	    		  
	    		 else {
	    			 
	    			list.add(list1.get(x-1));
	    			
	    			
	    		 }
	    		 if (arr[i] < 0) {
	                    list1.remove(Integer.valueOf(arr[i]));
	                }	    	
	    		 i++;
	    		 j++;
	    	  }
	      }
	      
	      int a[]=new int[list.size()];
	      int t=0;
	      for(int b:list)
	      {
	    	  a[t++]=b;
	      }
	      
	      return  a;
	        
	        
	    }

	 
	
		 public static int[] getSubarrayBeauty1(int[] arr, int k, int x) {
		        ArrayList<Integer> result = new ArrayList<>();
		        int[] freq = new int[101]; // from -50 to 50 mapped to 0 to 100

		        int size = arr.length;
		        int i = 0, j = 0;

		        while (j < size) {
		            if (arr[j] < 0) {
		                freq[arr[j] + 50]++;
		            }

		            if (j - i + 1 < k) {
		                j++;
		            } else if (j - i + 1 == k) {
		                result.add(getXthSmallestNegative(freq, x));

		                // remove outgoing element if negative
		                if (arr[i] < 0) {
		                    freq[arr[i] + 50]--;
		                }

		                i++;
		                j++;
		            }
		        }

		        // Convert list to array
		        int[] output = new int[result.size()];
		        for (int idx = 0; idx < result.size(); idx++) {
		            output[idx] = result.get(idx);
		        }

		        return output;
		    }

		    private static int getXthSmallestNegative(int[] freq, int x) {
		        int count = 0;
		        for (int i = 0; i < 50; i++) { // only negative numbers from -50 to -1
		            count += freq[i];
		            if (count >= x) {
		                return i - 50;
		            }
		        }
		        return 0;
	 }
}
