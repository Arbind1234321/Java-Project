package com.slidingwindow;

import java.util.ArrayList;
import java.util.Arrays;

public class SlindingWindowBruteForce {

	public static void main(String[] args) {
		//int []arr= {0,3,-5,-2,3,-7,9};//-5-5
		//int k=3;
		//System.out.println(maxSum(arr, k));
		//System.out.println(Arrays.toString(firstNegative(arr, k)));
		//String str1="forxxorfxdorf";
		//String str2="rof";
		//char ch[]=str2.toCharArray();
		//Arrays.sort(ch);
		//System.out.println(ch);
		//int k=str2.length();
		//System.out.println(countAnagram(str1, str2, k));
		int []arr= {1,3,-1,-3,5,3,6,7};
		int k=3;
		int n=8;
		System.out.println(maxSubArray(arr, k, n));

	}
	public static int maxSum(int []arr,int subarray)//7-3
	{
		int max=0;
		
		for(int i=0;i<arr.length-subarray+1;i++)
		{
			int sum=0;
			for(int j=i;j<i+subarray;j++)
			{
				sum=sum+arr[j];
			}
			max=Math.max(max, sum);
		}
		return max;
	}

	public static int [] firstNegative(int [] arr,int k)
	{
		int [] ans=new int[arr.length-k+1];
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<arr.length-k+1;i++)
		{
			int count=0;
			for(int j=i;j<k+i;j++)
			{
				if(arr[j]<0 &&count<1)
				{
					//ans[i]=arr[j];
					list.add(arr[j]);
					count++;
				}
			}
			if(count==0)
			{
				//ans[i]=0;
				list.add(0);
			}	
		}
		System.out.println(list);
		return ans;
	}
    
	public static int countAnagram(String str1,String str2,int k)
	{
//		int i=0;
//		int j=0;
		
		int count =0;
		char [] c=str2.toCharArray();
		Arrays.sort(c);
		//System.out.println(Arrays.toString(c));
		
		for(int i=0;i<str1.length()-k+1;i++)
		{   String s="";
			for(int j=i;j<k+i;j++)
			{
				s=s+str1.charAt(j);
			}
			char[]ch=s.toCharArray();
			Arrays.sort(ch);
		
			if(Arrays.equals(c,ch))
			{
				count++;
			}
		}
		return count;
	}

	
	 public static ArrayList<Integer>  maxSubArray(int []arr,int k,int n)
	 {
		 int max=0;
		 ArrayList<Integer> list= new ArrayList<>();
		 for(int i=0;i<n-k+1;i++)
		 {
			for(int j=i;j<k+i;j++)
			{
			   	max=Math.max(max, arr[j]);
			}
			//System.out.print(max+" ");
			list.add(max);
		 }
		 return list;
	 }
	
}
