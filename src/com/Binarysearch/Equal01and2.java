package com.Binarysearch;

import java.util.HashMap;
import java.util.Map;

public class Equal01and2 {

	public static void main(String[] args) {

     
	}
	 public static long getSubstringWithEqual012(String str) {
         int count0 = 0, count1 = 0, count2 = 0;
    Map<String, Integer> map = new HashMap<>();
    map.put("0#0", 1); // Initial condition (no chars yet)

    long result = 0;

    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);

        if (ch == '0') count0++;
        else if (ch == '1') count1++;
        else if (ch == '2') count2++;

        // Create key based on difference in counts
        int diff10 = count1 - count0;
        int diff21 = count2 - count1;
        String key = diff10 + "#" + diff21;

        result += map.getOrDefault(key, 0);
        map.put(key, map.getOrDefault(key, 0) + 1);
    }

    return result;
	 }
}
