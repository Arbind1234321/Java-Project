package geeksForGeeks;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

public class MatchDay2 {
	public static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
		int i = 0;
		int j = 0;

		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		while (j < n) {
			if(arr.length==0)
			{
				return list1;
			}
			
			list.add(arr[j]);

			if ((j - i + 1) < k) {

				j++;
			} else if ((j - i + 1) == k) {

				Collections.sort(list);

				list1.add(list.get(list.size() - 1));
				list.remove(i);
				i++;
				list.add(arr[j]);
				j++;

			}
		}

		return list1;

	}
	
	static ArrayList<Integer> max_of_subarrays1(int arr[], int n, int k) {
        // Your code here
        
        ArrayList <Integer> res = new ArrayList<>();
        ArrayDeque<Integer> dq = new ArrayDeque<>();
      
        
        int i = 0;
        
        //i first k elements 
        for(i = 0; i< k ; i++)
        {
            
            while(!dq.isEmpty() && arr[i] >= arr[dq.peekLast()])
              dq.pollLast();
            
            //adding new element at back of deque.  
            dq.add(i);
        }
        
        //iterating over the rest of the elements.
        for(i=k ; i < n; i++)
        {
            //the element at the front = largest ele of prev win.
             res.add(arr[dq.peek()]);
            
            
            //removing the elements which are out of this window.
            while(!dq.isEmpty() && (dq.peekFirst() <= i-k))
               dq.pollFirst();
            
            /// removing the indexes of ele which is not greater than the processing ele.
            while(dq.isEmpty() == false && (arr[i] >= arr[dq.peekLast()]))
                dq.pollLast();
            
            //adding the processed ele 
            dq.add(i);
        }
        
       //last wind ans.
        res.add(arr[dq.peek()]);
       
        return res;
	}
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 1, 4, 5, 2, 3, 6 ,7};
		int N = arr.length;
		int k = 4;
		System.out.println(max_of_subarrays(arr, N, k));

	}

}
