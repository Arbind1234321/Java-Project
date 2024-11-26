package Constructor;

public class Singleton {

	public static void main(String[] args) {
		Test t1=Test.getTest();
		Test t2=Test.getTest();
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());

	}

}
