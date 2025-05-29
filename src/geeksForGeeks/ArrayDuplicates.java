package geeksForGeeks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayDuplicates {

	public static void main(String[] args) {
		int  arr[] = {1,2,3,4,2};
		System.out.println(findDuplicates(arr));

	}
	public static List<Integer> findDuplicates(int[] arr) {
		ArrayList<Integer> list=new ArrayList<>();
		//Set<Integer> set=new HashSet<>();
		ArrayList<Integer> list1=new ArrayList<>();
		for(int a:arr)
		{
			if(list.contains(a))
			{
				list1.add(a);
			}
			else {
				
				list.add(a);
			}
		}
		
		return list1;
    }

}
