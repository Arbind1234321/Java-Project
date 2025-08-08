package com.gfgString;

public class ExtracttheNumberfromtheString {

	public static void main(String[] args) {
		
	}
	long ExtractNumber(String sentence) {
	     String[] tokens = sentence.split(" ");
	        long max = -1;

	        for (String token : tokens) {
	            if (isAllDigits(token) && !token.contains("9")) {
	                long num = Long.parseLong(token);
	                if (num > max) {
	                    max = num;
	                }
	            }
	        }

	        return max;
	    }

	    private static boolean isAllDigits(String s) {
	        for (char c : s.toCharArray()) {
	            if (!Character.isDigit(c)) return false;
	        }
	        return true;
	        
	    }

}
