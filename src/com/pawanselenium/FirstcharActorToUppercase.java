package com.pawanselenium;

public class FirstcharActorToUppercase {
	

	public static void main(String[] args) {
	String str="welcome to java";
	String [] s=str.split(" ");
	UppaerCase(s);

	}
	public static void UppaerCase( String [] s) {
		
		for(String word:s)
		{
		   System.out.print(word.substring(0,1).toUpperCase()+word.substring(1)+" ");	
		}
		
		
	}

}
