package com.arbind;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SumProblem {
//return number and its index
	public static void main(String[] args) {
		//int arr[]= {1,3,4,2,6,8};
	  //int target=10;
	 // sumBrute(arr, target);
	 // System.out.println(sumTwoPointer1(arr, target));
	  //System.out.println(sumUsingMap(arr, target));
		int arr[]= {-1,0,1,2,-1,-4};
		int target=0;
		//threeSumProblem(arr, target);
	  System.out.println(threeSumUsingPointer(arr, target));
	  

	}
public static void sumBrute(int []arr,int target)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==target)
				{
					System.out.println(i+" "+j);
					System.out.println(arr[i]+" "+arr[j]);
					break;
				}
			}
		}
	}
public static int [] sumTwoPointer(int []arr,int target)
	{
		int i=0,j=arr.length-1;
		int a[]=new int [2];
		a[0]=-1;
		a[1]=-1;
		int sum=0;
		while(i<j)
		{
			sum=arr[i]+arr[j];
			if(sum==target)
			{
				a[0]=i;
				a[1]=j;
				return a;
			}
			if(sum>target)
			{
				j--;
			}
			else {
				i++;
			}
		}
		
		return a;
	}
public static List<Integer> sumTwoPointer1(int []arr,int target)
{
	int i=0,j=arr.length-1;
	int a[]=new int [2];
	a[0]=-1;
	a[1]=-1;
	int sum=0;
	while(i<j)
	{
		sum=arr[i]+arr[j];
		if(sum==target)
		{
			
			return Arrays.asList(i,j);
		}
		if(sum>target)
		{
			j--;
		}
		else {
			i++;
		}
	}
	
	return  Arrays.asList(-1);
}

public static List<Integer> sumUsingMap(int []arr,int target)
{
	HashMap<Integer, Integer> hm=new HashMap<>();
	for(int i=0;i<arr.length;i++)
	{
		int sum=target-arr[i];
		if(hm.containsKey(sum))
		{
			//return Arrays.asList(hm.get(sum),i);
			return Arrays.asList(arr[hm.get(sum)],arr[i]);
		}
		else {
			hm.put(arr[i], i);
		}
	}
	return Arrays.asList(-1);
}

public static void threeSumProblem(int []arr,int target)
{
	int n=arr.length;
	int count=0;
	for(int i=0;i<n-2;i++)
	{
		for(int j=i+1;j<n-1;j++)
		{
			for(int k=j+1;k<n;k++)
			{
				if(target==arr[i]+arr[j]+arr[k] &&count==0)
				{
					System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
					count++;
					break;
				}
			}
		}
	}
}

public static List< List<Integer>> threeSumUsingPointer(int []arr,int target)
{
	if (arr == null || arr.length < 3) return new ArrayList<>();

    // Sort the elements
    Arrays.sort(arr);
    Set<List<Integer>> result = new HashSet<>();

    // Now fix the first element and find the other two elements
    for (int i = 0; i < arr.length - 2; i++)
    {
      // Find other two elements using Two Sum approach
      int left = i + 1;
      int right = arr.length - 1;

      while (left < right) {
        int sum = arr[i] + arr[left] + arr[right];

        if (sum == target) {

          // Add the set, and move to find other triplets
          result.add(Arrays.asList(arr[i], arr[left], arr[right]));
          left++;
          right--;
        } else if (sum < target )
          left++;
        else
          right--;
      }
    }
    return new ArrayList<>(result);
	
}
}






















