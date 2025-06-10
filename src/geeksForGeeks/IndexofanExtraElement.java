package geeksForGeeks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class IndexofanExtraElement {

	public static void main(String[] args) {
		int a[] = {3,5}, b[] = {3};
		System.out.println(findExtra(a, b));
	}

	public static int findExtra(int a[], int b[]) {

		HashSet<Integer> list = new LinkedHashSet<>();
		for (Integer x : a) {
			list.add(x);
		}
		for(Integer y:b)
		{
			list.remove(y);
		}
		 ArrayList<Integer> li=new ArrayList<>(list);
		
		return index(a,li.get(0));
	}

	public  static int index(int[] a, int ele) {
		
		int start=0;
		int end=a.length-1;
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(ele==a[mid])
			{
				return mid;
			}
			else if(ele<a[mid])
			{
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		
		return 0;
	}

}
