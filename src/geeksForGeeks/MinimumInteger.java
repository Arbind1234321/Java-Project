package geeksForGeeks;

import java.util.Arrays;

public class MinimumInteger {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
     int arr[]= {1,3,2};
     int n=arr.length;
     System.out.println(minimumInteger(n, arr));
	}
	 public static int minimumInteger(int N, int[] A) {
		
		long sum=0;
		for(int a:A)
		{
			sum+=a;
		}
		Arrays.sort(A);
		for(int i=0;i<N;i++)
		{
		  if(sum<=(long)A[i]*N)
		  {
			  return A[i];
		  }
			
		}
		return -1;
	        
	  }

}
