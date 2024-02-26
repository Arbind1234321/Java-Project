package object;

public class Test1 {
	int i;
	String name;
	Test1(int i,String name)
	{
		this.i=i;
		this.name=name;
	}
	public boolean equals(Object obj)
	{
		String name1=this.name;
		int id=this.i;
		Test1 t=(Test1)obj;
		String name2=t.name;
		int id1=t.i;
		if(name1.equals(name2)&&id1==id)//this equals comes from string class
		{
		  return true;	
		}
		else
		return false;
		
	}

	public static void main(String[] args) {
		Test1 t1=new Test1(101,"arbind");
		Test1 t2=new Test1(102,"kumar");
		Test1 t3= new Test1(101,"arbind");
		Test1 t4=t1;
		System.out.println(t1.equals(t2));//false
		System.out.println(t1.equals(t3));//false
		System.out.println(t1.equals(t4));//true
		

	}

}
