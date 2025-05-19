package com.kunal;

public class SqureRootOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 16;
		int p = 4;
		System.out.printf("%.3f", square(n, p));
	}

	public static double square(int n, int p) {
		int start = 0;
		int end = n;
		double root = 0.0;
		{
			
		}
	//	String s = "Agnc";

		while (start <= end) {

			int mid = (start + end) / 2;

			if (mid * mid == n) {
				return mid;
			}

			if (mid * mid > n) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		double inc = 0.001;
		for (int i = 0; i < p; i++) {
			while (root * root <= n) {
				root += inc;
			}
			root -= inc;
			inc /= 10;
		}

		// String d=Double.toString(root).substring(0,6 );
		// System.out.println(d.);
		// root=Double.valueOf(d);

		return root;
	}

}
 