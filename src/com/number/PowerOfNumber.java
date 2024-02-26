package com.number;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter number ");
	    int num=sc.nextInt();
	    System.out.println("Enter the power of number");
	    int pow= sc.nextInt();
	    int res=powOfNum(num,pow);
	    System.out.println(num+" power "+pow+" is : "+res);
	    

	}

	public static int powOfNum(int num, int pow) {//2 3 2 1 0
		int pw=1;//pw=4
		while(pow>0)
		{
			pw=pw*num;//8
			pow--;//
		}
		return pw;
	}


}
