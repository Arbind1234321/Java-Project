package stringInterview;

public class Graph {

	public static void main(String[] args) 
	{
	  int a=1;
	  int b=1;
	  int c=2;
	  int d=3;
	  boolean k=graph(a, b, c, d);
	  System.out.println(k);
	 

	}
	 public static boolean graph(int a,int b,int c,int d)
	  {
		 if(a>c||b>d)
		 {
			 return false;
		 }
		 if(a==c&&b==d)
		 {
			 return true;
		 }
		 
		  
		return graph(a+b,b,c,d)||graph(a,a+b,c,d);  
	  }

}
