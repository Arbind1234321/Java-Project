package com.array;
//Finding duplicate element from Array using hashmap
import java.util.HashMap;
public class FindDuplicateInArray {

	public static void main(String[] args) {

		int arr[] = { 2, 3, 3, 2, 4, 4, 5, 6 };
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i]) + 1);
			} else {

				hm.put(arr[i], 1);
			}
		}
		System.out.println(hm);
		for (int y : hm.keySet()) {
			if (hm.get(y) > 1) {
				System.out.println(y);
			}
		}

	}

}
