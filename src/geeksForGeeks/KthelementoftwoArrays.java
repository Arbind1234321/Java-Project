package geeksForGeeks;

import java.util.Arrays;

public class KthelementoftwoArrays {

	public static void main(String[] args) {
		int  a[] = {100, 112, 256, 349, 770}, b[] = {72, 86, 113, 119, 265, 445, 892}; int k = 7;
		System.out.println(kthElement(a, b, k));

	}
	 public static int kthElement(int a[], int b[], int k) {
	    
		 int n=a.length;
		 int m=b.length;
		 int arr[]= new int[n+m];
		 int index=0;
		 for(int x: a) {
			 arr[index++]=x;
		 }
		 for(int x: b) {
			 arr[index++]=x;
		 }
		 Arrays.sort(arr);
		 
		 return arr[k-1];
	        
	    }

}
