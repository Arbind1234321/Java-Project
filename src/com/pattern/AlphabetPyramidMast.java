package com.pattern;

public class AlphabetPyramidMast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		for (int i = 1; i <= n; i++) {
			for(int s=1;s<=n-i;s++)
			{
				System.out.print(" ");
			}
			for (int t = 1; t <= i; t++) {
				System.out.print(t);

			}
			int k = i-1;
			for (int j = 1; j <= i-1; j++) {

				System.out.print(k);

				k--;
			}
			System.out.println();

		}

	}

}
