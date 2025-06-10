package geeksForGeeks;

import java.util.HashMap;

public class Pairwithgivensuminasortedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int countPair(int []arr,int target)
	{
		int count=0;
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int a:arr)
		{
			int key=target-a;
			if(map.containsKey(key))
			{
				 count+=map.get(key);
			}
			map.put(a, map.getOrDefault(a, 0)+1);
		}
		return count;
	}
	   int countPairs(int arr[], int target) {
	        int count=0;
	        for(int i=0;i<arr.length-1;i++)
	        {
	            for(int j=i+1;j<arr.length;j++)
	            {
	                if(arr[i]+arr[j]==target)
	                {
	                    count++;
	                }
	            }
	        }
	        return count;
	    }

}
