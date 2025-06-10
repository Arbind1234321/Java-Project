package com.gfgString;

public class StringsRotationsofEachOther {

	public static void main(String[] args) {
		String s1 = "abcd", s2 = "acbd";
		System.out.println(areRotations1(s1, s2));

	}
	 public static boolean areRotations(String s1, String s2) {
//		 if(s1.equals(s2)) {
//			 return false;
//		 }
		 
		// System.out.println(s1);
		 //int count=0;
		 for(int i=0;i<s1.length();i++)
		 {
			String st=s1.substring(i)+s1.substring(0,i);
			//System.out.println(st);
			if(st.equals(s2))
			{
				return true;
			}
		 }
		 
	     return false;
	        
	}
	 public static boolean areRotations1(String s1, String s2) {

		if(s1.length() !=s2.length())
		{
			return false;
		}
		if((s1+s1).indexOf(s2)==-1)
		{
			return false;
		}
		else {
			return true;
		}
	        
		// public static boolean areRotations(String s1, String s2) {
      //  return s1.length() == s2.length() && (s1 + s1).contains(s2);
  //  }
	}

}
