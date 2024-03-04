package com.string;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		String str="This is java";
		String [] s=str.split(" ");
		for(int i=0;i<s.length;i++)
		{
			reverse(s[i]);
		}

	}

      static void reverse(String string) {
    	  int l=string.length();
    	  String re="";
	    for(int i=l-1;i>=0;i--  )
	    {
	    	re=re+string.charAt(i);
	    }
	    System.out.print(re+" ");
		
	}

}
