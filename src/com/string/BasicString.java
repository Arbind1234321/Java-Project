package com.string;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BasicString {

	public static void main(String[] args) {
	 // System.out.println(skipWord("tabapplebdg"));
	  // System.out.println(strStr("tsadbutsad","sad"));
		//allSubset("abcd");
		String t="this is india arbind";
		toUpperCas(t);
	  
	}
	//WAP to print All first latter into capital
    public static void  toUpperCas(String str)
    {
         String []s=str.split(" ");	
          for(int i=0;i<s.length;i++)
          {
        	  System.out.print(s[i].substring(0,1).toUpperCase()+s[i].substring(1)+" ");
          }
    }
	
	public static void allSubset(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.substring(i)+str.substring(0,i));
		}
	}
	//Find the Index of the First Occurrence in a String
	
	public static int  strStr(String haystack, String str) {
		
		return haystack.indexOf(str);
	}
	//WAP to skip string from given String
	public static String skipWord(String str)
	{
		
		if(str.isEmpty())
		{
			return "";
		}
		if(str.startsWith("apple"))
		{
			return skipWord(str.substring(5));
		}
		else {
			return str.charAt(0)+skipWord(str.substring(1));
		}
	}
	
	//WAP to remove all 'a' from given string using recusion
	public static String skip(String str)
	{
		if(str.isEmpty())
		{
			
			return "";
		}
		char ch=str.charAt(0);
		if(ch=='a')
		{
			return skip(str.substring(1));
		}else {
			return ch+skip(str.substring(1));
		}
		
	}
	//WAP to remove all 'a' from given string using recusion
	public static void skip(String p,String str)
	{
		if(str.isEmpty())
		{
			System.out.println(p);
			return;
		}
		char ch=str.charAt(0);
		if(ch=='a')
		{
			skip(p,str.substring(1));
		}else {
			skip(p+ch,str.substring(1));
		}
		
	}
	//WAP to remove first matching character from string
	public static void firstMatching(String str )
	{
		//System.out.println(str.replace("a", ""));
		String s="";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(count==0 && str.charAt(i)=='a')
			{
				count++; 
				continue;
			}
			else
			s=s+str.charAt(i);
			
		}
		System.out.println(s);
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
