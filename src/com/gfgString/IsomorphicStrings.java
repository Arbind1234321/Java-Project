package com.gfgString;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsomorphicStrings {

	public static void main(String[] args) {
		// String s1 = "aab", s2 = "xxy";
		//String s1 = "aab", s2 = "xyz";
		String s1="yktbvpmxnuo",s2="murlidsaris";
		System.out.println(areIsomorphic2(s1, s2));
		//System.out.println(isIsomorphic(s1, s2));
	}
	public static  boolean areIsomorphic2(String s1,String s2)
	{
		Map<Character, Character> map = new HashMap<>();
        Set<Character> mapped = new HashSet<>();

        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (map.containsKey(c1)) {
                if (map.get(c1) != c2) return false;
            } else {
                if (mapped.contains(c2)) return false;

                map.put(c1, c2);
                mapped.add(c2);
            }
        }

        return true;
	}
	public static boolean isIsomorphic(String s, String t) {

	    if (s.length() != t.length()) {
	      return false;
	    }

	    // Create a hashmap to store character mappings
	    Map<Character, Character> charMappingMap = new HashMap<>();

	    for (int i = 0; i < s.length(); i++) {

	      char original = s.charAt(i);
	      char replacement = t.charAt(i);

	      if (!charMappingMap.containsKey(original)) {
	        if (!charMappingMap.containsValue(replacement))
	          charMappingMap.put(original, replacement);
	        else
	          return false;
	      }
	      else {
	        char mappedCharacter = charMappingMap.get(original);
	        if (mappedCharacter != replacement)
	          return false;
	      }
	    }

	    return true;
	  }
	public static boolean areIsomorphic1(String s1, String s2) {
		HashMap<Character, Character> map = new HashMap<>();
		if (s1.length() != s2.length()) {
			return false;
		}
		for (int i = 0; i < s1.length(); i++) {
			char origanal = s1.charAt(i);// a
			char replacement = s2.charAt(i);// x
			if (!map.containsKey(origanal)) {
				if (!map.containsKey(replacement)) 
					map.put(origanal, replacement);
				 else 
					return false;
				}
			 else {
				char charmaped = map.get(origanal);
				if (charmaped != replacement) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean areIsomorphic(String s1, String s2) {
		HashSet<Character> set = new HashSet<>();
		HashSet<Character> set1 = new HashSet<>();
		if (s1.length() != s2.length()) {
			return false;
		}
		for (Character ch : s1.toCharArray()) {
			set.add(ch);
		}
		for (Character ch : s2.toCharArray()) {
			set1.add(ch);
		}
		if (set.size() == set1.size()) {
			return true;
		}
		return false;

	}

}
