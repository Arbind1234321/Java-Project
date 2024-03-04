package stringInterview;

public class StringPalindrome {

	 static  boolean ispalindrome(String word)
	 {
		 int l=word.length();
		 word=word.toLowerCase();
		 for(int i=0;i<l;i++,l--)
		 {
			 if(word.charAt(i)!=word.charAt(l-1))
				 return false;
		 }
		 
		 return true;
	 }
	public static void main(String[] args) {
	   String str="madam1";
	  boolean b= ispalindrome(str);
	  if(b)
	  {
		  System.out.println("String is palindrome");
	  }
	  else
	  {
		  System.out.println("not palindrome");
	  }

	}

}
