package stringInterview;
//Finding count of  each character in given String 
import java.util.Scanner;

public class OccuranceOfEachCharacterWithotMap {

	public static void main(String[] args) {
	   int counter[]=new int[256];
	   Scanner sc=new Scanner(System.in);
	  System.out.println("Enter String:");
	   String str=sc.nextLine();
	   int len=str.length();
	   //count each character
	   for(int i=0;i<len;i++)
	   {
		  counter[(int)str.charAt(i)]++; 
	   }
	   //for printing
	   for(int  i=0;i<256;i++)
	   {
		   if(counter[i]>0)
		   {
			   System.out.println((char)i+"--->"+counter[i]);
		   }
	   }

	}

}
