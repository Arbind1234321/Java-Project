package com.array;
// counting frequency of a number without using map
public class FrequencyOfNumber {

	public static void main(String[] args) {
	 int a[]= {2,3,4,43,44,3,4,5,5,44};
	 for(int i=0;i<a.length;i++)
	 {
		 int x=a[i];
		 int count=0;
		 if(x==-1)continue;
		 for(int j=0;j<a.length;j++)
		 {
			 if(a[j]==x)
			 {
				 count++;
				 a[j]=-1;
			 }
		 }
	  System.out.println("Frequency of " +x+ " is -->" +count);	 
	 }


	}

}
