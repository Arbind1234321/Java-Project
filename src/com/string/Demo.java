package com.string;

public class Demo {

	public static void main(String[] args) {
		String s1=new String("arbind");
		String s2=s1.toUpperCase();
		String s3=s1.toLowerCase();//pointing to  same object of s
		
		System.out.println(s1==s2);//false(==) method used for reference comparison in string
		System.out.println(s1==s3);//true
		String s4=s2.toLowerCase();
		System.out.println(s4==s2);//false
		String s5=s4.toUpperCase();
		System.out.println(s5==s2);//false

	}

}
