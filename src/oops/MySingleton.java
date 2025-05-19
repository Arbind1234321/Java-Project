package oops;

public class MySingleton {
//Approach 1
	//vaiable static and  private
	private static MySingleton t=new MySingleton();
	//private constructor  for single object
	
	private MySingleton() {
		
	}
	//public factory method 
	public static MySingleton getSingleon() {
		return t;
	}
	public static void main(String[] args) {
		MySingleton s=MySingleton.getSingleon();
		MySingleton s1=MySingleton.getSingleon();
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
	}
}
