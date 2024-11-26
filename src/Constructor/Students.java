package Constructor;
//implementation of prototype 
public class Students implements Prototype {

	int age;
	private int rollNumber;
	String name;
	Students(){
		
	}
	
	public Students(int age, int rollNumber, String name) {
	
		this.age = age;
		this.rollNumber = rollNumber;
		this.name = name;
	}
	@Override
	public  Prototype clone() {
		return new Students(age,rollNumber,name);
	}
	public String toString() {
        return age+"  "+rollNumber+"  "+name;
    }
	
}
