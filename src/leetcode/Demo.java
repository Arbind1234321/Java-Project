package leetcode;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		String str = "Online Shopping Site Grocery, Lifestyle, Books & More1. Best Offers!";
		str = str.replaceAll("[^a-zA-Z]", " ").trim();
		System.out.println(str);
        str=str.replaceAll("\\s+", "");
       
		String s[] = str.split("\\s+");
		System.out.println(Arrays.toString(s));

	}

}
