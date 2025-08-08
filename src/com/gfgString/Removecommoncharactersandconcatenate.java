package com.gfgString;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Removecommoncharactersandconcatenate {

	public static void main(String[] args) {
	String s1 = "abcs",s2 = "cxzca";
	System.out.println(concatenatedString(s1, s2));

	}
	 public static String concatenatedString1(String s1, String s2) {
	       boolean[] inS1 = new boolean[256];
	        boolean[] inS2 = new boolean[256];

	        for (char c : s1.toCharArray()) inS1[c] = true;
	        for (char c : s2.toCharArray()) inS2[c] = true;

	        StringBuilder res = new StringBuilder();

	        // Append chars from s1 that are not in s2
	        for (char c : s1.toCharArray()) {
	            if (!inS2[c]) res.append(c);
	        }
	        // Append chars from s2 that are not in s1
	        for (char c : s2.toCharArray()) {
	            if (!inS1[c]) res.append(c);
	        }

	        return res.length() > 0 ? res.toString() : "-1";
	    }
	 public static String concatenatedString(String s1, String s2) {
		 
	       HashMap<Character, Integer> map=new LinkedHashMap<>();
	       for(Character ch:s1.toCharArray())
	       {
	    	   map.put(ch, map.getOrDefault(ch, 0)+1);
	       }
	       for(Character ch:s2.toCharArray())
	       {
	    	   map.put(ch, map.getOrDefault(ch, 0)+1);
	       }
	       StringBuilder s = new StringBuilder();
	       for(Character c:map.keySet()) {
	    	   if(map.get(c)==1)
	    	   {
	    		   s.append(c);
	    	   }
	       }
	       return s.toString();
	       
	        
	    }

}
