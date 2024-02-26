package stringInterview;

import java.util.Arrays;

//// W A J P to replace the character with its occurrence 
public class Demo {

	public static void main(String[] args) {
		 String str="opentext";
		 int l=str.length();
		 char re='h';
		 int cnt=1;
		 if(str.indexOf(re)==-1)
		 {
			 System.out.println("Given character not exist in given String");
			 System.exit(0);
		 }
		 for (int i = 0; i <l; i++) 
		 {
			char ch=str.charAt(i);
			if(ch==re)
			{
				//str=str.replaceFirst(String.valueOf(re), String.valueOf(cnt).toString());  
				//cnt++;
				str=str.replaceFirst(String.valueOf(re),String.valueOf(cnt).toString());
				//replaceFirst(String.valueOf(re)/first  character/,String.valueOf(cnt).toString()//second character);
				cnt++;
			}
		 }
		 System.out.println(str);
		/* char [] arr=str.toCharArray();
		 int cnt=1;
		 for (int i = 0; i < arr.length; i++) 
		 {
		    if(arr[i]==re)//o==t p==t e==t t==t
		    {
		    	arr[i]=String.valueOf(cnt).charAt(0);
		    	cnt++;
		    }
		 }
		 System.out.println(Arrays.toString(arr));
		 */
	}

}
