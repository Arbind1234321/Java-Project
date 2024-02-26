package Collecions;

import java.util.ArrayList;
import java.util.List;

public class ConvertingCollectionToArray {

	public static void main(String[] args) {
	   List<String> li=new ArrayList<String >();
	   for(int i=1;i<=10;i++)
	   {
		   li.add(""+i+"");
	   }
     System.out.println(li);
     String  [] n=li.toArray(new String  [0]);
     for(int i=n.length-1;i>=0;i--)
     {
    	 System.out.print(n[i]+" ");
     }
	}

}
