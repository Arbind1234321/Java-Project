package com.array;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacterfromString {

	public static void main(String[] args) {
		//Approach 1
		String str="progaraming";
		StringBuffer sb=new StringBuffer();
		str.chars().distinct().forEach(c ->sb.append((char)c));
		System.out.println(sb);
		//Approach 2
		//char [] ch=str.toCharArray();
		StringBuffer sb1=new StringBuffer();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			int indx=str.indexOf(ch,i+1);
			if(indx==-1)
			{
				sb1.append(ch);
			}
		}
		System.out.println(sb1);
		//Approach -3
		StringBuilder sb3=new StringBuilder();
		char [] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			boolean repeated=false;
			for(int j=i+1;j<ch.length;j++)
			{
			
				if(ch[i]==ch[j])
				{
					repeated=true;
				}
			}
			if(!repeated)
			{
				sb3.append(ch[i]);
			}
		}
		System.out.println(sb3);
		//Approach -4
		StringBuilder sb4=new StringBuilder();
		Set<Character> set=new LinkedHashSet<>();
		
		for(int i=0;i<str.length();i++)
		{
			set.add(str.charAt(i));
		}
         for(Character c:set)
         {
        	 sb4.append(c);
         }
         System.out.println(sb4);
		

	}

}
