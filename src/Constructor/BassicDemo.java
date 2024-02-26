package Constructor;

public class BassicDemo {
	
	 int id;
	 String name;
	 int a=1;

	public BassicDemo(int id, String name) {
		
		this.id = id;
		this.name = name;
		System.out.println(a++);
	}


	public static void main(String[] args) {
		BassicDemo d=new BassicDemo(101, "arbid");
		BassicDemo d1=new BassicDemo(102, "Kumar");
		System.out.println(d.id+"----> "+d.name);
		System.out.println(d1.id+"----> "+d1.name);
		

	}

}
