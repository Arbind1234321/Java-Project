package com.slidingwindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithNoRepeatingChar {

	public static void main(String[] args) {
     String str="abf";
     //System.out.println(longestSubStringWithUniqueChar(str));
     System.out.println(longestStringwithNoRepeating(str));

	}
	
	public static int longestSubStringWithUniqueChar(String str)
	{
		if(str.length()==0)
		{
			return 0;
		}
		int i=0;
		int j=0;
		int n=str.length();
		int max1=-1;
		Set<Character> set=new HashSet<>();
		while(j<n)
		{
			if(set.contains(str.charAt(j)))
			{
//				//set.removeAll(set);
//				while(set.)
//				set.add(str.charAt(j));
//				i=j;
//				j++;
				if(set.contains(str.charAt(j)))
				{
					while(set.contains(str.charAt(j)))
					{
						set.remove(str.charAt(i));
						i++;
					}
		
					set.add(str.charAt(j));
					j++;
				}
				
			}
			else {
				max1=Math.max(max1,j-i+1);
				set.add(str.charAt(j));
				j++;
			}
		}
		return max1;
	}

   public static int longestStringwithNoRepeating(String str)
   {
	   if(str.length()==0)
	   {
		   return 0;
	   }
	   HashMap<Character,Integer> map =new HashMap<>();
	   int i=0,j=0,max1=0;
	   while(j<str.length())
	   {
		   if(map.containsKey(str.charAt(j)))
		   {
			   map.put(str.charAt(i), map.get(str.charAt(j))+1);
		   }
		   else {
			   
			   map.put(str.charAt(j),1);
		   }
		   if(map.size()>j-i+1)
		   {
			   j++;
		   }
		   if(map.size()==j-i+1)
		   {
			   max1=Math.max(max1, j-i+1);
			   j++;
		   }
		   else if(map.size()<j-i+1)
		   {
			   while(map.size()<j-i+1)
			   {
				   if(map.get(str.charAt(i))==0)
				   {
					   map.remove(str.charAt(i));
				   }
				   i++;
			   }
			   j++;
		   }
		   
	   }
	   return max1;
   }

}
