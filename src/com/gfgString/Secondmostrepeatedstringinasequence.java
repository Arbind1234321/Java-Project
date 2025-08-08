package com.gfgString;

import java.util.HashMap;

public class Secondmostrepeatedstringinasequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]={"aaa", "bbb", "ccc", "bbb", "aaa", "aaa"}; int N=6;
		System.out.println(secFrequent(arr, N));

	}
	public static String secFrequent(String arr[], int N) {
		String s="";
	       HashMap<String , Integer> map=new HashMap<>();
	       for(String a :arr)
	       {
	    	   map.put(a,map.getOrDefault(a, 0)+1);
	       }
	      int b[]=new int [map.size()];
	      int count=0;
	      for(String  a:map.keySet())
	      {
	    	b[count++]=map.get(a); 
	      }
	      int sec=secmax(b);
	      for(String  a:map.keySet())
	      {
	        if(map.get(a)==sec) { 
	        	return a;
	        }
	      }
           
	          return s;
	        
	    }
	public static int secmax(int[] b) {
		int max=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		for(int i=0;i<b.length;i++)
		{
			if(b[i]>max)
			{
				smax=max;
				max=b[i];
			}
			else if(smax<b[i] && max !=b[i])
			{
				smax=b[i];
			}
		}
		
		return smax;
	}

}
