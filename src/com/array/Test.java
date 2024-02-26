package com.array;

import java.util.HashMap;
import java.util.Set;

public class Test {
	/*public void DigitCount(long number)
	{
	   // if(String.valueOf(number).length()==1)
		if(number==0)
	    {
	    	System.out.println(number+"--->"+1);  
	    }
		HashMap<Long, Integer> digitmap=new HashMap<Long,Integer>();
		while(number!=0)
		{
			long lastdigit=number%10;
			if(digitmap.containsKey(lastdigit))
			{
				digitmap.put(lastdigit,digitmap.get(lastdigit)+1);
			}
			else
			{
				digitmap.put(lastdigit,1);
			}
			number=number/10; 
		}
		Set<Long> keys=digitmap.keySet();
		for(long key:keys)
		{
			System.out.println(key+"--->"+digitmap.get(key));
		}
	}*/
	/*public static  int squreIt(int n)
	{
		return n*n;
	}
	public static void main(String[] args) {
		
		Test t=new Test();
		//t.DigitCount(3);
		 int b=Test.squreIt(5);
		 System.out.println(b);
		
		
	}*/
	/*public static void main(String[] args) {
		int[] arr= {0,2,344,5,6};
		int ele=7;
		int count=0;
	     for(int i=0;i<arr.length;i++)
	     {
	    	 if(arr[i]==ele)
	    	 {
	    		 System.out.println("element is present");
	    		 count++;
	    		 break;
	    	 }
	     }
		
	   if(count==0)
	   {
		  System.out.println("element not present"); 
	   }
	}*/
	public static void main(String[] args) {
		int n=4;
		int a;
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				a=1;
			}
			else a=0;
			for(int j=1;j<=i;j++)
			{
				System.out.print(a);
				if(a==0)a=1;
				else a=0;
					
			}
			System.out.println();
		}
	}
	
	
}
	
	





























