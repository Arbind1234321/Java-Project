package geeksForGeeks;

import java.util.Arrays;

public class ImmediateSmallerElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[]= {5, 6, 2, 3, 1, 7};
       immediateSmaller(arr);
	}

	public static void immediateSmaller(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				arr[i]=arr[i+1];
			}
			else {
				arr[i]=-1;
			}
		}
		arr[n-1]=-1;
		System.out.println(Arrays.toString(arr));

	}

}
