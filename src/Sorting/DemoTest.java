package Sorting;

import java.util.Arrays;

public class DemoTest {

	public static void main(String[] args) {
	int arr[]= {2,1,4,6,8,0,22,22,1,0,12};
	String s="This is a ram autumation";
	s=s.toLowerCase();
	String str[]=s.split(" ");
	
	sortApha(str);

	}
	//Sorting according to alphabet
	public static void sortApha(String str[]) {
		for(int i=0;i<str.length-1;i++)
		{
			for(int j=0;j<str.length-i-1;j++)
			{
				if(str[j].compareTo(str[j+1])>0) {
					String temp=str[j];
					str[j]=str[j+1];
					str[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(str));
	}
	
	///buble sort
	public static void sortString(String []str)
	{
		for(int j=0;j<str.length-1;j++) {
		for(int i=1;i<str.length-j;i++)
		{
			if(str[i].length()<str[i-1].length())
			{
				String  temp=str[i];
				str[i]=str[i-1];
				str[i-1]=temp;
			}
		}
		}
		System.out.println(Arrays.toString(str));
	}
	
	public static int second(int arr[])
	{
		int large=Integer.MIN_VALUE;
		int sec=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(large<arr[i])
			{
				sec=large;
				large=arr[i];
			}
			else if(sec<arr[i]  &&arr[i]!=large)
			{
				sec= arr[i];
			}
		}
		return sec;
	}
	
public static int largest(int arr[])
{
	int large=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++)
	{
		if(large<arr[i])
		{
			large=arr[i];
		}
	}
	return large;
}
	public static  void  slectionSort(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			int last=arr.length-1-i;
			int index=getmaxindex(arr,0,last);
			swap(arr,index,last);
		}
	}
	private static void swap(int[] arr, int index, int last) {
		int temp=arr[index];
		arr[index]=arr[last];
		arr[last]=temp;
	}

	private static int getmaxindex(int[] arr, int start, int last) {
		
		int max=start;
		for(int i=0;i<=last;i++)
		{
			if(arr[max]<arr[i])
			{
				max=i;
			}
		}
		
		return max;
	}

	public static void sortNumber(int []arr)
	{
	
		boolean swap =false;
		for(int i=0;i<arr.length-1;i++)
		{
			
			for(int j=1; j<arr.length-i;j++)
			if(arr[j]<arr[j-1])
			{
				//swap number
				int temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
				swap=true;
			}
			if(!swap)
			{
			break;	
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
