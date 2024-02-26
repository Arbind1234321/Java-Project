package com.pattern;

import java.util.Scanner;

public class FloyidTringle {

	public static void main(String[] args) {
	   Scanner sc =new Scanner(System.in);
	   System.out.println("Enter number");
	   int n=sc.nextInt();
	  /* for(int i=1;i<=n;i++)
	   {
		   for(int j=1;j<=i;j++)
		   {
			   System.out.print("* ");
		   }
		   System.out.println();
			   
	   }*/
	   //1
	   //1 2
	   //1 2 3
	  /* for(int i=1;i<=n;i++)
	   {    int a=1;
		   for(int j=1;j<=i;j++)
		   {
			   System.out.print(a+" ");
			   a++;
		   }
		   System.out.println();
			   
	   }*/
	   //1 
	   //1 3
	   //1 3 5
	   /*for(int i=1;i<=n;i++)
	   {
		   int a=1;
		   for(int j=1;j<=i;j++)
		   {
			   System.out.print(a);
			   a=a+2;
		   }
		   System.out.println();
			   
	   }*/
	   //ABCD
	   //ABCD
	   for(int i=1;i<=n;i++)
	   {
		   char ch='A';
		   int k=0;
		   for(int j=1;j<=i;j++)
		   {
			   System.out.print((char)(ch+k)+" ");
			   k++;
		   }
		   System.out.println();
			   
	   }
	   
	   

	}

}
