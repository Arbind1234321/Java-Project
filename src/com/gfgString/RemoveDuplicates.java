package com.gfgString;

import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {

	}

	public static String removeDups(String s) {
	       LinkedHashSet<Character> set=new LinkedHashSet<>();
	       for(char a:s.toCharArray()) {
	    	   set.add(a);
	    	   
	       }
	       String st="";
	       for(char a: set) {
	          st=st+a;
	    }
	return st;
	}

}
