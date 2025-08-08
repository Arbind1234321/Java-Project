package stringInterview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class StringPalindrom {
	public static void main(String[] args) {
		String str="automation";
		//System.out.println(removeDuplicate(str));
		countFrequency2(str);
	  
	}
	//Remove Duplicate Characters
	public static String removeDuplicate(String str)
	{
		String s="";
		boolean seen[]=new boolean[256];
		for(char c:str.toCharArray())
		{
			if(!seen[c])
			{
				s=s+c;
				seen[c] =true;
			}
		}
		return s;
	}
	
	//8. Check if a String Contains Only Digits
	public static boolean isDigits(String  str) {
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(c>='0' && c<='9')
			{
				count++;
			}
		}
		//return count==str.length();
		return str.matches("\\d+");
		
	}
	public static void countFrequency2(String str) {
		 int[] freq = new int[256];  // For all ASCII characters

	        // Count frequency
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            freq[ch]++;
	        }

	        // Display frequency
	        boolean[] printed = new boolean[256];
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (!printed[ch]) {
	                System.out.println(ch + ": " + freq[ch]);
	                printed[ch] = true;
	            }
	        }
	}
	//6. Count the Occurrence of Each Character
	public static void countFrequency1(String str)
	{
	 //char c[] =str.toCharArray();
	 int a[]= new int[256];
	 for(int i=0;i<str.length();i++)
	   {
		  a[str.charAt(i)]++; 
	   }
	   //for printing
	   for(int  i=0;i<256;i++)
	   {
		   if(a[i]>0)
		   {
			   System.out.println((char)i+"--->"+a[i]);
		   }
	   } 
	}
	public static void countFrequency(String str)
	{
		HashMap<Character,Integer> map=new HashMap<>();
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c,1);
			}
		}
		System.out.println(map);
	}
	// 4. Find First Non-Repeating Character
	  public static char firstNonRepeating(String str)
	  {
		LinkedHashMap< Character, Integer> map=new LinkedHashMap<>();
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			map.put(c,map.getOrDefault(c,0)+1);
		}
		for(char c:map.keySet())
		{
			if(map.get(c)==1)
			{
				return c;
			}
		}
		return '$';
	  }
	  
	
	// 3. Extract Numbers from a String
	public static String extractNumber1( String str) {
		String s="";
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(Character.isDigit(c))
			{
				s=s+c;
			}
		}
		return s;
		
	}
	public static String extractNumber( String str) {
		String s="";
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(c>='0' && c<'9')
			{
				s=s+c;
			}
		}
		return s;
		
	}
	//2. Check if Two Strings Are Anagrams
	public static boolean isAnagram(String s1,String s2)
	{
		if(s1.length() !=s2.length())
		{
			return false;
		}
	 char []a=s1.toCharArray();
	 char []b=s1.toCharArray();
	 Arrays.sort(a);
	 Arrays.sort(b);
	 if(Arrays.equals(a,b))
	 {
		 return true;
	 }else
		 return false;
		
		
	}
	//1. Reverse Words in a Sentence
	public static void reverseWord(String str)
	{
		String [] s=str.split(" ");
		for(int i=s.length-1;i>=0;i--)
		{
			System.out.print(s[i]+" ");
		}
	}
	//palindrome
	public static boolean isPalindrome(String str)
	{
		for(int i=0;i<str.length()-i;i++)
		{
			if(str.charAt(i)!=str.charAt(str.length()-1-i))
				return false;
				
		}
		return true;
	}

}
