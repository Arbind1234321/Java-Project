package com.array;

public class Strinone {

	public static void main(String[] args) {
	   String str="11100100111111";
	   char ch[]=str.toCharArray();
	   int count=0;
	   int max=0;
	   int index=0;
	   for(int i=0;i<str.length();i++)
	   {
		   if(ch[i]=='1')
		   {
			count++;  
			// max=count;
			 index=i-count+1;
		   }
		   else
		   {
			   if(max<count)
			   {
				   max=count;
				   //index=i-count;
			   }
			   
			   count=0;
		   }
		   
	   }
	   System.out.println(max+" "+index);

	}

}
