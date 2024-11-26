package com.array;

public class Demo1 {

	public static void main(String[] args) {
		int arr[] = { 3, 44, 6, -5, 6, 23, 44 };// 73
		int n = arr.length;
		int max = 0;
		int k = 3;
		int msum = 0;

		for (int i = 0; i <= n - k; i++) {
			int csum = 0;
			for (int j = i; j < i + k; j++) {
				csum = csum + arr[j];
			}
			if(csum>max)
			{
				max=csum;
			}

		}
		System.out.println(max);

	}
}
