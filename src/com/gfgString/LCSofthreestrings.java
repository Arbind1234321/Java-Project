package com.gfgString;

public class LCSofthreestrings {

	public static void main(String[] args) {
		String s1 = "hyxXQdD", s2 = "K2oDQ", s3 = "N9mnQrwyPW";
		System.out.println(lcsOf3(s1, s2, s3));
	}
	public static int lcsOf3(String s1, String s2, String s3) {
		 char str1[]=s1.toCharArray();
	       char str2[]=s2.toCharArray();
	       char str3[]=s3.toCharArray();
	       int dp[][][]=new int[str1.length+1][str2.length+1][str3.length+1];
	       for(int i=0;i<str1.length;i++)
	       {
	    	   dp[i][0][0]=0;
	       }
	       for(int i=1;i<=str1.length;i++)
	       {
	    	   for(int j=1;j<=str2.length;j++)
	    	   {
	    		   for(int k=1;k<=str3.length;k++)
	    		   {
	    		   if(str1[i-1]==str2[j-1] && str2[j-1] ==str3[k-1])
	    		   {
	    			  dp[i][j][k]=dp[i-1][j-1][k-1]+1;
	    			 
	    		   }
	    		   else {
	    			   dp[i][j][k]=Math.max(Math.max(dp[i-1][j][k],dp[i][j-1][k]),dp[i][j][k-1]);; 
	    		   }
	    		   }
	    	   }
	       }
	       
	       return dp[s1.length()][s2.length()][s3.length()];
	}

}
