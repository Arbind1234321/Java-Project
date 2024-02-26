package com.number;

import java.util.Scanner;

public class FirstNNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number ");
		int num=sc.nextInt();
		int total=sum1(num);
		System.out.println(total);
	}

	 static int sum1(int num) {
	
		 int sum=0;
		 while(num>0)
		 {
			 sum=sum+num;
			 num--;
		 }
		return sum;
	}

}
