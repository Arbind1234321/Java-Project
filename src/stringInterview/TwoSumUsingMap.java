package stringInterview;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumUsingMap {

	public static int[] twoSum(int[] arr, int target) {
		HashMap<Integer, Integer> hm = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			int req=target-arr[i];
			if(hm.containsKey(req))
			{
				int []a= {hm.get(req),i};
				return a;
			}
			else
			{
			hm.put(arr[i], i);	
			}
		}
		System.out.println(hm);
		return null;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 7, 11, 15 };
		int target = 9;
		System.out.println(Arrays.toString(twoSum(arr, target)));

	}

}
