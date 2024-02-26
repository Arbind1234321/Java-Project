package set;

public class CompareDemo {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		 System.out.println("A".compareTo("D"));//-
		 System.out.println("Z".compareTo("K"));//+
		 System.out.println("A".compareTo("C"));//-
		 System.out.println("C".compareTo("A"));//+
		// System.out.println(new Integer(1).compareTo(2));//-

	}

}
