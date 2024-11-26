package com.array;
import java.util.Arrays;
//finding non duplicate from Array
import java.util.HashMap;
public class FindingDistinctElementInArray {

	public static void main(String[] args) {
		int arr[] = { 2, 2, 24, 4, 6, 6 };
		int b[]= new int [2];
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i]) + 1);
			} else {
				hm.put(arr[i], 1);
			}
		}
		int i=0;
		for (int y : hm.keySet()) {

			if (hm.get(y) == 1) 
			{
				
			   b[i++]=y;
			}
		}
		System.out.println(Arrays.toString(b));

	}

}
