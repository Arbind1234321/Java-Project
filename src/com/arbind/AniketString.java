package com.arbind;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class AniketString {

	public static void main(String[] args) {
		String str = "abcdefgh";
		// System.out.println(sumAllNumber(str));
		// System.out.println(uniqueWords(str));
		target(str);
	}
	// 57
	public static boolean isValidPalindrome(String s)
	{
		  int i = 0;
	        int j = s.length() - 1;
	        while (i <= j) {
	            if (s.charAt(i) != s.charAt(j))
	                return false;
	            else {
	                i++;
	                j--;
	            }
	        }
	        return true;
	
	}
	//55 WAJP to exchange a given input with target input( fg with cd).
	//Input: abcdefgh
	//Output: abfgecdh
	public static void target(String input)
	{
		String str1 = "fg";
        String str2 = "cd";

        // Swap logic
        if (input.contains(str1) && input.contains(str2)) {
            input = input.replace(str1, "TEMP");
            input = input.replace(str2, str1);
            input = input.replace("TEMP", str2);
        }

        System.out.println("Output: " + input);
	}

	//54 WAJP to convert the first character of each sentence to upper case and all the other character of string into lower case.
    public static void upperCaseLowerCase(String str)
    {
    	String s[]=str.split("\\.");
    	for(int i=0;i<s.length;i++) {
    		String word=s[i].trim();
    		System.out.println(word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase());
    	}
    }


	// 52 WAJP to perform sorting for a group of Strings.
	public static void sortGroup(String str) {

		String ss[] = str.split(" ");
		Arrays.sort(ss);
		System.out.println(Arrays.toString(ss));
		for (int i = 0; i < ss.length; i++) {

			for (int j = 1; j < ss.length - i; j++) {
				if (ss[j].length() < ss[j - 1].length()) {
					String temp = ss[j - 1];
					ss[j - 1] = ss[j];
					ss[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(ss));
	}

	// 51 WAJP to remove duplicate words from the String.
	public static void uniqueWords(String str) {
		String s[] = str.split(" ");
		Set<String> set = new LinkedHashSet<>();
		for (int i = 0; i < s.length; i++) {
			set.add(s[i]);
		}
		System.out.println(set);

	}

	// 50 WAJP to count the occurrence of a particular word in the String.
	public static int particularWords(String str) {
		String s[] = str.split(" ");
		int count = 0;
		for (String a : s) {
			if (a.equals("is"))
				count++;
		}
		return count;
	}

	// 49 WAJP to print the word which has appeared for maximum times in the String.
	public static String wordMaxTimes(String str) {
		String s[] = str.split(" ");
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length; i++) {
			String word = s[i];
			map.put(word, map.getOrDefault(word, 0) + 1);
		}
		String st = "";
		int max = 0;
		for (String b : map.keySet()) {
			if (max < map.get(b)) {
				max = map.get(b);
				st = b;
			}
		}
		return st;
	}

	// 47 48 WAJP to print and count all the words which has appeared only once in
	// the String.
	public static void hasOnlyOne(String str) {
		String s[] = str.split(" ");
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length; i++) {
			String word = s[i];
			map.put(word, map.getOrDefault(word, 0) + 1);
		}
		int count = 0;
		for (String b : map.keySet()) {
			if (map.get(b) > 1)// 48
			// if(map.get(b)==1)//47
			{
				System.out.print(b + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println(count);
	}

	// 46 WAJP to print the first character of each word in the String.
	public static void firstCharacter(String str) {
		String s[] = str.split(" ");

		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i].substring(0, 1));
		}

	}

	// 45 WAJP to print the frequency of each words in a string.
	public static void wordFrequency(String str) {
		String s[] = str.split(" ");
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length; i++) {
			String word = s[i];
			map.put(word, map.getOrDefault(word, 0) + 1);
		}
		System.out.println(map);
	}

	// 44
	// https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/description/
	public static boolean areOccurrencesEqual(String s) {
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			map.put(c, map.getOrDefault(c, 0) + 1);

		}
		int a = 0;
		for (Character c : map.keySet()) {
			a = map.get(c);
		}
		int count = 0;
		for (Character c : map.keySet()) {
			if (map.get(c) == a) {
				count++;
			}
		}
		return count == map.size();
	}

	// 43 https://leetcode.com/problems/sort-characters-by-frequency/description/
	public static String frequencySort1(String s) {
		// Step 1: Count frequency of each character
		Map<Character, Integer> freqMap = new HashMap<>();
		for (char c : s.toCharArray()) {
			freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
		}

		// Step 2: Use a max heap (priority queue) to sort characters by frequency
		PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>(
				(a, b) -> b.getValue() - a.getValue());

		maxHeap.addAll(freqMap.entrySet());

		// Step 3: Build the result
		StringBuilder sb = new StringBuilder();
		while (!maxHeap.isEmpty()) {
			Map.Entry<Character, Integer> entry = maxHeap.poll();
			char ch = entry.getKey();
			int freq = entry.getValue();

			for (int i = 0; i < freq; i++) {
				sb.append(ch);
			}
		}

		return sb.toString();
	}

	public static String frequencySort(String s) {
		Map<Character, Integer> map = new LinkedHashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		int arr[] = new int[map.size()];
		int index = 0;
		for (Character c : map.keySet()) {
			arr[index++] = map.get(c);
		}
		// Step 2: Convert map to a list of entries and sort by value (frequency)
		List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
		list.sort((a, b) -> b.getValue() - a.getValue()); // descending frequency

		// Step 3: Build the result string
		StringBuilder result = new StringBuilder();
		for (Map.Entry<Character, Integer> entry : list) {
			char ch = entry.getKey();
			int freq = entry.getValue();
			for (int i = 0; i < freq; i++) {
				result.append(ch);
			}
		}

		return result.toString();

	}

	// 42 WAJP to take a String input and convert all the lowercase characters to
	// uppercase.
	public static void allLowerCase(String str) {
		System.out.println(str.toLowerCase());
	}

	// 41  53 WAJP to convert the first character of each sentence of a String into
	// upper case.
	public static void firstUpperCaseInSentence1(String str) {
		String[] sentences = str.split("\\.");

		for (int i = 0; i < sentences.length; i++) {
			String sentence = sentences[i].trim(); // remove leading/trailing spaces

			if (!sentence.isEmpty()) {
				// Capitalize first letter + rest of the sentence
				String capitalized = sentence.substring(0, 1).toUpperCase() + sentence.substring(1);
				System.out.print(capitalized + ". ");
			}
		}
	}

	public static void firstUpperCaseInSentence(String str) {
		String s[] = str.split("\\.");
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i].substring(0, 1).toUpperCase() + s[i].substring(1) + " ");
		}
	}

	// 40 WAJP to convert the first character of each word of a String into upper
	// case.
	public static void firstUpperCase(String str) {
		String s[] = str.split(" ");
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i].substring(0, 1).toUpperCase() + s[i].substring(1) + " ");
		}
	}

	// 39 WAJP take a String input and print the largest word in the String.
	public static void largestWord(String str) {
		String s[] = str.split(" ");
		int max = 0;
		String st = "";
		for (int i = 0; i < s.length; i++) {
			if (max < s[i].length()) {
				max = s[i].length();
				st = s[i];
			}
		}
		System.out.println(st);
	}

	// 37 38 WAJP take a String input and print and count all the words which has
	// even number of characters.
	public static void printEvenCount(String str) {
		String s[] = str.split(" ");
		System.out.println(s.length);
		for (int i = 0; i < s.length; i++) {
			// if(s[i].length()%2==0)//37
			if (s[i].length() % 2 == 1) {
				System.out.print(s[i] + " ");
			}
		}

	}

	// 36 WAJP to get sum of all numbers available in the String:
	// i/p: ab45cde20xyz5pq40dd.
	// o/p: 110 (45+20+5+40)
	public static int sumAllNumber(String str) {
		int sum = 0;
		String st = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isDigit(c)) {
				st = st + c;
			} else {
				if (!st.equals("")) {
					sum = sum + Integer.parseInt(st);
					st = "";
				}
			}
		}
		// Check if there is a number left at the end
		if (!st.equals("")) {
			sum += Integer.parseInt(st);
		}

		return sum;
	}

	// 35 WAJP for below requirements:
	// i/p: mohan and sohan are here.
	// o/p: nahom dna nahos era ereh.
	public static void reverseWords(String str) {
		String s[] = str.split(" ");
		for (int i = 0; i < s.length; i++) {
			String st = "";
			for (int j = s[i].length() - 1; j >= 0; j--) {
				st = st + s[i].charAt(j);
			}
			System.out.print(st + " ");
		}
	}

	// 34 WAJP for below requirements:
	// i/p: mohan and sohan are here.
	// o/p: here are sohan and mohan
	public static void reverseSentanc(String str) {
		String s[] = str.split(" ");
		for (int i = s.length - 1; i >= 0; i--) {
			System.out.print(s[i] + " ");
		}
	}

	// 33 Write a java program to check whether the given number is a fascinating
	// number or not.
	public static boolean isFascinating(int n) {
		String s = "";
		for (int i = 1; i <= 3; i++) {
			int t = n * i;
			s = s + t + "";

		}
		if (s.length() > 9)
			return false;
		// System.out.println(s);
		// System.out.println(s.length());
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c > '0' && c <= '9') {
				set.add(c);
			} else {
				return false;
			}
		}
		// System.out.println(set);
		if (set.size() == 9)
			return true;
		else
			return false;

	}
	// 32 WAJP to find weather a string is PANAGRAM or not?

	public static boolean isPangram(String sentence) {
		// Create a boolean array to track each alphabet letter
		boolean[] alphabet = new boolean[26];

		// Convert sentence to lowercase
		sentence = sentence.toLowerCase();

		for (int i = 0; i < sentence.length(); i++) {
			char ch = sentence.charAt(i);

			// Check if it's a letter
			if (ch >= 'a' && ch <= 'z') {
				alphabet[ch - 'a'] = true;
			}
		}

		// Check if all letters are present
		for (boolean letterSeen : alphabet) {
			if (!letterSeen) {
				return false;
			}
		}

		return true;
	}

	public static boolean isPanagram(String str) {
		// int arr[]=new int[26];
		String st = str.toLowerCase();
		st = st.replaceAll(" ", "");
		System.out.println(st);

		int a[] = new int[256];
		for (int i = 0; i < st.length(); i++) {
			a[st.charAt(i)]++;
		}
		int count = 0;
		for (int i = 0; i < 256; i++) {
			if (a[i] > 0)
				count++;
		}
		return count == 26;

	}

	// 31 WAJP to find weather a string is ANAGRAM or not?
	public static boolean isAnagram1(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		char c[] = s.toCharArray();
		char ch[] = t.toCharArray();
		Arrays.sort(c);
		Arrays.sort(ch);
		if (Arrays.equals(ch, c))
			return true;
		else
			return false;

	}

	public static boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		} else {
			int count[] = new int[26];
			int m = s.length();
			int n = t.length();
			for (int i = 0; i < m; i++) {
				count[s.charAt(i) - 'a']++;
			}
			for (int i = 0; i < n; i++) {
				count[t.charAt(i) - 'a']--;
			}
			for (int i = 0; i < count.length; i++) {
				if (count[i] != 0) {
					return false;
				}
			}
			return true;

		}
	}

	// 30 given a string of Size N containing digits from 1 to N where any one digit
	// is missing.
	// Print the missing digit.
	public static int missingNumber(String str) {

		// char means asiic value
		int sum = 0;
		int n = str.length() + 1;
		int totalsum = n * (n + 1) / 2;
		for (int i = 0; i < str.length(); i++) {
			String st = "";
			if (Character.isDigit(str.charAt(i))) {
				st = str.charAt(i) + "";
				sum = sum + Integer.parseInt(st);
			}
		}
		return totalsum - sum;

	}

	// 29 Design a method which will return the index of first non-repeating
	// character of the String. Return -1 if no such character is found
	public static int firstUniqChar(String str) {
		int[] freq = new int[26];
		char[] ch = str.toCharArray();
		for (char c : ch) {
			freq[c - 'a']++;
		}
		for (int i = 0; i < ch.length; i++) {
			if (freq[ch[i] - 'a'] == 1) {
				return i;
			}
		}

		return -1;
	}
	// 28WAJP to print the character which is appeared for the maximum times in the
	// String.
	// If more than 1 character has appeared for maximum time, return the biggest
	// character.

	public static void biggestMax(String str) {
		char s[] = str.toCharArray();
		Arrays.sort(s);
		// System.out.println(Arrays.toString(s));
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < s.length; i++) {

			map.put(s[i], map.getOrDefault(s[i], 0) + 1);
		}
		int a[] = new int[map.size()];
		int index = 0;
		for (Character c : map.keySet()) {
			a[index++] = map.get(c);
		}
		int max = 0;
		for (int b : a) {
			if (max < b) {
				max = b;
			}
		}
		String st = "";
		for (Character c : map.keySet()) {
			if (map.get(c) == max) {
				st = c + "";

			}
		}
		System.out.println(st);

	}

	// 27 WAJP to print the character which is appeared for the maximum times in the
	// String.
	// If more than 1 character has appeared for maximum time, return the smallest
	// character.
	public static void smallerMax(String str) {
		char s[] = str.toCharArray();
		Arrays.sort(s);
		// System.out.println(Arrays.toString(s));
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < s.length; i++) {

			map.put(s[i], map.getOrDefault(s[i], 0) + 1);
		}
		int a[] = new int[map.size()];
		int index = 0;
		for (Character c : map.keySet()) {
			a[index++] = map.get(c);
		}
		int max = 0;
		for (int b : a) {
			if (max < b) {
				max = b;
			}
		}
		for (Character c : map.keySet()) {
			if (map.get(c) == max) {
				System.out.println(c);
				break;
			}
		}

	}

	// 26 WAJP to print the character which is appeared for the maximum times in the
	// String.
	public static void maxTime(String str) {
		int a[] = new int[256];
		for (int i = 0; i < str.length(); i++) {
			a[str.charAt(i)]++;
		}
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 256; i++) {

			if (a[i] != 0)// 24
				list.add(a[i]);
		}
		int max = 0;
		for (int b : list) {
			if (max < b)
				max = b;

		}
		for (int i = 0; i < 256; i++) {

			if (a[i] == max)// 24
				System.out.println((char) i);
		}
		System.out.println(list);
	}

	public static void maxTimes(String str) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			map.put(c, map.getOrDefault(c, 0) + 1);

		}
		int arr[] = new int[map.size()];
		int index = 0;
		for (Character c : map.keySet()) {
			arr[index++] = map.get(c);
		}
		Arrays.sort(arr);
		for (Character a : map.keySet()) {
			if (map.get(a) == arr[arr.length - 1]) {
				System.out.println(a);
			}
		}
		System.out.println(map);
	}

	// 22 23 24 25 WAJP to print the frequency of each character of the String.
	public static void frequencyCount1(String str) {
		int a[] = new int[256];
		for (int i = 0; i < str.length(); i++) {
			a[str.charAt(i)]++;
		}
		for (int i = 0; i < 256; i++) {
			// if(a[i]!=0)//22
			// if(a[i]==1)//23
			if (a[i] > 1)// 24
				System.out.println((char) i + " --" + a[i]);
		}
	}

	public static void frequencyCount(String str) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		System.out.println(map);
	}

	// 19 Write a java program to print the biggest numeric character from the given
	// string.
	public static int secondHighest(String s) {
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isDigit(c)) {
				set.add(c - '0');
			}
		}
		int a[] = new int[set.size()];
		int index = 0;
		for (int b : set) {
			a[index++] = b;
		}
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		if (a.length < 2)
			return -1;

		return a[a.length - 2];

	}

	// Return -1 if there is no numeric characters.
	public static int largestNumeric(String str) {
		int max = -1;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isDigit(c)) {
				if (max < (int) c) {
					max = Integer.parseInt(c + "");
				}
			}
		}
		return max;
	}

	// 18 WAJP to take a String input and count total number of words in the
	// String(Without using split method)
	public static int countWords1(String str) {
		int count = 0;
		boolean inWord = false;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			// If current char is not space and we are not in a word, we found a word
			if (ch != ' ' && !inWord) {
				count++;
				inWord = true;
			}
			// If current char is space, we are not in a word anymore
			else if (ch == ' ') {
				inWord = false;
			}
		}
		return count;
	}

	public static int countWords(String str) {
		int count = 1;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
				count++;
			}
		}
		return count;
	}

	// 17WAJP to take a String input and remove all the duplicate characters.
	// i/p: abcaxbdacdptx
	// o/p: abcxdpt
	public static String removeDuplicates1(String input) {
		// StringBuilder result = new StringBuilder();
		String result = "";
		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i);
			boolean found = false;

			// Check manually if currentChar is already in result
			for (int j = 0; j < result.length(); j++) {
				if (result.charAt(j) == currentChar) {
					found = true;
					break;
				}
			}

			if (!found) {
				// result.append(currentChar);
				result = result + currentChar;
			}
		}

		return result.toString();
	}

	public static String removeDuplicates(String input) {
		// StringBuilder result = new StringBuilder();
		String result = "";
		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i);

			// Check if currentChar is already in result
			// if (result.indexOf(String.valueOf(currentChar)) == -1)
			if (result.indexOf(currentChar) == -1) {
				// result.append(currentChar);
				result = result + currentChar;
			}
		}

		return result.toString();
	}

	public static String removeDuplicate(String str) {
		Set<Character> set = new LinkedHashSet<>();
		for (char c : str.toCharArray()) {
			set.add(c);
		}
		String st = "";
		for (char a : set) {
			st = st + a;
		}
		return st;
	}

	// 17
	// https://leetcode.com/problems/find-first-palindromic-string-in-the-array/description/
	public static String firstPalindrome(String[] words) {

		for (int i = 0; i < words.length; i++) {
			if (isPalindrome1(words[i])) {
				return words[i];
			}
		}
		return "";
	}

	// 14 WAJP to take a String input and check whether the String is a Palindrome
	// String or not(with reversing).
	public static boolean isPalindrome1(String str) {

		for (int i = 0; i < str.length() - i; i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	public static boolean isPalindrome(String str) {
		String st = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			st = st + str.charAt(i);
		}
		return st.equals(str);
	}

	// 13 Design a method which will accept a String input and return the reverse of
	// the String.
	public static void reverse(String str) {
		String st = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			st = st + str.charAt(i);
		}
		System.out.println(st);
	}

	// 12 WAJP to take a String input and print sum of all the even numeric
	// characters in the String.
	public static int sumEvenNumeric(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isDigit(c)) {
				// if(Integer.parseInt(c+"")%2==0)
				if ((int) c % 2 == 0)
					sum = sum + Integer.parseInt(c + "");
			}
		}
		return sum;
	}

	// 11 WAJP to take a String input and print the sum of all the numeric
	// characters in the String
	public static int sumNumeric(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isDigit(c)) {

				sum = sum + Integer.parseInt(c + "");
			}
		}
		return sum;
	}

	// 10. WAJP to check if a string contains only digits.
	public static boolean onlyDigit(String str) {
		int n = str.length();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c >= '0' && c <= '9') {
				count++;
			}
		}
		return n == count;
	}

	// 9 WAJP to take a String input and replace all the space characters from _ in
	// the String.
