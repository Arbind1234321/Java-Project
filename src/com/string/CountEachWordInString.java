package com.string;

public class CountEachWordInString {
	static int iscount(String arr)
	{
		
		return arr.length();
	}

	public static void main(String[] args) {
		String str="Welcome this World";
		String arr[]=str.split(" ");
	System.out.println(arr.length);
		
		for(int i=0;i<arr.length;i++)
		{
		   int k=iscount(arr[i]);
		   System.out.println(arr[i]+"--->"+k);
		}

	}

}
