package com.string;
//Find second occurrence character and replace with given character
public class ReplaceSecondOccurenceCharacter {

	public static void main(String[] args) {
	String str="abbc";
   //abhbc
	int count=0;
	int index=0;
	char ch[]=str.toCharArray();
	for(int i=0;i<str.length();i++)
	{
		if(ch[i]=='a')
		{
			//System.out.println(ch[i]);
			count++;
			if(count==2)
			{
				//System.out.println(str.replace(ch[i] ,'h'));
				//str=str.replace('a' ,'h');
				index=i;
				break;
			}
			
		}
		
	}
	if(count==1)
	{
		System.out.println("duplicate not found");
	}
	System.out.println(str.substring(0,index)+'h'+str.substring(index+1));
	System.out.println(index);
	}

}
