package stringInterview;
//checking string is palindrome or not
public class GivenSentenceIsPalindrome {
	public static boolean isSentencePalindrome(String s) {
		String []a=s.split(" ");//
		int n=a.length;
		for(int i=0;i<a.length;i++,n--)
		{
			if(!a[i].equals(a[n-1]))
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) 
	{
	  String s = "fish dog dog fish";
	  boolean k=isSentencePalindrome(s);
     System.out.println(k);
	}

	

}
