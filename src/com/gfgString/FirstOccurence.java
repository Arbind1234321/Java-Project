package com.gfgString;

public class FirstOccurence {

	public static void main(String[] args) {
		String txt = "GeeksForGeeks", pat = "For";
		System.out.println(firstOccurence(txt, pat));
	}

	public static int firstOccurence(String txt, String pat) {

		int n = txt.length();
		int m = pat.length();
		int index = -1;
		for (int i = 0; i < n; i++) {
			if (txt.charAt(i) == pat.charAt(0) && pat.equals(txt.substring(i,i+ pat.length()))) {
				index = i;
				return index;
			}
		}
		return index;

	}

}
