package Collecions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		Integer[] number= {1,2,3,4,4,3,1};
		Set<Integer> set=new HashSet<>();
		for(Integer i:number)
		{
			set.add(i);
		}
		System.out.println(set );
		List<Integer> numbersList = new LinkedList<>();
		numbersList.add(1);
		numbersList.add(2);
		numbersList.add(3);
		numbersList.add(4);
		numbersList.add(5);
		//Integer[] number1=new Integer[numbersList.size()];
		//number1=numbersList.toArray(number1);
		//System.out.println(Arrays.toString(number1));
	        Integer[] in= numbersList.toArray(new Integer[numbersList.size()]);
	        System.out.println(Arrays.toString(in));

	}

}
