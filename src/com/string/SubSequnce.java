package com.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SubSequnce {

	public static void main(String[] args) {
		//System.out.println(subSeqRet("", "abc"))
		ArrayList<String> result =subSeqRet("", "abc");
		Collections.sort(result);
		System.out.println(result);
		Collections.sort(result, Comparator.comparingInt(String::length));
		System.out.println(result);

	}
	//print all subsequence of given string using Array list
	public static ArrayList<String> subSeqRet(String p,String up)
	{
		if(up.isEmpty()) {
		ArrayList<String > list =new ArrayList<>();
		if (!p.isEmpty()) {
            list.add(p); // Only add non-empty subsequences
        }
		return list;
		}
		char ch=up.charAt(0);
		ArrayList<String> left=  subSeqRet(p+ch,up.substring(1));
		ArrayList<String> right=  subSeqRet(p,up.substring(1));
		left.addAll(right);
		return left;
		//right.addAll(left);
		//return right;
		
	}
	//print all subsequence of given string
	public static void subSeq(String p,String up)
	{
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		char ch=up.charAt(0);
		
		subSeq(p+ch,up.substring(1));
		subSeq(p,up.substring(1));
		
	}

}
