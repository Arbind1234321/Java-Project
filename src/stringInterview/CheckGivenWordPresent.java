package stringInterview;

public class CheckGivenWordPresent {

	public static void main(String[] args) {
		String str="This is kumar";
		String arr[]=str.split(" ");
		boolean flag=true;
		for(String t:arr)
		{
		  if(t.equals("kumar"))
		  {
			  flag=false;
			  System.out.println("true");
			  break;
		  }
		}
		if(flag)
		{
			System.out.println("false");
		}
		
	
		

	}

}
