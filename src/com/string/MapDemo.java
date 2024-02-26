package com.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
	Map<Integer,String> m=new HashMap<>();
	System.out.println(m.put(1, "Arbind"));
	System.out.println(m.put(2,"ASd"));
	System.out.println(m.put(1, "Ravi"));
	//System.out.println(m.get(2));
	//System.out.println(m)
    Set<Integer> key=m.keySet();
    for(Integer k:key)
    {
    	System.out.println(k+"--->"+m.get(k));
    }

	}

}
