package geeksForGeeks;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int []arr= {1, 2, 3, 4};
   System.out.println(firstRepeated(arr));
   
	}

	 public static int firstRepeated(int[] arr) {
		 Map<Integer, Integer> freqMap = new HashMap<>();

	        // First pass: Count frequencies
	        for (int num : arr) {
	            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
	        }

	        // Second pass: Find first element with freq > 1
	        for (int i = 0; i < arr.length; i++) {
	            if (freqMap.get(arr[i]) > 1) {
	                return i + 1; // return 1-based index
	            }
	        }

	        return -1;
	        
}
}
