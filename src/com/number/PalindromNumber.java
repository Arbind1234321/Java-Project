package com.number;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		 String t=String.valueOf(n);
		  boolean b=true;
		 for(int i=0;i<t.length()/2;i++)
		 {
			 if(t.charAt(i)!=t.charAt(t.length()-1-i))
			 {
				 b=false;
			 }
		 }
		 if(b)
		 {
			 System.out.println("palindrome");
		 }
		 else {
			 System.out.println("not palindrome");
		 }
		int  temp=n;
		int rem=0;
		String s="";
		int p=0;
		while (n!=0) {
			//rem=n%10;
			p=p*10+n%10;
			n=n/10;
			//using  string
			//s=s+rem;
			
		}
		System.out.println(p);
		System.out.println(s);
		//if(temp==Integer.parseInt(s))
		if(temp==p)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not  palindrome");
		}
	}

}
