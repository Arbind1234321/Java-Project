package com.string;

public class SortString {
	public  static char[] issort(String str) {
		char [] ch=str.toCharArray();
		for (int i = 0; i < ch.length-1; i++)
		{
		   for (int j = i+1; j < ch.length; j++)
		   {
			if(ch[i]>ch[j])
			{
				char t=ch[i];
				ch[i]=ch[j];
				ch[j]=t;
			}
		   }
		}
		//String st=new String(ch);//converting char to  String 
		return ch;
		
	}
	public static void main(String[] args) {
	 String str="MadaM";
	char [] s= issort(str);
	System.out.println(s);

	}

	

}
