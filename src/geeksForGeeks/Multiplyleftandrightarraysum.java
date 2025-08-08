package geeksForGeeks;

import java.util.Arrays;

public class Multiplyleftandrightarraysum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[]= {1,2,3};
     System.out.println(multiply(arr));
	}

	public static  int multiply(int[] arr) {
		int m=arr.length;
		if(m%2==0)//even
		{
			
			int a[]=new int[m/2];
			int b[]= new int[m/2];
			int index=0;
			for(int i=0;i<m;i++)
			{
				if(i<m/2)
				{
					a[i]=arr[i];
				}
				else {
					b[index++]=arr[i];
					//System.out.println(arr[i]);
				}
			}
			//System.out.println(Arrays.toString(a));
			//System.out.println(Arrays.toString(b));
			int sum=0,sum1=0;
			for(int c:a)
			{
				sum+=c;
			}
			for(int c:b)
			{
				sum1+=c;
			}
			return sum*sum1;
		}else {
			int a[]=new int[m/2];
			int b[]= new int[m/2+1];
			int index=0;
			for(int i=0;i<m;i++)
			{
				if(i<m/2)
				{
					a[i]=arr[i];
				}
				else {
					b[index++]=arr[i];
				}
			}
			int sum=0,sum1=0;
			for(int c:a)
			{
				sum+=c;
			}
			for(int c:b)
			{
				sum1+=c;
			}
			return sum*sum1;
			
		}

	}

}
