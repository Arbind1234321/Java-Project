package geeksForGeeks;

import java.util.HashMap;

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {8, 8, 7, 7, 6, 6, 1};
		System.out.println(getSingle1(arr));
	}
	 public static  int getSingle1(int arr[]) {
	        int[] freq = new int[100001]; // Since max arr[i] = 100000

	        // Count frequency
	        for (int a : arr) {
	            freq[a]++;
	        }

	        // Find element with odd frequency
	        for (int i = 0; i < freq.length; i++) {
	            if (freq[i] % 2 == 1) {
	                return i;
	            }
	        }

	        return -1; // if no odd frequency found (shouldn't happen based on problem)
	    }
	public  static int getSingle(int arr[]) {
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int a:arr)
        {
        	map.put(a, map.getOrDefault(a, 0)+1);
        }
        for(int a:map.keySet())
        {
        	if(map.get(a)%2==1)
        	{
        		return a;
        	}
        }
        return -1;
        
    }
	

}
