package com.slidingwindow;

import java.util.HashMap;

public class ToyPick {

	public static void main(String[] args) {
		String str = "abaccaba";
		System.out.println(toyPicking(str));

	}

	public static  int toyPicking(String str)
	{
		if(str.length()==0)
		{
			return 0;
		}
		int i=0;int j=0;
		int max1=0;
		HashMap< Character, Integer> map=new HashMap<>();
		while(j<str.length())
		{
			
	      if(map.containsKey(str.charAt(j)))
	      {
	    	  map.put(str.charAt(j),map.get(str.charAt(j))+1);
	      }
	      else
	      {
	    	map.put(str.charAt(j), 1);
	      }
	      if(map.size()<2)
	      {
	    	  j++;
	      }
	      else if(map.size()==2)
	      {
	    	 max1=Math.max(max1, j-i+1);
	    	 j++;
	      }
	      else if(map.size()>2)
	      {
	    	  while(map.size()>2)
	    	  {
	    		  map.put(str.charAt(i), map.get(str.charAt(i))-1);
	    		  if(map.get(str.charAt(i))==0)
	    		  {
	    			  map.remove(str.charAt(i));
	    		  }
	    		  i++;
	    	  }
	    	  j++;
	      }
				
        }
		return max1;

}
}




