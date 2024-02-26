package com.PatternNotes;

public class Test {

	public static void main(String[] args) {
		int n=4;
		int nsp=0;
		int ele=2*n;
		int  q=n*n+1;
		int k=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=nsp;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=ele;j++)
			{
				if(j<=ele/2)
				{
					System.out.print(k+"*");
					k++;
				}
				else {
					System.out.print(q);
					q++;
					if(j<ele) System.out.print("*");
				}
				
			}
			q=q-(ele-1);
			ele=ele-2;
			nsp+=2;
			System.out.println();
		}

	}

}
