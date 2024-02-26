package com.pattern;

public class TringlePyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		int nsn=1;
		int a=n;
		for(int i=1;i<=n;i++)
			
		{
			for(int k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=nsn;j++)
			{
				System.out.print(a);
				a++;
			}
			nsn=nsn+1;
			a=n-i;
			int p = i - 1;
			int t=n-1;
			for (int m = 1; m <= p; m++) {
				System.out.print(t);
				t--;
			}
			System.out.println();
		}

	}

}
