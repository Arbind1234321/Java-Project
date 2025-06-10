package com.gfgString;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println(reverseString("for"));

	}

	public static String reverseString(String s) {
		int n = s.length() - 1;
		String st = "";
		for (int i = n; i >= 0; i--) {
			st = st + s.charAt(i);
		}
		return st;
	}

	public static String reverseString1(String s) {
		
		StringBuffer sb=new StringBuffer(s);
		   return sb.reverse().toString();
	}

}
