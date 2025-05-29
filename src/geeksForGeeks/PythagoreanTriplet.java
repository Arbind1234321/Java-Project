package geeksForGeeks;

import java.util.Arrays;
import java.util.HashSet;

public class PythagoreanTriplet {

	public static void main(String[] args) {
		int []arr= {3, 2, 4, 6};
		System.out.println(pythagoreanTriplet1(arr));
	}
	static boolean pythagoreanTriplet1(int[] arr) {
		int n=arr.length;
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<n;i++)
		{
			set.add(arr[i]*arr[i]);
		}
	    for(int i=0;i<n;i++)
	    {
	    	int a=arr[i];
	    	for(int j=i+1;j<n;j++)
	    	{
	    		int b=arr[j];
	    		int sqsum=a*a+b*b;
	    		if(set.contains(sqsum))
	    		{
	    			return true;
	    		}
	    	}
	    }
	    return false;
    }
	static boolean pythagoreanTriplet(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			arr[i]=arr[i]*arr[i];
		}
		Arrays.sort(arr);
		
		for (int i = n - 1; i >= 2; i--) {
            int left = 0;
            int right = i - 1;
            while(left<right)
            {
            	int sum=arr[left]+arr[right];
            	if(sum==arr[i])
            	{
            		return true;
            	}
            	else if (sum < arr[i]) {
                    left++;
                } else {
                    right--;
                }
            }
		}
		return false;
		
        
    }
	public static  boolean istriplet(int a, int b, int c) {
		  
		return (a*a)+(b*b)==(c*c);
	}

}
