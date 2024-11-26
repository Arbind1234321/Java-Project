package com.string;

import java.util.Arrays;
import java.util.HashMap;

public class ReplacingCharacterCount {

	public static void main(String[] args) {
		String str="aabbaccda";//a5b2c2d
		HashMap<Character, Integer> map=new HashMap<>();
		
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
		map.forEach((key,value)-> System.out.print( key+""+value));
		//System.out.println(map);
		//Arrays.sort(str);
	

	}

}
