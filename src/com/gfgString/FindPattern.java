package com.gfgString;

public class FindPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int findPattern(String s, String p) {
	        // code here
		
	        for(int i=0;i<s.length();i++)
	        {
	        	for(int j=i;j<p.length();j++) {
	        		if(p.charAt(j)==s.charAt(i) && p.substring(j).equals(s.indexOf(s.charAt(i),s.length()))) {
	        			return j;
	        		}
	        		
	        	}

	        }
	        return -1;
	    }

}
