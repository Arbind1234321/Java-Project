package geeksForGeeks;

import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionofArrayswithDistinct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static int numberofElementsInIntersection(int a[], int b[]) {
	      int count=0;
	     // ArrayList<Integer> list=new ArrayList<>();
	      HashSet<Integer> set=new HashSet<>();
	      for(int x:a)
	      {
	    	  set.add(x);
	      }
	      for(int y:b)
	      {
	    	  if(set.contains(y))
	    	  {
	    		  count++;
	    	  }
	      }
	      return count;
	      
	        
	    }

}
