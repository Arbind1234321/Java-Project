package oops;

public class EncapsulateMain {

	public static void main(String[] args) {
	  StudentDataHiding s=new StudentDataHiding();
	  s.setName("Arbind");
	  s.setrollNumber(10);
	  s.setupdatBalance(2000, 123454);
	  //s.setupdatBalance(200, 12345);
	  s.display(); 

	}

}
