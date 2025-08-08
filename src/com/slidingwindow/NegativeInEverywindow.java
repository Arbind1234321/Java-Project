package com.slidingwindow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NegativeInEverywindow {

	public static void main(String[] args) {
		int arr[]= {-8, 2, 3, -6, 10};
		System.out.println(firstNegInt(arr, 2));

	}
	static List<Integer> firstNegInt(int arr[], int k) {
		ArrayList<Integer> list=new ArrayList<>();
		Queue<Integer> q=new LinkedList<>();
		int i=0;int j=0;
		while(j<arr.length)
		{
			if(arr[j]<0)
			{
				q.add(arr[j]);
			}
			if(j-i+1<k)
			{
				j++;
			}
			//window hit the size
			else if(j-i+1==k)
			{
				if(q.isEmpty())
				{
					list.add(0);
				}else {
					list.add(q.peek());
				}
			
			if(!q.isEmpty() && arr[i]==q.peek())
			{
				q.poll();
			}
			i++;
			j++;
		}
		}
		return list;
	}

}
