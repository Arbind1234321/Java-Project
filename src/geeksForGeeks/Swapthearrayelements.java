package geeksForGeeks;

import java.util.Arrays;

public class Swapthearrayelements {

	public static void main(String[] args) {
		int []arr= {1, 2,3};
		swapElements(arr);
		System.out.println(Arrays.toString(arr));

	}

	public static void swapElements(int[] arr) {
		int n=arr.length;
		int i=0;
		int j=i+2;
		  while(j<n)
		{
			int temp=arr[i];
			arr[i]=arr[i+2];
			arr[i+2]=temp;
			i++;
			j++;
		}

	}

}
