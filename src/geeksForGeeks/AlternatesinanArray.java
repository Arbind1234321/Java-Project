package geeksForGeeks;

import java.util.ArrayList;

public class AlternatesinanArray {

	public static void main(String[] args) {
		

	}
	
	public static ArrayList<Integer> getAlternates(int arr[]) {
       
        ArrayList<Integer> list=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
        	if(i%2==0)
        	{
        		list.add(arr[i]);
        	}
        }
        return list;
    }

}
