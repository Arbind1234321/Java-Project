package geeksForGeeks;

import java.util.HashMap;
import java.util.Set;

public class Morethann$KOccurrences {

	public static void main(String[] args) {
		int arr[]= {3, 1, 2, 2, 1, 2, 3, 3};
		System.out.println(countOccurence(arr, 4));

	}
	 public static int countOccurence(int[] arr, int k) {
		 int count =0;
		 int n=arr.length;
		 //System.out.println(n/k);
		 HashMap<Integer, Integer> map=new HashMap<>();
		 for(int a:arr )
		 {
			map.put(a, map.getOrDefault(a, 0)+1);
			
		 }
		 System.out.println(map);
		 
		 Set<Integer> keys=map.keySet();
		 
		 for(int key:keys)
		 {
			if(map.get(key)>n/k)
			{
				count++;
			}
		 }
		 
		 return count;
	      
	 }

}
