package com.pattern;

public class AlphabetTPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		for (int i = 1; i <= n; i++) {
			// for spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			// for printing alphabet

			for (int k = 1; k <= i; k++) {
				System.out.print((char) (k + 64));
			}
			int a = i - 1;
			for (int p = 1; p <= i - 1; p++) {
				System.out.print((char) (a + 64));
				a--;
			}
			System.out.println();
		}

	}

}
