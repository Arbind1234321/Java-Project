package com.number;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		
		String st[]= {"Even","Odd"};
		System.out.println(num+" is "+st[num%2]);
		System.out.println(num+" is "+st[num/2]);

	}

}
