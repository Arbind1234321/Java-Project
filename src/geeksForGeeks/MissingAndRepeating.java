package geeksForGeeks;

import java.util.ArrayList;

public class MissingAndRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int []arr= {4, 3, 6, 2, 1, 1};
 System.out.println( findTwoElement(arr));
	}
	public static ArrayList<Integer> findTwoElement(int arr[]) {
		 ArrayList<Integer> list = new ArrayList<>();
	        ArrayList<Integer> list1 = new ArrayList<>();

	        for (int i = 1; i <= arr.length; i++) {
	            list.add(i);  // list = [1, 2, 3, ..., n]
	        }

	        int repeating = -1;

	        for (int i = 0; i < arr.length; i++) {
	            if (list.contains(arr[i])) {
	                list.remove((Integer) arr[i]); 
	            } else {
	                repeating = arr[i]; 
	            }
	        }

	        int missing = list.get(0); 

	        list1.add(repeating);
	        list1.add(missing);
	        return list1;
        
    }
	ArrayList<Integer> findTwoElement1(int arr[]) {
        int n = arr.length;
        int[] count = new int[n + 1]; 
        ArrayList<Integer> result = new ArrayList<>();

        // Count occurrences of each number
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        int repeating = -1, missing = -1;

        // Find repeating and missing
        for (int i = 1; i <= n; i++) {
            if (count[i] == 0) {
                missing = i;
            } else if (count[i] == 2) {
                repeating = i;
            }
        }

        result.add(repeating);
        result.add(missing);
        return result;
        
    }

}
