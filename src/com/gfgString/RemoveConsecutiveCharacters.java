package com.gfgString;

public class RemoveConsecutiveCharacters {

	public static void main(String[] args) {
		String s = "aabb";
		System.out.println(removeConsecutiveCharacter1(s));

	}
	 public static  String removeConsecutiveCharacter1(String s) {
		 int n = s.length();
	        if (n == 0) return "";

	      
	     StringBuffer sb=new StringBuffer();
	     sb.append(s.charAt(0));
	     for(int i=1;i<n;i++)
	     {
	    	 if(s.charAt(i)!=s.charAt(i-1))
	    	 {
	    		sb.append(s.charAt(i)); 
	    	 }
	     }
	        
	     return sb.toString();
	        
	    }
	 public static  String removeConsecutiveCharacter(String s) {
		 int n = s.length();
	        if (n == 0) return "";

	        String st = "";
	        int i = 0, j = 1;

	        while (j < n) {
	            if (s.charAt(i) == s.charAt(j)) {
	                i++;
	                j++;
	            } else {
	                st = st + s.charAt(i);
	                i++;
	            }
	        }

	        // Append the last character only if it’s not a duplicate of the previous
	        if (s.charAt(n - 1) != s.charAt(n - 2)) {
	            st = st + s.charAt(n - 1);
	        } else if (st.length() == 0 || st.charAt(st.length() - 1) != s.charAt(n - 1)) {
	            // Handles edge cases like "aa" or "aabaa"
	            st = st + s.charAt(n - 1);
	        }
	        
	     return st;
	        
	    }

}
