package com.pattern;

public class AlphabetPyraid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			int a=65;
			
			for(int  k=1;k<=2*i-1;k++)
			{   char ch=(char)a;
				System.out.print(ch);
				//ch++;
				a++;
			}
			System.out.println();
		}

	}

}
