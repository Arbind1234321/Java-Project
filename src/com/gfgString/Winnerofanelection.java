package com.gfgString;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public abstract class Winnerofanelection {

	public static void main(String[] args) {
		String arr[] = {"john","johnny","jackie","johnny","john","jackie","jamie","jamie","john","johnny","jamie","johnny","john"};
		System.out.println(Arrays.toString(winner(arr, 13)));
		//winner(arr, 13);
	}
	public static String []  winner(String arr[], int n) {
		
	        HashMap<String , Integer> map=new HashMap<>();
	        for(String s:arr)
	        {
	        	map.put(s, map.getOrDefault(s, 0)+1);
	        }
	        String winner = "";
	        int maxVotes = 0;

	        for (Map.Entry<String, Integer> entry : map.entrySet()) {
	            String name = entry.getKey();
	            int votes = entry.getValue();

	            if (votes > maxVotes || (votes == maxVotes && name.compareTo(winner) < 0)) {
	                winner = name;
	                maxVotes = votes;
	            }
	        }

	        return new String[]{winner, String.valueOf(maxVotes)};
	    }


}
