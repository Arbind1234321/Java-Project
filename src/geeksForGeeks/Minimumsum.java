package geeksForGeeks;

import java.math.BigInteger;
import java.util.Arrays;

public class Minimumsum {

	public static void main(String[] args) {
		int arr[]= {6, 8, 4, 5, 2, 3};
	minSum(arr);

	}
	public static String minSum(int[] arr) {
	     Arrays.sort(arr);
	     StringBuilder sum1 = new StringBuilder();
	     StringBuilder sum2 = new StringBuilder();
	     for(int i=0;i<arr.length;i++)
	     {
	        if(i%2==0)
	        {
	            sum1.append(arr[i]);
	        }
	        else{
	            sum2.append(arr[i]);
	        }
	        
	     }
	      BigInteger num1=new BigInteger(sum1.toString());
	      BigInteger num2=new BigInteger(sum1.toString());
	     return num1.add(num2).toString();
	        
	    }

}
