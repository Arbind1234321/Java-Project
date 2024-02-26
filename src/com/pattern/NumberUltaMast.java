package com.pattern;

public class NumberUltaMast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=4;
		int n=m-1;
		int num=n;
		int nsp=1;
		int t=1;
		for(int i=1;i<=2*m-1;i++) {
			if(i<=m/2+1) {
			System.out.print(t);
			t++;
			}
			else {
				System.out.print(t);
				t--;
			}
		}
		System.out.println();
		for(int i=1;i<=n;i++) {
			int a=1;
			for(int j=1;j<=num;j++)
			{
				System.out.print(a);
				a++;
			}
			for(int k=1;k<=nsp;k++)
			{
				System.out.print(" ");
			}
			int p=a-1;
			for(int l=1;l<=num;l++)
			{
				System.out.print(p);
				p--;
			}
			num--;
			nsp+=2;
			System.out.println();
			
		}

	}

}
