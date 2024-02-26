package com.kunal;

public class OccuraningOfNumber {

	public static void main(String[] args) {
	  int num=138;
	  int count =0;
	  while(num>0)
	  {
		  int rem=num%10;
		  if(rem==3)
		  {
			  count++;
		  }
		  num=num/10;
	  }
	  System.out.println(count);

	}

}
