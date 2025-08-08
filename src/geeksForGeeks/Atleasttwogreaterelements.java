package geeksForGeeks;

import java.util.Arrays;

public class Atleasttwogreaterelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public long[] findElements(long arr[]) {
	        long a[]=new long [arr.length-2];
	        int index=0;
	        Arrays.sort(arr);
	        for(int i=0;i<a.length;i++)
	        {
	        	a[index++]=arr[i];
	        }
	        return a;
	    }
	

}
