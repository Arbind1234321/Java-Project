package com.number;

public class SpecialNumber {

	public static void main(String[] args) {
		int num=56;
		int d1=num%10;
		int d2=num/10;
		
		int sum =(d1*d2)+(d1+d2);
		if(sum==num)
		{
			System.out.println("Number is special " +num);
		}
		else
		{
			System.out.println("Not special number "+num);
		}
		

	}

}
