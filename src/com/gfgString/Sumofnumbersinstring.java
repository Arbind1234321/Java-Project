package com.gfgString;

public class Sumofnumbersinstring {

	public static void main(String[] args) {
		String s = "1234";
		System.out.println(findSum(s));

	}
	public static int test() {
		try {
			return 1;
		}
		finally {
			return  2;
		}
	}
	 public static int findSum(String s) {
		 int sum = 0;
	        int j = 0;
	        String a = "";

	        while (j < s.length()) {
	            char c = s.charAt(j);

	            if (Character.isDigit(c)) {
	                a += c;  // Build the number
	            } else {
	                if (!a.equals("")) {
	                    sum += Integer.parseInt(a);  // Add to sum
	                    a = "";  // Reset string for next number
	                }
	            }
	            j++;
	        }

	        // Check if there is a number left at the end
	        if (!a.equals("")) {
	            sum += Integer.parseInt(a);
	        }

	        return sum;
	}

}
