package leetcode;
//Follow sliding window approach

import java.util.*;

public class LongestNonRepeatingCharacter {
	 public static  int lengthOfLongestSubstring(String s) {
		 int end=0;
		 int start=0;
		 int max_length=0;
		// List<Character> list=new ArrayList<>();
		 Set<Character> list = new HashSet<>();
		 while(end<s.length())
		 {
			if(!list.contains(s.charAt(end)))
			{
				list.add(s.charAt(end));
				end++;
				max_length=Math.max(max_length, list.size());
			}
			else
			{
				list.remove(Character.valueOf(s.charAt(start)));
				start++;
			}
		 }
	       
		 return max_length;
	    }
	public static void main(String[] args) {
	  String str="abcabcbb";
		int k=lengthOfLongestSubstring(str);
		System.out.println(k);

	}

}

/*
 *     for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        uniqueCharacters.add(c);
    }
    
    int combinedSize = uniqueCharacters.size();
    
    System.out.println("Combined size of all unique characters: " + combinedSize);
}
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
 