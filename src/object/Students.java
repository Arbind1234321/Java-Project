package object;

public class Students {
    int id;
    String name;
    public Students(int id,String name)
    {
    	this.id=id;
    	this.name=name;
    }
    public  String toString() {
    	return this.name+"  "+this.id;
    }
	public static void main(String[] args) {
		Students s=new Students(101,"arbind");
		Students s1=new Students(101,"arbind");
		Students s2=new Students(101,"arbind");
		System.out.println(s);

	}

}
