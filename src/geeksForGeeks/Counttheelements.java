package geeksForGeeks;

import java.util.Arrays;

public class Counttheelements {
	public static void main(String[] args) {
		int n = 9;//3
		//5
		//7
		//2
				int a[] = {4 ,10 ,2 ,9, 3 ,4 ,1 ,9 ,8};
				int b[] = {7 ,3 ,9 ,2 ,10 ,10 ,3 ,4 ,4};
				int q = 3;
				int query[] = {0,1,2};
				System.out.println(Arrays.toString(countElements(a, b, n, query, q)));
	}
	
	
    public static int[] countElements(int a[], int b[], int n, int query[], int q) {
    	
    	for(int i=0;i<q;i++)
    	{
    		int num=a[query[i]];
    		int count=countNumber(num,b);
    		query[i]=count;
    	}
    	return query;
    	
    }

	public  static int countNumber(int num, int[] b) {
		int count=0;
		for(int i=0;i<b.length;i++)
		{
			if(num>=b[i])
			{
				count++;
			}
		}
		return count;
	}

}
