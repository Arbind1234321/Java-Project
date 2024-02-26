package com.number;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		String[] str= {"abc","bvc"};
		System.out.println(Arrays.toString(str));
		for(int i=str.length-1;i>=0;i--)
		{
			System.out.println(str[i]);
		}

	}

}
