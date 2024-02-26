package com.string;

public class CountWordInString {

	public static void main(String[] args) {
		String st=" WERTY ID IS NON  ";
	    char	ch[]=st.toCharArray();
		int count=0;
		for(int i=0;i<st.length()-1;i++)
		{
			//if(i==0 && st.charAt(i)!=' '  ||  st.charAt(i)!=' '&&st.charAt(i-1)!=' ')
				if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
