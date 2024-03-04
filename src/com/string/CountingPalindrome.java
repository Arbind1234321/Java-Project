package com.string;

import java.util.Arrays;
import java.util.HashMap;

//counting Palindrome for given String
public class CountingPalindrome {
	
	static boolean isPalindrome(String word)
	{
		String st=word.toLowerCase();
		int l=st.length();
		for (int i = 0; i < l; i++,l--) 
		if(st.charAt(i)!=st.charAt(l-1)) 
			return false;	
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "This is madam madam aba moom aba Aba";
		HashMap<String, Integer> m=new HashMap<>();
		
		String [] arr = str.split(" ");
	
		
		for(String word:arr)
		{
			if(isPalindrome(word))
			{
				if(m.containsKey(word))
				{
				  	m.put(word,m.get(word)+1 );
				}
				else
				{
					m.put(word, 1);
				}
			}
			
		}
		System.out.println(m);

	}

}
