package com.gfgString;

import java.util.Arrays;

public class LongestCommonPrefixofStrings {

	public static void main(String[] args) {
	 String arr[]= {"hello", "world"};
	 System.out.println(longestCommonPrefix3(arr));
	}
	
	public static String longestCommonPrefix3(String arr[]) {
	    if (arr == null || arr.length == 0)
	        return "";

	   StringBuffer result=new StringBuffer();
	   Arrays.sort(arr);
	   char[] first=arr[0].toCharArray();
	   char[] last=arr[arr.length-1].toCharArray();
	   for(int i=0;i<arr.length;i++)
	   {
		   if(first[i] !=last[i])
		    break;
		   result.append(first[i]);
	   }
	   return result.toString();
	}
	
	public static String longestCommonPrefix1(String arr[]) {
	    if (arr == null || arr.length == 0)
	        return "";

	    String first = arr[0]; // take the first word as a reference

	    for (int i = 0; i < first.length(); i++) {
	        char c = first.charAt(i);

	        for (int j = 1; j < arr.length; j++) {
	            // If i exceeds current string length OR character doesn't match
	            if (i >= arr[j].length() || arr[j].charAt(i) != c) {
	                return first.substring(0, i);
	            }
	        }
	    }

	    return first; // al
	}
public static String longestCommonPrefix(String arr[]) {
   String s ="";
  
   for(int i=0;i<arr.length;i++ )
   {
	   char c=arr[i].charAt(i);
	   
	   for(int j=0;j<arr.length;j++)
	   {
		   if(c!=arr[j].charAt(i))
		   {
			 return s+arr[0].substring(0,i); 
		   }
		   
	   }
	  
   }
   return s;
        
 }


}
