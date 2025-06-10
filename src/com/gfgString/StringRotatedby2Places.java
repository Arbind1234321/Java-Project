package com.gfgString;

public class StringRotatedby2Places {
	public static void main(String[] args) {
		//String s1 = "amazon", s2 = "azonam";
		//String  s1 = "geeksforgeeks", s2 = "geeksgeeksfor";
		String  s1="daxjheq",s2="eqdaxjh";
		System.out.println(isRotated(s1, s2));
	}

	public static boolean isRotated(String s1, String s2) {
		if (s1.length() != s2.length() || s1.length() < 2) {
            return false;
        }

        // Left rotation by 2: move first 2 chars to end
        String leftRotation = s1.substring(2) + s1.substring(0, 2);

        // Right rotation by 2: move last 2 chars to front
        String rightRotation = s1.substring(s1.length() - 2) + s1.substring(0, s1.length() - 2);
        return s2.equals(leftRotation) || s2.equals(rightRotation);
        
        
//        for (int i = 0; i < 3; i++) {
//			String st = s1.substring(i) + s1.substring(0, i);
//			if (st.equals(s2)) {
//				return true;
//			}
//		}
//		return false;

	}

}
