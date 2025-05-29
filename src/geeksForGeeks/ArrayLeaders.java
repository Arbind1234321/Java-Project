package geeksForGeeks;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeaders {

	public static void main(String[] args) {
		int[] arr = { 30, 10, 10, 5 };
		System.out.println(leaders(arr));

	}

	public static ArrayList<Integer> leaders(int arr[]) {
		  ArrayList<Integer> list = new ArrayList<>();
		  
		  int rightMax=arr[arr.length-1];
		  list.add(rightMax);
		   for(int i=arr.length-2;i>=0;i--)
		   {
			   if(rightMax<=arr[i])
			   {
				   rightMax=arr[i];
				   list.add(rightMax);
			   }
		   }
		   Collections.reverse(list);
		   
		  return list;
			
}
}
