package com.number;

import java.util.Scanner;

public class DisplayMiddleNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        
        if(a>b&&a<c||a>c&&a<b)
        {
        	System.out.println(a+" is middle number ");
        }
        else if(b>a&&b<c||b>c&&b<a)
        {
        	System.out.println(b+" is middle number ");
        }
        else
        {
        	System.out.println(c+" is middle number ");
        }
	}

}
