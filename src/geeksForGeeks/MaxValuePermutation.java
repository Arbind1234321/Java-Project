package geeksForGeeks;

import java.util.Arrays;

public class MaxValuePermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {5, 3, 2, 4, 1};
        System.out.println(maxValue(arr));
	}

	public static int maxValue(int arr[]) {
		Arrays.sort(arr);
		//int max=0;
		int n=arr.length;
		long result=0;
		for(int i=0;i<n;i++)
		{
			result = (result + ((long) arr[i] * i) % 1000000007) % 1000000007;
		}
		return (int)result;

	}

}
