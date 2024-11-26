package com.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Test {
	 public static void main(String[] args) {
		int a[]= {1,1,0,0,1,0,1,1,1,0};
		String s1="1100101110";
		char s[]=s1.toCharArray();
		int count=0;
		int max1=0;
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			//char c=s.charAt(i);
			//if(c=='1')
			//if(a[i]==1)
			if(s[i]=='1')
			{
				count++;
				//max1= Math.max(max1,count);
				
				
			}
			else {
				if(max1<count)
				{
				 max1=count;
				 index=i-count;
				}
				count=0;
			}
		}
		System.out.println(max1);
		System.out.println(index);
	}
	
}
	
	





























