package com.string;

public class RemoveDuplicatecharacter {

	public static void main(String[] args) {
	String str="programinga";
   //Approch 1
	//StringBuilder sb=new StringBuilder();
	StringBuffer sb=new StringBuffer();
	str.chars().distinct().forEach(c ->sb.append((char)c));
	System.out.println(sb);

	}

}
