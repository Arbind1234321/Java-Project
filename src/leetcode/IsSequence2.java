package leetcode;

public class IsSequence2 {
	public static boolean isSubsequence(String s, String t) {
		int i = 0, j = 0;
		while (i < s.length() && j < t.length()) {
			if (s.charAt(i) == t.charAt(j)) {
				i++;
				j++;
			} else {
				j++;
			}
		}
		if (i == s.length()) {
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {
		String s = "abc", t = "ahbgdc";

		boolean k = isSubsequence(s, t);
		System.out.println(k);

	}

}
