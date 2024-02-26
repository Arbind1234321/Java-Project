package com.pattern;

public class AlphaBetTringle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		for(int i=1;i<=n;i++) {
			//for spaces
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			int a=65;
			//char ch=(char)a;
			for(int k=1;k<=i;k++) {

				char ch=(char)a;
				System.out.print(ch);
				a++;
				//ch++;
			}
			System.out.println();
		}

	}

}
