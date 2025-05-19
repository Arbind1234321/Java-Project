package oops;

public class StudentDemo {
	String name;
	int roll;
	public StudentDemo(String name,int roll) {
		this.name=name;
		this.roll=roll;
	}
	public String toString() {
		return name+"---"+roll;
	}
/*	public boolean equals(Object obj)
	{
	  try{
//		String name1=this.name;//first object name
//		int rollno1=this.roll;//first object roll number
//		StudentDemo s=(StudentDemo)obj;
//		//for second object roll number and name
//		String name2=s.name;
//		int rollno2=s.roll;
		  
		  //simplified version
		  StudentDemo s=(StudentDemo)obj;
		if(name.equals(name)&&roll==s.roll)//comparing both roll number and name  //equals() of String class is meant for content comparison 
		{
			return true;
		}
		else
		{
			return false;
		}
		}catch(ClassCastException  | NullPointerException |ArithmeticException| ArrayIndexOutOfBoundsException |StringIndexOutOfBoundsException e)
	  {
			return false;
	  }
//	  catch (NullPointerException e) {
//		return false;
//	}
		
	}*/
	
	public boolean  equals(Object obj)
	{
		if(obj==this)
			return true;
		if(obj instanceof StudentDemo)//comparing object 
		{
			StudentDemo s=(StudentDemo)obj;
			if(name.equals(s.name)&&roll==s.roll)
			{
				return true;
			}
			else
				return false;
		}
		else {
			return false;
		}
	}
	public void display()
	{
		System.out.println(this.name+"---"+this.roll);
	}

	public static void main(String[] args) {
		StudentDemo s1=new StudentDemo("Arbind", 101);
		StudentDemo s2=new StudentDemo("kumar", 102); 
		StudentDemo s3=new StudentDemo("Arbind", 101); 
		StudentDemo s4=s1;
		s1.display();
		
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals("Arbind"));
		System.out.println(s1.equals(null));
		
	

	}

}
