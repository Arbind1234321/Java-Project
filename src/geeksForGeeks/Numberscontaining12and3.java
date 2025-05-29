package geeksForGeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Numberscontaining12and3 {

	public static void main(String[] args) {
		List<Integer> input1 = Arrays.asList(4, 6, 7);
		System.out.println(filterByDigits(input1));
	

	}
	public static List<Integer> filterByDigits(List<Integer> arr) {
        ArrayList<Integer> list=new ArrayList<>();
          for(int a:arr) {        	
        	  if(isvalid(a))
        	  {
        		  list.add(a);
        	  }
          }
          if(list.isEmpty())
          {
        	  list.add(-1);
          }
        return list;        
    }
	public static boolean isvalid(int n) {
		n=Math.abs(n);
		  if(n==0) return false;
		  while(n!=0)
		  {
			  int digit=n%10;
			  if(digit !=1 && digit !=2 && digit !=2)
			  {
				  return false;
			  }
		  }
		return true;
	}

}
