package com.gfgString;

public class RunLengthEncoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaaabbbccc";
		System.out.println(encode(s));

	}

	  public static String encode(String str) {
      	//String s="";
      	int i=0;
      	int j=0;
      	int count=0;
      	StringBuffer sb=new StringBuffer();
      	while(j<str.length())
      	{
      		char c=str.charAt(i);
      		if(c==str.charAt(j)) {
      			count++;
      			j++;
      		}else {
      			//s=s+c+Integer.toString(count);
      			sb.append(c).append(count);
      			i=j;
      			count=0;
      			
      		}
      			
      	}
      	//s=s+str.charAt(i)+count;
      	sb.append(str.charAt(i)).append(count);
      	return sb.toString();
			
	        
	    }
}
