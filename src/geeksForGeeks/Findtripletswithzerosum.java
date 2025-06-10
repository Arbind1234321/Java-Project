package geeksForGeeks;

import java.util.Arrays;

public class Findtripletswithzerosum {

	public static void main(String[] args) {
		int arr[] = {-5, 3, 2, -1, 0, 1};
		System.out.println(findTriplets(arr));
	}

	public static boolean findTriplets(int[] arr) {
		if(arr==null || arr.length<3) return false;
		Arrays.sort(arr);
		for(int i=0;i<arr.length-2;i++)
		{
			int left=i+1;
			int right=arr.length-1;
			while(left<right)
			{
				int sum=arr[i]+arr[left]+arr[right];
				if(sum==0)
				{
					return true;
				}
				else if(sum<0)
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
