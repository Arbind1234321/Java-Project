package geeksForGeeks;

import java.util.ArrayList;

public class SearchinginanArray {

	public static void main(String[] args) {
		  String s="gddggd";
		 
		// TODO Auto-generated method stub

	}
    public int search(int k, ArrayList<Integer> arr) {
        for(int a: arr)
        {
            if(a==k)
            {
              return arr.indexOf(Integer.valueOf(a))+1;
            }
          
        }
          return -1;
       }

  
    
}
