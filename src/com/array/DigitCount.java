package com.array;

import java.util.HashMap;
import java.util.Set;

public class DigitCount {
	
	public static void countDigit(long number)
	{
		if(number==0)
		{
			System.out.println(number+" : " +1);
		}
		HashMap<Long, Integer> digitmap=new HashMap<Long,Integer>();
		
		while(number!=0)
		{
			long lastDigit=number%10;
			if(digitmap.containsKey(lastDigit))
			{
				digitmap.put(lastDigit ,digitmap.get(lastDigit)+1);
				
			}
			else
			{
				digitmap.put(lastDigit,1);
			}
			number/=10;
		}
		Set<Long> keys=digitmap.keySet();
		for(Long key:keys)
		{
			System.out.println(key+" : "+digitmap.get(key));
		}
	}

	public static void main(String[] args) {
		countDigit(11222245);
		
	}

}
