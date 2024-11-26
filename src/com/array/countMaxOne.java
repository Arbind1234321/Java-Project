package com.array;

public class countMaxOne {

	public static void main(String[] args) {
    String str="11100100111111";
    char ch[]=str.toCharArray();
   // int count=0;
    //int count1=0;
    //int max=0;
    int ans = Integer.MIN_VALUE;
    int first = -1;
    int last = -1;
    for(int i=0;i<=ch.length-1;i++)
    {
    	if(ch[i]=='1')
    	{
    		int j=i;
    		while(j < ch.length && ch[j] == '1') j++;
    		if (j-i > ans) {
    			first = i;
    			last = j-1;
    			ans = j-i;
    		}
    		i = j;
    	}
    	
//    	else if(max>count) {
//    		max=0;
//    	
//    	}
    	/*else
    	{
    	  count1++;	
    	}*/
    }
    //System.out.println("Total number of 1 is : "+count);
    //
    //System.out.println("Total number of zero is : "+ans + "first is " + first + " last is " + last);
	}

}
