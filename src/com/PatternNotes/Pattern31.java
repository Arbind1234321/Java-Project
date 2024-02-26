package com.PatternNotes;

public class Pattern31 {

	public static void main(String[] args) {
		int n=6;
		int a=1;
		int t=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++)
			{   
				if(i%2==0) {
				System.out.print(a+" ");
				t++;
				a++;
				}
				else {
					System.out.print(t+" ");
					
					t--;
					a++;
				}
			}
			t=a+i;
			System.out.println();
		}

	}

}
