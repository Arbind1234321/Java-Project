package com.number;

import java.util.Scanner;

public class MainResult {
     static int total;
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter marks of students");
	int m1=sc.nextInt();
	int m2=sc.nextInt();
	int m3=sc.nextInt();
	int m4=sc.nextInt();
	 total=m1+m2+m3+m4;
	String res=getResult(m1,m2,m3,m4);
	 System.out.println("Result : "+res);
	 System.out.println("total marks :"+total);
	}
	public static String getResult(int m1,int m2,int m3,int m4) {
		
	 if(m1<35||m2<35||m3<35||m4<35)
		 return "fail";
	 // total=m1+m2+m3+m4;
	 double avg=total/4.0;
	 if(avg>=85)
		 return "Distiction";
	 if(avg>=60)
		 return "first";
	 if(avg>=50)
		 return "Second";
	 return "pass";
	}

}
