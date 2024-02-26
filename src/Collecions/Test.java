package Collecions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

//	public static void main(String[] args) {
//		 // Creating arrayList list dynamically
//        List<String> list = new ArrayList<String>();
//        // List is created
// 
//        // Adding elements to the list
//        list.add("Geeks ");
//        list.add("for ");
//        list.add("Geeks ");
//        list.add("is ");
//        list.add("the ");
//        list.add("Best.");
//      System.out.println(list);
//        // Converting list to an array
////        String[] str = list.toArray(new String[0]);
//// 
////        // Iterating over elements of array
////        for (int i = 0; i < str.length; i++) {
////            String data = str[i];
//// 
////            // Printing elements of an array
////            System.out.print(data);
////        }
////	
//
//	}
	  public static void main(String[] args)
	    {
	        // Reading input from the user
	        // via BufferedReader class
	        BufferedReader in = new BufferedReader(
	            new InputStreamReader(System.in));
	        // 'in' is object created of this class
	 
	        // Creating object of Scanner class
	        Scanner sc = new Scanner(System.in);
	 
	        // Creating ArrayList to store user input
	        List<String> list = new ArrayList<String>();
	 
	        // Taking input from user
	        // adding elements to the list
	        while (sc.hasNext()) {
	            String i = sc.nextLine();
	            list.add(i);
	        }
	 
	        // Converting list to an array
	        String[] str = list.toArray(new String[0]);
	 
	        // Iteration over array
	        for (int i = 0; i < str.length; i++) {
	            String data = str[i];
	 
	            // Printing the elements
	            System.out.print(data);
	        }
	    }

}
