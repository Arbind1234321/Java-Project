package geeksForGeeks;

import java.util.ArrayList;
import java.util.HashMap;

public class SortElementsbyDecreasingFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {5, 5, 4, 6, 4};
		System.out.println(sortByFreq(arr1));

	}
	 public static  ArrayList<Integer> sortByFreq(int arr[]) {
		 ArrayList<Integer> list=new ArrayList<Integer>();
		 HashMap<Integer, Integer> map =new HashMap<>();
		 for(int a:arr)
		 {
			 map.put(a, map.getOrDefault(a, 0)+1);
		 }
		 for(int a:arr)
		 {
			 list.add(a);
		 }
		 // Step 3: Sort using custom comparator
	        list.sort((a, b) -> {
	            int freqCompare = map.get(b) - map.get(a); // Descending frequency
	            if (freqCompare == 0) {
	                return a - b; // Ascending value if frequency is same
	            }
	            return freqCompare;
	        });
		 return list;
	    }

}
