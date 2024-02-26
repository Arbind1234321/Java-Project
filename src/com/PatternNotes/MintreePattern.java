package com.PatternNotes;

public class MintreePattern {

	public static void main(String[] args) {
		int n = 4;
		int nsp = 0;
		int ele = 2 * n;
		int k = 1;
		int q = n * n + 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= nsp; j++)// for space
			{
				System.out.print(" ");
			}
			for (int j = 1; j <= ele; j++) {

				if (j <= ele / 2) {
					System.out.print(k + "*");

					k++;

				} else {

					System.out.print(q + "");
					if (j < ele)
						System.out.print("*");
					q++;
				}

				// System.out.print("*");

			}
			q = q - (ele - 1);
			nsp += 2;
			ele -= 2;
			System.out.println();
		}

	}

}
