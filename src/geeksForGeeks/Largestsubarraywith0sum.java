package geeksForGeeks;

import java.util.HashMap;

public class Largestsubarraywith0sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {15, -2, 2, -8, 1, 7, 10, 23};
System.out.println(maxLen(arr));
	}
	
	
	public static int maxLen(int arr[]) {
		HashMap<Integer, Integer> map=new HashMap<>();
		int maxl=0;
		int i=-1;
		int sum=0;
		map.put(sum, i);
		while(i<arr.length-1)
		{
			i++;
			sum +=arr[i];
			if(map.containsKey(sum)==false)
			{
				map.put(sum, i);
			}
			else {
				int len=i-map.get(sum);
				maxl=Math.max(maxl, len);
				
			}
		}
		
		
		
    return maxl;
        
    }

}
