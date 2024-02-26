package seleniumprogram;

import java.util.Arrays;

//Inserting element in array at specific / given position. 
public class InsertingElementAtGivenPosition {

	public static void main(String[] args) {
		int[] arr = { 24, 1, 3, 6, 7 };
		int pos = 5;
		int ele = 100;
		int[] a = new int[arr.length + 1];

		for (int i = 0; i < a.length; i++) {
			if (i < pos - 1) {
				a[i] = arr[i];
			} else if (i == pos - 1) {
				a[i] = ele;
			} else {
				a[i] = arr[i - 1];
			}
		}
		// for printing using normal for loop
		for (int i = 0; i < a.length; i++) {
			if(i<a.length-1)
			System.out.print(a[i] + ",");
			else
				System.out.print(a[i] );	
		}
		System.out.println();
		//printing using pre define class called Arrays
		System.out.println(Arrays.toString(a));
		//printing using for each loop
		for(int b:a)
		{
			System.out.print(b+" ");
		}

	}

}
