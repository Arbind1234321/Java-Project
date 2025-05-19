package com.string;

public class BasicString {

	public static void main(String[] args) {
	   secMatching("abcdabda");
	  
	}
	//WAP to remove second matching character
	public static void secMatching(String  str)
	{
		int count =0;
		String s="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a')
			{
				count++;
			}
			if(count == 2 &&str.charAt(i)=='a')
			{
			  continue; 
			}
			s=s+str.charAt(i);
			
		}
		System.out.println(s);
	}
	//WAP to remove last 'a' from string
	public static void lastChar(String str)
	{
		
		//System.out.println(str.lastIndexOf("a"));
		str=str.substring(0, str.lastIndexOf("a"))+str.substring(str.lastIndexOf("a")+1);
		System.out.println(str);	
	}
	
	//WAP to remove all 'a' from given string
	public static void removeCharacter(String  str)
	{
		String s="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a')
			{
			
			}
			else {
				s=s+str.charAt(i);
			}
		}
		System.out.println(s);
	}
	
	//WAP to checck given string is palindrome or not
	public static boolean isPalndrome(String str)
	{
		str=str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != str.charAt(str.length()-1-i))
			{
				return false;
			}
			
		}
		return true;
	}

}
