package com.slidingwindow;

public class LargestSubArraySumK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {4,1,1,1,2,3,5};
System.out.println(longestSubarray(arr, 5));
//System.out.println(subSum(arr, -5));
	}
	 public static int longestSubarray(int[] arr, int k) {
	        int ans=-1;
	        int i=0,j=0;
	        int sum=0;
	        
	        while(j<arr.length)
	        {
	        	sum +=arr[j];
	        	if(sum<k)
	        	{
	        		j++;
	        	}
	        	else if(sum==k)
	        	{
	        	ans=Math.max(ans, j-i+1);
	        	j++;
	        	}
	        	else if(sum> k)
	        	{
	        		while(sum > k)
	        		{
	        			sum=sum-arr[i];
	        			i++;
	        		}
	        		j++;
	        	}
	        }
	        return ans;
	        
	    }
	public static int subSum(int arr[],int sum)
	{
		int ans =0;
		int count=0;
		
		for(int i=0;i<arr.length;i++)
		{    int  s=0;
			for(int j=i;j<arr.length;j++)
			{
				
				 s+=arr[j];
				
				if(sum==s)
				{
					count=j-i+1;
					
				}
				
			}
			//System.out.println(count);
			ans=Math.max(ans, count);
			//System.out.println(ans);
			
			s=s-arr[i];
		}
		return ans;
	}

}
