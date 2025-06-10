package com.gfgString;

public class Nearestmultipleof10 {

	public static void main(String[] args) {
	System.out.println(roundToNearest("29"));

	}
	public static String roundToNearest(String s) {
        String st=s.substring(s.length()-2);
        System.out.println(st);
        Long n=Long.parseLong(st);
        long r=n%10;
       // System.out.println(n+(10-r));
        if(r>5)
        {
        	return s.substring(0,s.length()-2)+ Long.toString(n+(10-r));
        }
        else {
        	return s.substring(0,s.length()-2)+ Long.toString(n-r);
        }
        
    }

}
