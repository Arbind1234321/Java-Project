package geeksForGeeks;

public class Replaceall0swith5 {

	public static void main(String[] args) {
  System.out.println(convertfive(1005));
	}

	public static int convertfive(int num) {
		String s=Integer.toString(num);
		s=s.replace('0', '5');
		
		return Integer.parseInt(s);

	}

}
