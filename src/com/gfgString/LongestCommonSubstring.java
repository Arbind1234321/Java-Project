package com.gfgString;

public class LongestCommonSubstring {

	public static void main(String[] args) {
	String s1 = "ABCDGH", s2 = "ACDGHR";
	System.out.println(longestCommonSubstr(s1, s2));

	}
	 public static  int longestCommonSubstr(String s1, String s2) {
	       char str1[]=s1.toCharArray();
	       char str2[]=s2.toCharArray(); 
	       int dp[][]=new int [str1.length+1][str2.length+1];
	       int max1=0;
	       for(int i=1;i<=str1.length;i++)
	       {
	    	   for(int j=1;j<=str2.length;j++)
	    	   {
	    		   if(str1[i-1]==str2[j-1])
	    		   {
	    			 dp[i][j]=dp[i-1][j-1]+1;  
	    			 max1=Math.max(max1, dp[i][j]);
	    		   }
	    	   }
	       }
	       return max1;
	       
	    }

}
