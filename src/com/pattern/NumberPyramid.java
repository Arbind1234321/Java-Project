package com.pattern;

public class NumberPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		/*int nsp = n - 1;
		int nst = 1;
		for (int i = 1; i <= n; i++) {
			// for spaces
			for (int j = 1; j <= nsp; j++) {
				System.out.print(" ");
			}
			nsp--;
			// for number
			for (int k = 1; k <= nst; k++) {
				System.out.print(k);
			}
			nst = nst + 2;
			System.out.println();
		}*/
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
			  System.out.print(" ");	
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print(k);
			}
			System.out.println();
		}

	}

}
