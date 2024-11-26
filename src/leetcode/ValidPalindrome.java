package leetcode;

import java.util.ArrayList;
import java.util.Vector;

public class ValidPalindrome {

	public static boolean palindrome(String s) {
//		String ans = "";
//		for (int i = 0; i < s.length(); i++) {
//			char c = s.charAt(i);
//			if (Character.isLetter(c)||Character.isDigit(c)) {
//				ans = ans + c;
//			}
//		}

		s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
		// int n=s.length();

//		for (int i = 0; i < n; i++, n--) {
//			if (s.charAt(i) != s.charAt(n - 1))
//				return false;
//		}
//		return true;
//	}
		int i = 0;
		int j = s.length() - 1;
		while (i <= j) {
			if (s.charAt(i) != s.charAt(j))
				return false;
			else {
				i++;
				j--;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String s = "Ama";
//	 String ans="";
//	 for(int i=0;i<s.length();i++)
//	 {
//		 char c=s.charAt(i);
//		 if(Character.isAlphabetic(c))
//		 {
//             ans=ans+c;			 
//		 }
//	 }
		// palindrome(ans);
	
		
		System.out.println(palindrome(s));

	}

}
