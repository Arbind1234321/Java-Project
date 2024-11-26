package Collecions;

import java.util.HashMap;

public class Asdddd
{
	public static void main(String[] args) {
		 String str="AAGFDASDFGHJKKL";
		 HashMap<Character, Integer> hm=new HashMap<>();
		 for(Character c:str.toCharArray())
		 {
			//hm.put(c, hm.getOrDefault(c, 0)+1); //{A=3, S=1, D=2, F=2, G=2, H=1, J=1, K=2, L=1}
			 if(hm.containsKey(c))
			 {
				 hm.put(c, hm.get(c)+1);
			 }
			 else
			 {
				hm.put(c, 1); 
			 }
		 }
		 System.out.println(hm);
	}

}
