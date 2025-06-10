package geeksForGeeks;

import java.util.HashMap;
import java.util.Set;

public class Finduniqueelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int findUnique(int k, int[] arr) {
	        // code here
	        HashMap<Integer, Integer> map=new HashMap<>();
	        for(int a: arr)
	        {
	            map.put(a,map.getOrDefault(a, 0)+1);
	        }
	        Set<Integer> keys=map.keySet();
	        for(int key:keys)
	        {
	        	if(map.get(key)==1)
	        	{
	        		return key;
	        	}
	        }
	        return -1;
	    }

}
