package geeksForGeeks;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Facingthesun {

	public static void main(String[] args) {
		int ar[]= {2, 3, 4, 5};
		System.out.println(countBuildings(ar));

	}
	 public static int countBuildings(int[] height) {
		 int count=1;
		 int max=height[0];
		 
		
		for(int i=1;i<height.length;i++)
		{
			if(max<height[i])
			{
				count++;
				max=height[i];
			}
		}
		return count;
			
	        
	    }

}
