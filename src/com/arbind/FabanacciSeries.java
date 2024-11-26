package com.arbind;

public class FabanacciSeries {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int arr[]= {10 ,5 ,10};
		System.out.println(fab(6));
		System.out.println(getSecondLargest(arr));
		
		System.out.print(a+" "+b+" ");
		for(int i=2;i<7;i++)
		{
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			
		}

	}
	
	public static int fab(int n)
	{
		if(n==0)
			return n;
		if(n==1)
			return n;
		else
			return fab(n-1)+fab(n-2);
	}
	public static  int getSecondLargest(int[] arr) {
        int first=arr[0];
        int sec=arr[0];
        boolean flag=true;
        
        for(int i = 1;i< arr.length;i++)
        {
            if(first<arr[i])
            {
                sec=first;
                first=arr[i];
                flag=false;
            }
            else if(sec<arr[i] && first !=arr[i])
            {
                sec=arr[i];
            }
        }
        if(flag)
        return -1;
        else
        return sec;
    }

}
