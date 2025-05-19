package Constructor;
//main method 
public class MainTest {

	public static void main(String[] args) {
		
	Students obj=new Students(28,40,"Arbind");
	
	Students cloneObject=(Students)obj.clone();
	System.out.println(cloneObject.toString());
	

	}

}
