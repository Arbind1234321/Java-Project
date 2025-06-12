package geeksForGeeks;

import java.util.HashMap;

public class ZeroSumSubarrays {

	public static void main(String[] args) {
		int arr[]= {0, 0, 5, 5, 0, 0};
		System.out.println(findSubarray(arr));

	}
	public static int findSubarray(int[] arr) {
        int count=0;
        HashMap<Integer, Integer> map=new HashMap<>();
        int prifixsum=0;
    
        for(int a:arr) {
        	prifixsum +=a;
        	
        	if(prifixsum==0)
        	{
        		count++;
        	}
        	
        	if(map.containsKey(prifixsum))
        	{
        		count +=map.get(prifixsum);
        	}
        	map.put(prifixsum, map.getOrDefault(prifixsum, 0)+1);
        }
        
        
         
        return count;
        
    }

}
