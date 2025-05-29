package geeksForGeeks;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

public class NonRepeatingElement {

	public static void main(String[] args) {
		int[] arr = { 4 ,-8 ,1 ,-4 ,-3 ,-8 ,-3, -10 ,3 ,-3 ,10 };
		System.out.println(firstNonRepeating(arr));

	}

	public static int firstNonRepeating(int[] arr) {
		HashMap<Integer, Integer> map = new LinkedHashMap();

		for (int a : arr) {
			map.put(a, map.getOrDefault(a, 0) + 1);
		}
		
		Set<Entry<Integer, Integer>> entry=map.entrySet();
		
		   for( Entry<Integer, Integer> e:entry)
		   {
			   if(e.getValue()==1)
			   {
				   return  e.getKey();
			   }
		   }

//		for (Integer k : map.keySet()) {
//			if (map.get(k) == 1) {
//				return k;
//			}

//		}

		return 0;

	}

}
