package com.array;
///majority element 
public class MajorityElement1 {

	public static void main(String[] args) {
		int arr[] = {2,2,1,1,1,2,2,1,1};
		int n = arr.length;
		int count = 0;
		int cand = 0;
		for (int i = 0; i < n; i++) {
			if (count == 0) {
				cand = arr[i];
			}
			if (cand == arr[i]) {
				count++;
			} else {
				count--;
			}
		}
		System.out.println(cand);

	}

}
