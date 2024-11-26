package map;

import java.util.HashMap;
import java.util.Set;

public class countEachCharacterInGivenString {
	public static String countCharacter(String str)
	{
		HashMap<Character, Integer> hm=new HashMap<>();
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(hm.containsKey(ch))
		{
			hm.put(ch, hm.get(ch)+1);
		}
		else
		{
			hm.put(ch, 1);
		}
	}
	//System.out.println(hm);
	Set<Character>keys=hm.keySet();
	String st="";
	for(Character t:keys)
	{
		st=st+t+""+hm.get(t);
	}
	System.out.println(st);
		
		return st;
	}

	public static void main(String[] args) {
		String str="aaabbcbdd";//a3b3cd2
		String k=countCharacter(str);
		System.out.println(k);

	}

}
