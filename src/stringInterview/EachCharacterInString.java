package stringInterview;

import java.util.HashMap;

public class EachCharacterInString {

	public static void main(String[] args) {
		String str="aniketkumar";//a--2  n--1 i--1 k--2  e--1 u--1  m--1 r---1
		HashMap<Character ,Integer> m=new HashMap();
		int l=str.length();
		int count=0;
		for (int i = 0; i <l; i++) 
		{
		char ch=str.charAt(i);
		if(m.containsKey(ch))
		{
			//digitmap.put(lastDigit ,digitmap.get(lastDigit)+1);
			 m.put(ch, m.get(ch)+1);	
		}
		else
		{
		 m.put(ch, 1);	
		}
		}
		System.out.println(m);

	}

}
