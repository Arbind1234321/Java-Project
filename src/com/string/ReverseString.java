package com.string;

public class ReverseString {
 public static void main(String[] args) 
 {
   String str="ABCD";
   String rev="";
   //using  charAt() method
  /* int n=str.length();
   for(int i=n-1;i>=0;i--)
   {
	   rev=rev+str.charAt(i);
   }
   System.out.println(rev);*/
   //using toCharArray()
   /*char a[]=str.toCharArray();
   int n=a.length;
   for(int i=n-1;i>=0;i--)
   {
	   rev=rev+a[i];
   }
   System.out.println(rev)*/
   //using SrtingBuffer class
   StringBuffer sb=new StringBuffer(str);
   System.out.println(sb.reverse());
 }
}
