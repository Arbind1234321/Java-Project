package stringInterview;

import java.util.Arrays;

// W A J P to replace the character with its occurrence 
public class OccuranceOfWord {
	static  String str1;
	public static void main(String[] args) {
		String str="opentext";
		//expected out put open1ex2
		char chartoreplace='t';
		
		if(str.indexOf(chartoreplace)==-1)
		{
			System.out.println("Given character not available");
			System.exit(0);
		}
		//logic 1 to replace occurrence 
		int cnt=1;
		
		for (int i = 0; i < str.length(); i++)
		{
		  char ch=str.charAt(i);
		  if(ch==chartoreplace)//t==t
		  {
			 str= str.replaceFirst(String.valueOf(chartoreplace), String.valueOf(cnt).toString());
			//str=str.replaceFirst(String.valueOf(chartoreplace), String.valueOf(cnt).toString());  
			cnt++;
			  
		  }
		}
		System.out.println(str);
		
		//logic  2  to replace character 
		/*char arr[]=str.toCharArray();
		int cnt=1;
		for (int i = 0; i < arr.length; i++)
		{
		  if(arr[i]==chartoreplace)//o==t p==t e==t n==t t==t
		  {
			  arr[i]=String.valueOf(cnt).charAt(0);
			  cnt++;
		  }
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println(Arrays.toString(arr));
*/
	}

}
