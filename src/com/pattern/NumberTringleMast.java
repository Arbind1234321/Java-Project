package com.pattern;

public class NumberTringleMast {

	public static void main(String[] args) {
		int n = 4;
		for (int i = 1; i <= n; i++) {
			// for spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k);
			}
			int p = i - 1;
			int a=i-1;
			for (int m = 1; m <= p; m++) {
				System.out.print(a);
				a--;
			}
			System.out.println();
		}

	}

}
