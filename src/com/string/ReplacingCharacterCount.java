package com.string;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class ReplacingCharacterCount {

	public static void main(String[] args) {
		String str="ttttllllllssssslhhhh";//a5b2c2d
		HashMap<Character, Integer> map=new LinkedHashMap<>();
		
		for(int i=0;i<str.length();i++)
		{
			if(map.containsKey(str.charAt(i)))
			{
				map.put(str.charAt(i),map.get(str.charAt(i))+1);
			}
			else
			{
				map.put(str.charAt(i), 1);
			}
		}
		String s="";
		//map.forEach((key,value)-> System.out.print( key+""+value));
		for(Character ch:map.keySet())
		{
			s=s+ch+map.get(ch);
		}
		System.out.println(s);
		
		//System.out.println(map);
		//Arrays.sort(str);
	

	}

}
