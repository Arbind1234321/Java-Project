package stringInterview;
//removing white space from String 
public class RemoveSpace {

	public static void main(String[] args) {
		String str=" Arbind kumar selenium ";
		System.out.println("Before Removing space :"+str);
		str=str.replaceAll("\\s", "");
		System.out.println("After removing spaces : "+str);
	}

}
