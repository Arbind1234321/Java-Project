package Collecions;

import java.util.Stack;

public class DemoStack {

	public static void main(String[] args) {
	     Stack   s=new Stack();
	     System.out.println(s.capacity());
//	     s.push("Arbind");
//	     s.push("D");
//	     s.push("A");
//	     System.out.println(s);//[Arbind,D,A]
//	     //s.pop();
//	     System.out.println(s);//[Arbind,D]
//	     s.push("A");
//	    System.out.println( s.search("D"));
	    
	    for(int i=1;i<=11;i++)
	    {
	    s.push(i);	
	    }
	    System.out.println(s);
	    System.out.println(s.capacity());
	}

}
