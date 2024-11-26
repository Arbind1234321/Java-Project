package leetcode;

import java.util.Arrays;

public class MultiplicationExceptItself {
	
	public static int  [] multiplication(int [] a)
	{
		int n=a.length;
		int []left=new int[n];
		int right[]=new int[n];
		int ans[] = new int [n];
		//for left
		left[0]=1;
		for(int i=1;i<n;i++)
		{
			 left[i]=left[i-1]*a[i-1];	
		}
		right[a.length-1]=1;//1  4
		for(int j=n-2;j>=0;j--)//1
		{
			right[j]=right[j+1]*a[j+1];
		}
		for(int i=0;i<n;i++)
		{
			ans[i]=left[i]*right[i];
		}
		
		//System.out.println(Arrays.toString(ans));
		
	 return ans;	
	}

	public static void main(String[] args) {
		int []arr= {4,5,6,1};
		int []k=multiplication(arr);
		System.out.println(Arrays.toString(k));

	}

}
