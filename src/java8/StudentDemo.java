package java8;

public class StudentDemo {

	String name;
	int rollno;
	String section;
	
	public StudentDemo(String name,int rollno, String section)
	{
		this.name=name;
		this.rollno=rollno;
		this.section=section;	
	}
	
	public static void main(String[] args) {
		StudentDemo d=new StudentDemo("Arbind", 101, "A"); 
		
	}
	

}
