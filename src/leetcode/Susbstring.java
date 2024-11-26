package leetcode;

import java.util.*;

public class Susbstring {
	public static int longestString(String s) {
		int maxLength = 0;
		HashSet<Character> set = new HashSet<>();
		int l = 0;
		int r = 0;
		int n = s.length();
		while(r <= n) {
			if (r == n) {
				System.out.println(s.substring(l, r));
				maxLength = Math.max(maxLength, r-l);
				break;
			}
			char ch = s.charAt(r);
			if (set.contains(ch)) {
				System.out.println(s.substring(l, r));
				maxLength = Math.max(maxLength, r-l);
				while(s.charAt(l) != ch) {
					set.remove(s.charAt(l));
					l++;
				}
				l++;
				r++;
				System.out.println("l is " + l + " r is " + r + " ");
			}
			else {
				r++;
				set.add(ch);
			}
		}
		return maxLength;
	}

	public static void main(String[] args) {
	String str ="abcdaab";
	System.out.println(longestString(str));
	
	}

}
