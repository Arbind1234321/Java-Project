package geeksForGeeks;

import java.util.Arrays;

public class RearrangeArrayAlternately {

	public static void main(String[] args) {
     int  [] arr={891 ,71 ,185 ,651 ,518};
     rearrange(arr);
	}

	public static void rearrange(int arr[]) {
		int n=arr.length;
		Arrays.sort(arr);
		int []ar=new int[n];
		int i=0;
		int a=0;
		int j=n-1;
		while(i<j)
		{
			
			ar[a++]=arr[j--];
		
			ar[a++]=arr[i++];
			
		}
		 if (n % 2 != 0) {
	            ar[a] = arr[i]; // i == j here
	        }
	
		System.out.println(Arrays.toString(ar));

	}

}