//	a)By using replace() method
//	b)Without using replace() method
	public static void removeSpace(String str) {
//		str=str.replaceAll(" ", "_");
//		System.out.println(str);
		String st = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isSpaceChar(c)) {
				st = st + "_";
			} else {
				st = st + c;
			}
		}
		System.out.println(st);

	}
// 8 WAJP to take a String input and print all the indexes where space characters are present in the String.

	public static void spaceIndex(String str) {
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isSpaceChar(c)) {
				System.out.println(i);
			}
		}
	}

// 7 WAJP to take a String input and print all the indexes where numeric characters are present in the String.
	public static void numericIndex(String str) {
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isDigit(c)) {
				System.out.println(i);
			}
		}
	}

	// 6 WAJP to take a String input and count all the vowel characters in the
	// String.
	public static int countVovel(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == 'A' || c == 'a' || c == 'e' || c == 'E' || c == 'I' || c == 'i' || c == 'O' || c == 'o' || c == 'U'
					|| c == 'u') {
				count++;
			}
		}
		return count;

	}

	// 4 WAJP to take a String input and count all the characters(excluding any
	// special characters).
	public static int countCharacter(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9') {
				count++;
			}
		}
		return count;
	}

//3WAJP to take a String input and count all the characters without spaces in the String.
	public static int countAllCharacter(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c != ' ') {
				count++;
			}
		}
		return count;
	}

//2.WAJP to take a String input and count all numeric characters in the String.
	public static int countNumeric(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			// if(c>='0' &&c<'9')
			if (Character.isDigit(c)) {
				count++;
			}
		}
		return count;
	}

//1 WAJP to take a String input get length of String without using length() method in at least four different ways.
	public static int stringLength(String str) {// By using Array list
		char[] c = str.toCharArray();
		// return c.length;
		int count = 0;
		for (char a : c) {
			count++;
		}
		return count;
	}

}
