package geeksForGeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Valueequaltoindexvalue {

	public static void main(String[] args) {
		int arr[]= {15, 2, 45, 4 , 7};
		valueEqualToIndex(arr);

	}
	public static List<Integer>  valueEqualToIndex(int [] nums) {
        // code here
        List<Integer> list=new ArrayList<>();
        int n=nums.length;
        for(int i=1;i<=n;i++)
        {
        	if(nums[i-1]==i)
        	{
        		list.add(i);
        	}
        }
        System.out.println(list);
        return list;
    }
}
