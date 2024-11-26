package geeksForGeeks;

import java.util.Arrays;

public class BasicOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		int x=8;
		int pos=4;
		int n=arr.length-1;
		insertElement(arr, n, x, pos);
		System.out.println(Arrays.toString(arr));
		

	}
	public static void insertElement(int arr[], int n, int x, int pos)
	{
	    // shift elements to the right
	    // which are on the right side of pos
	    for (int i = n - 1; i >= pos; i--)
	    {
	        arr[i + 1] = arr[i];
	    }
	    arr[pos] = x;
	}

}
