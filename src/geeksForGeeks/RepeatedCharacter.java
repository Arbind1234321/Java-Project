package geeksForGeeks;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class RepeatedCharacter {

	public static void main(String[] args) {
		String S = "yhkoryenollwpjwqquwigwnebvypnigmpsdjtjylu";
		System.out.println(firstRep(S));
	}

  public static char firstRep(String S) {
	  
	   Map<Character, Integer> map=new LinkedHashMap<Character, Integer>();
	   for(char ch:S.toCharArray())
	   {
		   map.put(ch, map.getOrDefault(ch, 0)+1);
	   }
	   
	   System.out.println(map);
	   Set<Character>keys=map.keySet();
	   for(Character k:keys)
	   {
		   if(map.get(k)>=2)
		   {
			   return k;
		   }
	   }
	   
	   
       
      return '#';  
    }
}
