package geeksForGeeks;

import java.util.ArrayList;

public class PlusOne {

	public static void main(String[] args) {
			

	}
	 public static ArrayList<Integer> increment(ArrayList<Integer> arr, int N) {
	        ArrayList<Integer> list  = new ArrayList<>();
	        String s="";
	        for(int i=0;i<N;i++)
	        {
	        	s=s+arr.get(i);
	        }
	        int x=Integer.parseInt(s);
	        x=x+1;
	        String b =Integer.toString(x);
	        for(char a:b.toCharArray())
	        {
	        	list.add(a-'0');
	        }
	        
	        return list;
	        
	    }

}
