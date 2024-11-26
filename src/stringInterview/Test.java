package stringInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import leetcode.WordPattern;

//Isomerphic problem
public class Test {
	public static int[] twoSum(int []a, int target)
	{
		HashMap<Integer, Integer> hm =new HashMap<>();
		for(int i=0;i<a.length;i++)
		{
			int req=target-a[i];
			if(hm.containsKey(req))
			{
				int s[]= {hm.get(req),i};
				return s;
			}
			else
			{
				hm.put(a[i], i);
			}
		}
		
		return null;
		
	}
	
	public static void main(String[] args) 
	{
	   int a[]= {2,7,4,6};
	   int target =8;
	  
	  System.out.println(Arrays.toString(twoSum(a,target)));
	}

}
