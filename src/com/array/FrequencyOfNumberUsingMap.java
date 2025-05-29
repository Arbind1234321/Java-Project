package com.array;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
public class FrequencyOfNumberUsingMap {
	public static void main(String[] args) {
		int[] arr = { 2, 2, 3, 4, 45, 66, 66, 7, 4 };
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		// System.out.println(map);
		Set<Integer> key = map.keySet();
		for (Integer k : key) {
			if (map.get(k) == 1) {
				System.out.println(k + " -->" + map.get(k));
			}
		}
		
	
		
		// both key value coming together (k,v)
//       for(Entry<Integer, Integer> set:map.entrySet())
//       {
//    	   System.out.println(set.getKey()+" ---> "+set.getValue());
//       }
	}

}
