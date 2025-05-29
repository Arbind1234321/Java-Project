package geeksForGeeks;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class NonRepeatingCharacter {

	public static void main(String[] args) {
		String s = "geeksforgeeks";
		char []ch=s.toCharArray();
		//f
		LinkedHashMap<Character, Integer> map=new LinkedHashMap<>();
		
		for(char c:ch)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		Set<Character> keys = map.keySet();
		for (Character key : keys) {
	     if(map.get(key)==1)
	     {
	    	 System.out.println(key);
	    	 break;
	     }
		}

	}

}
