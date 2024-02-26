package com.pattern;

public class SpecialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int t = 0;
		for (int i = 1; i <= 2 * n - 1; i++) {
			for (int j = 1; j <= 2 * n - 1; j++) {
				// int t=Math.min(i, j);
				int a = i;
				if (i > n)
					a = 2 * n - i;
				int b = j;

				if (j > n)
					b = 2 * n - j;
				if (a < b)
					t = a;
				else
					t = b;
				if(i==4&&j==4)
				System.out.print(n);
				else
				System.out.print(5-t);
			}
			System.out.println();
		}
	}

}
