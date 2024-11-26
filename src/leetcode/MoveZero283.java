 package leetcode;

import java.util.Arrays;

public class MoveZero283 {
	public static void moveZeros(int []arr) 
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				count++;
			}
			else
			{
				int temp=arr[i];
				arr[i]=arr[i-count];
				arr[i-count]=temp;
				
			}
		}
	}

	public static void main(String[] args) {
		int []arr= {1,0,2,5,0,3,0,2};
		moveZeros(arr);
		System.out.println(Arrays.toString(arr));

	}

}
