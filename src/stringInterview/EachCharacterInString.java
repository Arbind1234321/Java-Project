package stringInterview;

import java.util.HashMap;

public class EachCharacterInString {

	public static void main(String[] args) {
		String str="abbind";//a--1,b--2 i--1 n--1 d--1
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
