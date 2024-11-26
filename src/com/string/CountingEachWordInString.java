package com.string;

public class CountingEachWordInString {

	public static void main(String[] args) {
		String str="welcome to this world";
		int count =1;
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)==' '&& str.charAt(i+1)!=' ')
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
