package geeksForGeeks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Removeduplicatesinarray {

	public static void main(String[] args) {

	}

	public static ArrayList<Integer> removeDuplicate(int arr[]) {
       
        HashSet<Integer> set=new LinkedHashSet<>();
        for(int a:arr)
        {
        	set.add(a);
        }
        return new ArrayList<>(set);
	}

}
