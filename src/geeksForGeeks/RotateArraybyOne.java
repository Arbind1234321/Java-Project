package geeksForGeeks;

import java.util.Arrays;

public class RotateArraybyOne {

	public static void main(String[] args) {
		int arr[]= {8, 3, 1, 2};
		r(arr);

	}
	  public static void rotate(int[] arr ) {
		  
		   int temp=arr[arr.length-1];
		   int a []=new int[arr.length];
		  for(int i=1;i<arr.length;i++)
		  {
			  a[i]=arr[i-1];
			  
		  }
		  a[0]=temp;
		  System.out.println(Arrays.toString(a));
		  
	       
	        
	    }
	  public static void r(int []arr) {
		  
		  
		  int temp = arr[arr.length - 1]; // Store the last element

		  for (int i = arr.length - 1; i > 0; i--) {
		      arr[i] = arr[i - 1]; // Shift elements one position to the right
		  }

		  arr[0] = temp;
		  System.out.println(Arrays.toString(arr));
	  }

}
