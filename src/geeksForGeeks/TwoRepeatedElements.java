package geeksForGeeks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class TwoRepeatedElements {

	public static void main(String[] args) {
	
    int arr[]= {1, 2, 2, 1}; int n=2;
    System.out.println(Arrays.toString(twoRepeated(n, arr)));
	}
	public static  int[] twoRepeated(int n, int arr[]) {
//      HashMap< Integer, Integer> map=new LinkedHashMap<>();
//      int a[] =new int[2];
//      for(int b:arr)
//      {
//    	  map.put(b, map.getOrDefault(b, 0)+1);
//      }
//      System.out.println(map);
//      int count=0;
//      for(Integer c :map.keySet())
//      {
//    	 if(map.get(c)==2)
//    	 {
//    		 a[count++]=c;
//    	 }
//      }
//      return a;
		int count=0;
		int ans[]=new int [2];
		int digitcount[]=new int[n+1];
		for(int i=0;i<n+2;i++)
		{
			digitcount[arr[i]]++;
			if(digitcount[arr[i]]==2) {
			ans[count++]=arr[i];
				
			}
		}
		return ans;
        
    }

}
