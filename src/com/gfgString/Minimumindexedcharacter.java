package com.gfgString;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Minimumindexedcharacter {

	public static void main(String[] args) {
	 String S="udllxuknne";
	String patt="ldkzxtpkzg";
	System.out.println(printMinIndexChar(S, patt));

	}

	public static String printMinIndexChar(String S, String patt) {
		  HashSet<Character> set= new LinkedHashSet<>();

        for(char c:patt.toCharArray())
        {
        	set.add(c);
        }
        for(char ch:S.toCharArray())
        {
        	if(set.contains(ch))
        	{
        		return Character.toString(ch);
        	}
        }
        return "$";
    }
	
}
