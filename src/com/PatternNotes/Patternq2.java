package com.PatternNotes;

public class Patternq2 {

	public static void main(String[] args) {
	 int n=4;
	 int k=1;
	 for(int i=1;i<=n;i++) {
		 for(int j=1;j<=n;j++)
		 {
			 System.out.print(k+" ");
			 if(i%2==0) k++;
			 else k--;
			// System.out.println();
			 if(i%2==1)
			 {
				 k=k+n-1;
			 }
			 else
			 {
				 k=k+n+1;
			 }
		 }
		 System.out.println();
	 }

	}

}
