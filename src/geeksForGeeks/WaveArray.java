package geeksForGeeks;

import java.util.Arrays;

public class WaveArray {
	public static void main(String[] args) {
		int arr[] = {2, 4, 7, 8, 9, 10};
		convertToWave(arr);
	}
	 public static void convertToWave(int[] arr) {
		 int start=0;
		 int end=1;
	       
		 while(end<arr.length) {
			 
			 int temp=arr[start];
			 arr[start]=arr[end];
			 arr[end]=temp;
			 start=start+2;
			 end=end+2;
		 }
		 System.out.println(Arrays.toString(arr));
	        
	    }

}
