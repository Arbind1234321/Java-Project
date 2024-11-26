package stringInterview;

public class Test1 {

	public static void main(String[] args) {
		String str="arbikumar";
		//Defining new array
		int counter[]=new int[256];
		for(int i=0;i<str.length();i++)
		{
			counter[str.charAt(i)]++;
		}
		//for printing
		for(int i=0;i<256;i++)
		{
			if(counter[i]!=0)
			{
				System.out.println((char)i+"-->"+counter[i]);
			}
		}
	}

}
