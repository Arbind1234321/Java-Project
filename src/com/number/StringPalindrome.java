package com.number;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String st=sc.nextLine();
		/*int len=st.length();
		String s="";
		for(int i=len-1;i>=0;i--)
		{
			s=s+st.charAt(i);
		}
		System.out.println(s);
		
*/
		
		/*int count=0;
		for(int i=0;i<st.length()/2;i++)
		{
			if(st.charAt(i)!=st.charAt(st.length()-1-i))
			{
				System.out.println("not palindrome");
				count++;
				break;
			}
			
		}
		if(count==0)
       System.out.println("palindrome");
       */
		boolean str=ispalindrom(st);
		if(str)
		System.out.println(st+" is palindrom");
		else
		System.out.println(st+ " not palindrom");
		
	}

	private static boolean ispalindrom(String st) {
		int i=0;
		while (i<st.length()/2) {
			if(st.charAt(i)!= st.charAt(st.length()-1-i))
				return false;
						i++;
		}
		return true;
	}

}
