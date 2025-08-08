package com.gfgString;

import java.util.ArrayList;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		String s1 = "hyxXQdD", s2 = "K2oDQ";
		System.out.println(lcs2(s1, s2));
	//	String s= "geeks  for geeks";
		//s=s.replaceAll("\s+","");
		//System.out.println(s);

	}
	public static   String  lcs2(String s1, String s2) {
	     
	       
	       char str1[]=s1.toCharArray();
	       char str2[]=s2.toCharArray();
	       int dp[][]=new int[str1.length+1][str2.length+1];
	       for(int i=0;i<str1.length;i++)
	       {
	    	   dp[i][0]=0;
	       }
	       for(int i=1;i<=str1.length;i++)
	       {
	    	   for(int j=1;j<=str2.length;j++)
	    	   {
	    		   if(str1[i-1]==str2[j-1])
	    		   {
	    			  dp[i][j]=dp[i-1][j-1]+1;
	    			 
	    		   }
	    		   else {
	    			   dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);; 
	    		   }
	    	   }
	       }
	    // Backtrack to construct the LCS string
	       int i = str1.length, j = str2.length;
	       StringBuilder lcs = new StringBuilder();

	       while (i > 0 && j > 0) {
	           if (str1[i - 1] == str2[j - 1]) {
	               lcs.append(str1[i - 1]);
	               i--;
	               j--;
	           } else if (dp[i - 1][j] > dp[i][j - 1]) {
	               i--;
	           } else {
	               j--;
	           }
	       }

	       return lcs.reverse().toString();
	        
	    }
	public static   int lcs1(String s1, String s2) {
     
       
       char str1[]=s1.toCharArray();
       char str2[]=s2.toCharArray();
       int dp[][]=new int[str1.length+1][str2.length+1];
       for(int i=0;i<str1.length;i++)
       {
    	   dp[i][0]=0;
       }
       for(int i=1;i<=str1.length;i++)
       {
    	   for(int j=1;j<=str2.length;j++)
    	   {
    		   if(str1[i-1]==str2[j-1])
    		   {
    			  dp[i][j]=dp[i-1][j-1]+1;
    			 
    		   }
    		   else {
    			   dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);; 
    		   }
    	   }
       }
       
       return dp[s1.length()][s2.length()];
        
    }

	public static   int lcs(String s1, String s2) {
	        int count=0;
	        ArrayList<Character> list1= new ArrayList<>();
	        ArrayList<Character> list2= new ArrayList<>();
	        for(Character ch:s1.toCharArray())
	        {
	        	list1.add(ch);
	        }
	        for(Character c:s2.toCharArray())
	        {
	        	if(list1.contains(c))
	        	{
	        		list2.add(c);
	        	}
	        }
	        if(!list2.isEmpty())
	        {
	        	return list2.size();
	        }
	        
	        return count;
	        
	    }

}
