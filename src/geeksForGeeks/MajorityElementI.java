package geeksForGeeks;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementI {

	public static void main(String[] args) {
		int []arr= {1, 2, 3, 4, 5};
		System.out.println(findMajority(arr));

	}

	 public static  List<Integer> findMajority(int[] nums) {
	      List<Integer> list=new ArrayList<>();
	      int n=nums.length;
	      Integer cand1=null;Integer cand2=null;
	      int count1=0; int count2=0;
	      for(int a:nums)
	      {
	    	  if(cand1 !=null && a==cand1)
	    	  {
	    		  count1++;
	    	  }
	    	  else if(cand2 !=null &&a==cand2)
	    	  {
	    		  count2++;
	    	  }
	    	  else if(count1==0)
	    	  {
	    		  cand1=a;
	    		  count1=1;
	    	  }
	    	  else if(count2==0)
	    	  {
	    		  cand2=a;
	    		  count2=1;
	    	  }
	    	  else {
	    		  count1--;
	    		  count2--;
	    		  
	    	  }
	      }
	     count1=0;count2=0;
	     for(int b:nums) {
	    	 if(b==cand1) {
	    		 count1++;
	    	 }
	    	 else if(b==cand2) {
	    		 count2++;
	    	 }
	     }
	     if(count1 > n/3) list.add(cand1);
	     if(count2 > n/3) list.add(cand2);
	     
	      return list;
	    }
}
