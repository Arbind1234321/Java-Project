package com.pawanselenium;

public class PalindromicString {

	public static void main(String[] args) {
		String  str="abaaba";
		System.out.println(isPalindrome(str));

	}
	public static boolean isPalindrome(String str)
	{
		
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=str.charAt(str.length()-1-i))
			{
				return false;
			}
		}
		return  true;
	}

}
