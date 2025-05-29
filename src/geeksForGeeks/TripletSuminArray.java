package geeksForGeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TripletSuminArray {

	public static void main(String[] args) {

	}

	public static boolean hasTripletSum(int arr[], int sum) {
		Arrays.sort(arr);
		int n=arr.length;
		for(int i=0;i<n-2;i++)
		{
			int left=i+1;
			int right=n-1;
			while(left<right)
			{
				int s=arr[i]+arr[left]+arr[right];
				if(sum==s)
				{
					return true;
				}
				else if(s<sum)
				{
					left++;
					
				}
				else {
					right--;
				}
			}
		}
          
		return false;
	}

}
