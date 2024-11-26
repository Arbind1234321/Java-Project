package com.slidingwindow;

import java.util.HashMap;

public class MinimumSubString {

	public static void main(String[] args) {
		String s="totamatndgeydttm";
		String t="ttm";
		System.out.println(minsubString(s, t));

	}
	public static int minsubString(String s,String t )
	{
		HashMap< Character, Integer>map=new HashMap<>();
		for(int i=0;i<t.length();i++)
		{
			map.put(t.charAt(i), map.getOrDefault(t.charAt(i),0)+1);
		}
	    int i=0,j=0;
	    int count=0;
	    while(j<s.length())
	    {
	    	if(map.containsKey(s.charAt(i)))
	    	{
	    		map.put(t.charAt(j),map.get(t.charAt(j))-1);
	    	}
	    	else {
	    		count++;
	    	}
	    	if(map.size()==0)
	    	{
	    		
	    	}
	    }
		return 0;
	}

}
