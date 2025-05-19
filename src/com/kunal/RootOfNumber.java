package com.kunal;

public class RootOfNumber {

	public static void main(String[] args) {
		//int n=40;
		//int p=3;
		//System.out.printf( "%.3f",+squre(n,p));
		System.out.println(newtonSqureRoot(40));

	}
	
	public static double newtonSqureRoot(int n)
	{
		double x=n;
		double root;
		while(true) {
			root=0.5 * (x + (n/x));
			if(Math.abs(root-x)< 0.5)
			{
				break;
			}
			x=root;
		}
		return root;
	}
	
	public  static double squre(int n,int p)
	{
		int start=0;
		int end=n;
		double root=0.0;
		while(start<=end)
		{
			int m=start+(end-start)/2;
			if(m*m==n)
			{
				return m;
			}
			if(m*m>n)
			{
				end=m-1;
			}else {
				start=m+1;
			}	
		}
		double inc=0.1;
		for(int i=0;i<p;i++)
		{
			while(root*root<=n)
			{
			root+=inc;	
			}
			root-=inc;
			inc /=10;
		}
		
		//another
//		while(root*root<=n)
//		{
//		root +=inc;	
//		}
		
		return root;
		
	}

}
