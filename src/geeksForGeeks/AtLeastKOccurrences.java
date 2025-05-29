package geeksForGeeks;

import java.util.HashMap;

public class AtLeastKOccurrences {

	public static void main(String[] args) {
		int arr[]= {10, 8, 2};
		System.out.println(firstElementKTime(arr, 10));

	}
	 public static int firstElementKTime(int[] arr, int k) {
		 
		 HashMap<Integer, Integer> map=new HashMap<>();
		 for(int a:arr)
		 {
			 map.put(a, map.getOrDefault(a, 0)+1);
			 if (map.get(a) == k) {
	                return a; 
	            }
		 }
		  
		  return -1;
	       
	    }

}
