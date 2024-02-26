package com.pattern;

public class AlphaNumberTringle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for (int i = 1; i <= n; i++) {
			int a = 65;
			char ch = (char) a;
			if (i % 2 == 0) {
				for (int j = 1; j <= i; j++) {

					System.out.print(ch);
					// a++;
					ch++;
				}

			} else {
				for (int j = 1; j <= i; j++) {
					System.out.print(j);
				}
			}
			System.out.println();

		}

	}

}
