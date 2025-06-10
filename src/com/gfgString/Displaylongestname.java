package com.gfgString;

import java.util.Arrays;
import java.util.List;

public class Displaylongestname {

	public static void main(String[] args) {
     String arr[] = {"Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks"};
     longest(Arrays.asList(arr));
	}
	 public static String longest(List<String> arr) {
		 String longest = arr.get(0);
		 for(int i=1;i<arr.size();i++)
		 {
			 if(arr.get(i).length()>longest.length())
			 {
				longest=arr.get(i);
			 }
		 }
	      
		 //System.out.println(longest);
	  return longest;      
	  }

}
