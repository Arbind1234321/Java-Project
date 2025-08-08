package com.gfgString;

public class RemainingString {

	public static void main(String[] args) {
		

	}
	 public static String printString(String s, char ch, int count) {
		  int c=0;
	        int index=0;
			 for(int i=0;i<s.length();i++)
			 {
				if(ch==s.charAt(i))
				{
					c++;
					if(c==count)
					{
					    index=i;
					    break;
					}
				}
			 }
			 if(c==count)
			 {
				 return s.substring(index+1);
			 }
		     return "";
	        
	        
	    }

}
