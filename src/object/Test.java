package object;

public class Test extends Object {
	int i;
	String name;
	Test(int i,String name)
	{
		this.i=i;
		this.name=name;
	}
	 public int hashCode() {
		 return i;
		 
	 }
	 public String toString()
	 {
		 return name+"---"+i;
	 }

	public static void main(String[] args) {
		Test t1=new Test(10,"arbind");
		Test t2=new Test(100,"kumar");
		System.out.println(t1);
		System.out.println(t2);

	}

}
