package Collecions;

import java.util.Arrays;

public class ASss 
{
 public static void main(String[] args)
 {
 String s="aba abc madam mam tea";
String []str= s.split(" ");
 //String s1="abc";
// System.out.println(anagram(s, s1));
 //System.out.println(stringPalindrome(s));
 //System.out.println(countPalindrom(str));
 firstUpperCase(str);
 //syso
 
}
 
 public static boolean anagram(String s,String s1)
 {
	 if(s.length()!=s1.length())
	 {
		 return false;
	 }
	 else
	 {
		char []c=s.toCharArray();
		char []c1=s1.toCharArray();
		Arrays.sort(c);
		Arrays.sort(c1);
		if(Arrays.equals(c, c1))
		{
			return true;
		}
	 }
	 
	return false;
 }

 public static boolean stringPalindrome(String s)
 {
	int n=s.length();
	for(int i=0;i<n;i++)
		if(s.charAt(i)!=s.charAt(n-i-1))
			return false;
	return true;
 }
 public static int countPalindrom(String[] str)
 {
	 int count=0;
	 for(int i=0;i<str.length;i++)
	 {
		 if(stringPalindrome(str[i]))
		 {
			 count++;
		 }
	 }
			
	 return count;
 }
  public static void firstUpperCase(String  []str)
  {
	  System.out.println("hii");
	  for(int i=0;i<str.length-1;i++)
	  {
		  System.out.println(str[i].substring(0,1).toUpperCase()+str[i].substring(1).toLowerCase());
	  }
  }
  
  
}
