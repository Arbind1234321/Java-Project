package leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberofOccurrences {

	public static void main(String[] args) {
		int []arr = {-3,0,1,-3,1,1,1,-3,10,0};
		System.out.println(uniqueOccurrences(arr));

	}
	
    public static boolean uniqueOccurrences(int[] arr) {
    
     HashMap<Integer, Integer> map=new HashMap<>();
     HashSet<Integer> set=new HashSet<>();
     for(int a: arr)
     {
    	 map.put(a, map.getOrDefault(a, 0)+1);
     }
     for(int key:map.keySet())
     {
    	 int a=map.get(key);
    	 if(set.contains(a))
    	 {
    		 return false;
    	 }
    	 else {
    		 set.add(a);
    	 }
     }
     
    	return true;
        
    }

}
