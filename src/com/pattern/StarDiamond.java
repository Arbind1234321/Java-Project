package com.pattern;

public class StarDiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int n=7;
		int nst=1;
		int nsp=n/2;
		//   1
		 *  121
		 * 12321 
		for(int i=1;i<=n;i++)
		{
			//for space
			for(int j=1;j<=nsp;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=nst;k++)
			{
				System.out.print("*");
			}
			if(i<n/2+1)
			{
			nst=nst+2;
			nsp--;
			}
			else
			{
				nst=nst-2;
				nsp++;
			}
			System.out.println();*/
		//****
		// ***
		//  **
		//   *
		
		int n=4;
		int sps=0;
		int nst=n;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sps;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=nst;k++)
			{
				System.out.print("*");
			}
			sps++;
			nst--;
			System.out.println();
		}
		
		}

	}


