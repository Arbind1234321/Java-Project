package com.string;

public class ReversewordInString {

	public static void main(String[] args) {
	String str="cb ipctpyru  bovcbo";
	str=str.replaceAll("\\s+", " ");
	String a[]=str.split(" ");
	for(int i=a.length-1;i>=0;i--)
	{
		System.out.print(a[i]+" ");
	}
	//using StringBuilder class
//	StringBuilder sb=new StringBuilder();
//	for(int i=a.length-1;i>=0;i--)
//	{
//		sb.append(a[i]);
//		sb.append(" ");
//	}
//	System.out.println(sb.toString().trim());
//    
	}
//""bovcbo   ipctpyru cb""
}
