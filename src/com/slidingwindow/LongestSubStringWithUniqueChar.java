package com.slidingwindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestSubStringWithUniqueChar {

	public static void main(String[] args) {
		String str = "aabacbebebe";
		int k = 3;

		// System.out.println(longestsubStringWithuniqueCharacter(str, k));
		// putting(str,k);
		System.out.println(longestSubStringWithKUnique(str, k));
	}

	public static int longestsubStringWithuniqueCharacter(String str, int k)

	{

		int i = 0, j = 0;
		int max = 0;
		boolean flag = false;
		Set<Character> set = new HashSet<>();
		List<Character> list = new ArrayList<>();
		while (j < str.length()) {
			set.add(str.charAt(j));
			list.add(str.charAt(j));
			if (set.size() < k) {
				j++;
			} else if (set.size() == k) {
				max = Math.max(max, list.size());
				j++;
				flag = true;
			} else if (set.size() > k) {
				while (set.size() > k) {
					if (list.size() >= set.size()) {
						list.remove(i);

					} else {
						set.remove(list.get(i));
					}
				}
				j++;
			}

		}
		if (flag)
			return max;
		else
			return -1;
	}

	public static void puting(String str) {

		int j = 0;
		HashMap<Character, Integer> hm = new HashMap<>();
		int size = str.length();
		while (j < size) {
			hm.put(str.charAt(j), hm.getOrDefault(str.charAt(j), 0) + 1);
			j++;
		}
		System.out.println(hm);
	}

	public static int longestSubStringWithKUnique(String s, int k) {
		if (s.length() == 0) {
			return 0;
		}
		int i = 0, j = 0;
		HashMap<Character, Integer> map = new HashMap<>();
		int max1 = -1;
		boolean flag = false;
		int n = s.length();
		 while(j<n)
		 {
			 if(map.containsKey(s.charAt(j)))
			 {
				 map.put(s.charAt(j),map.get(s.charAt(j))+1);
			 }
			 else
			 {
				 map.put(s.charAt(j),1);
			 }
			 if(map.size()<k)
			 {
				 j++;
			 }
			 else if(map.size()==k)
			 {
				 max1=Math.max(max1, j-i+1);
				 j++;
				 flag=true;
			 }
			 else if(map.size()>k)
			 {
				 while(map.size()>k)
				 {
					 map.put(s.charAt(i), map.get(s.charAt(i))-1);
					 if(map.get(s.charAt(i))==0)
					 {
						 map.remove(s.charAt(i));
					 }
					 i++;
				 }
				 j++;
			 }
		 }
		 if(flag)
	        return max1;
		 else
			 return -1;
	    }


public static void putting(String str,int k )
{
	int j=0;
	HashMap<Character, Integer> map=new HashMap<>();
	while(j<str.length())
	{
		
		if(map.containsKey(str.charAt(j)))
		{
			map.put(str.charAt(j), map.get(str.charAt(j))+1);
			j++;
		}
		else {
			map.put(str.charAt(j), 1);
			j++;
		}
	}
	System.out.println(map);
}


}
