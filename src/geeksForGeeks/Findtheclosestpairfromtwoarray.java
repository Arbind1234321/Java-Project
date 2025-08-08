package geeksForGeeks;

import java.util.ArrayList;
import java.util.Arrays;

public class Findtheclosestpairfromtwoarray {

	public static void main(String[] args) {

	}

	public static ArrayList<Integer> printClosest(int arr[], int brr[], int n, int m, int x) {
		ArrayList<Integer> list =new ArrayList<>(Arrays.asList(-1,-1));
		int i=0;
		int j=m-1;
		int diff=Integer.MAX_VALUE;
		while(i<n && j>=0)
		{
			int sum=arr[i]+brr[j];
			if(abs(sum,x)<diff)
			{
				diff=abs(sum,x);
				list.set(0, arr[i]);
				list.set(1, brr[j]);
			}
			if(sum<x)i++;
			else j--;
		}
		return list;

	}

	public static int abs(int a, int b) {
		if(a>b)
		return a-b;
		else
			return b-a;
	}

}
