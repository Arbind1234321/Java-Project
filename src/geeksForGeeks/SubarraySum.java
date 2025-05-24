package geeksForGeeks;

import java.util.ArrayList;

public class SubarraySum {

	public static void main(String[] args) {
		int []arr= {1, 2, 3, 7, 5};
		int target=50;
    System.out.println(subarraySum(arr,target));
	}
	static ArrayList<Integer> subarraySum(int[] arr, int target)
	{
		int n=arr.length;
		ArrayList<Integer> list=new ArrayList<>();
		int start=0;
		int end=0;
		int sum=0;
		while(end<n)
		{
			sum=sum+arr[end];
			while(sum>target && end<n )
			{
				sum=sum-arr[start];
				start++;
			}
			if(sum==target)
			{
				list.add(start+1);
				list.add(end+1);
				return list;
				
			}
			end++;
		}
		list.add(-1);
		return list;
	}

}
