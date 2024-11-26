package leetcode;

public class IsSequence {
	public static boolean isSubsequence(String s, String t) {
		String st = "";
		int temp=0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			for ( int j = temp; j < t.length(); j++) {
				char d = t.charAt(j);
				if (c == d) {
					st = st + c;
					temp=j;
					break;
				}
			}
		}
		if (st.equals(s)) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {

		String s = "acb", t ="ahbgdc";

		boolean k = isSubsequence(s, t);
		System.out.println(k);
	}

}
