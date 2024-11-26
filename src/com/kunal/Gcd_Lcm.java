package com.kunal;

public class Gcd_Lcm {

	public static void main(String[] args) {
	    System.out.println(gcd(50,10));
		//System.out.println(lcm(2, 9));

	}

	public static int gcd(int a, int b) {
		//System.out.println(a + " " + b);
		if (a == 0) {
			return b;
		}

		return gcd(b % a, a);
	}

	public static int lcm(int a, int b) {
		return (a * b) / gcd(a, b);
	}

}
