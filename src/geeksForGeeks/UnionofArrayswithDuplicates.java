package geeksForGeeks;

import java.util.HashSet;

public class UnionofArrayswithDuplicates {

	public static void main(String[] args) {
		int []arr= {1, 2, 1, 1, 2};
		int []arr1= {2, 2, 1, 2, 1};
		System.out.println(findUnion(arr, arr1));

	}
	public static int findUnion(int a[], int b[]) {
        HashSet<Integer> set=new HashSet<>();
        int count=0;
        for(int x:a)
        {
        	if(set.add(x))
        	{
        		count++;
        	}
        }
        for(int y:b)
        {
        	if(set.add(y))
        	{
        		count++;
        	}
        }
        return count;
        
    }
	public static void largest(int []arr)
	{
		int large=Integer.MIN_VALUE;
	}

}
