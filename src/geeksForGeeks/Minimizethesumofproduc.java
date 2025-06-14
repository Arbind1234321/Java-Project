package geeksForGeeks;

import java.util.Collections;
import java.util.List;

public class Minimizethesumofproduc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public long minValue(List<Integer> arr1, List<Integer> arr2) {
	    long min=0;
	    Collections.sort(arr1);
	    Collections.sort(arr2);
	    int start=0;
	    int end=arr2.size()-1;
	    while(start<end)
	    {
	    	min=arr1.get(start)*arr2.get(end);
	    	start++;
	    	end--;
	    }
	    
	    return min;
	        
	    
	}

}
