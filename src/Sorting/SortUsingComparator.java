package Sorting;

import java.util.Arrays;
import java.util.Comparator;

public class SortUsingComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Integer[] arr = {5, 2, 9, 1, 5, 6};
		 sortArray1(arr);

	}
	public static void sortArray(Integer arr[])
	{
		

	        // Sort in descending order using a comparator
	        Arrays.sort(arr, new Comparator<Integer>() {
	            public int compare(Integer a, Integer b) {
	                return b-a; // descending
	            }
	        });
	        System.out.println(Arrays.toString(arr));
	}
	public static void sortArray1(Integer arr[])
	{
		

	        // Sort in descending order using a comparator
	        Arrays.sort(arr,(a,b)->a-b);
	      //  System.out.println(Arrays.toString(arr));
	       // Arrays.stream(arr).forEach(System.out::println);
	        Arrays.stream(arr).forEach(e -> System.out.print(e + " "));
	}

}
