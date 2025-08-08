package geeksForGeeks;

import java.util.ArrayList;
import java.util.Arrays;

public class AlternativeSorting {

	public static void main(String[] args) {
		int arr[] = {1, 6, 9, 4, 3, 7, 8, 2};
		alternateSort(arr);
	}//[7, 1, 6, 2, 5, 3, 4]
	 public static ArrayList<Integer> alternateSort(int[] arr) {
		 ArrayList<Integer> list= new ArrayList<>();
		 Arrays.sort(arr);//1 2 3 4 5 6 7//7 1
		 int left=0;
		 int right=arr.length-1;
		 while(left<=right)
		 {
			 if(left !=right)
			 {
				 list.add(arr[right]);
				 list.add(arr[left]);
			 }
			 else if(left==right)
			 {
				 list.add(arr[left]);
			 }
			 left++;
			 right--;
		 }
		 
		
		 return list;

	      
	    }

}
