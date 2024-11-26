package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountOccuranceofEachCharacter {

	public static void main(String[] args) {
		String str = "Hello";
		HashMap<Character, Integer> hm = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (hm.containsKey(str.charAt(i))) {
				hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);
			} else {
				hm.put(str.charAt(i), 1);
			}
		}
		System.out.println(hm);
		Set<Character> keys = hm.keySet();
		for (Character key : keys) {
			System.out.println(key + "---->" + hm.get(key));
//			if(hm.get(key)<=1)
//			{
//				System.out.print(key);
//			}
		}
		// both key value coming together (k,v)
//	    Set<Map.Entry<Character, Integer>>set=hm.entrySet();
//	    for(Entry<Character, Integer>t:set)
//	    {
//	    	System.out.println(t.getKey()+"  "+t.getValue());
//	    }
	}

	}


