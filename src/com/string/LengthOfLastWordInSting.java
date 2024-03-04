package com.string;

public class LengthOfLastWordInSting {

	 public static int lengthOfLastWord(String s)
	   { // int k=0;
		 String arr[]=s.split(" ");
//		 for(int i=arr.length-1;i<arr.length;i++)
//			{
//			 k= arr[i].length();
//			  
//			}
		 
		// return k;
		 return arr[arr.length-1].length();
	       
	   }
	
	public static void main(String[] args) {
	String str="This is world play";
	  
	System.out.println(lengthOfLastWord(str));
	}

}
