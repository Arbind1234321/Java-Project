package com.string;
//Java program to count the characters in each word in a given sentence
public class CharacterInEachWord {
	static void count(String str) {
		// convert String to char array
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			// Declare an String with empty initialization
			String s = ""; int cnt=0;
			// for counting each word
			while (i < ch.length && ch[i] != ' ') {
				// concat with string
				s = s + ch[i];
				i++;
				cnt++;
			}
			if (s.length() > 0)
			{
				//System.out.println(s + "->" + s.length());
				System.out.println(s + "->" + cnt);
			}
				
		}
	}

	public static void main(String[] args) {
		String str = "Arbind kumar";
		count(str);

	}

}
