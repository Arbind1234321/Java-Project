package com.gfgString;

import java.util.ArrayList;
import java.util.Stack;

public class PrintBracketNumber {

	public static void main(String[] args) {
		

	}
	public static ArrayList<Integer> bracketNumbers(String str) {
        ArrayList<Integer> list=new ArrayList<>();
        Stack<Integer> stk=new Stack<>();
        int count=0;
        for(int i=0;i<str.length();i++)
        {
        	if(str.charAt(i)=='(')
        	{
        		count++;
        		list.add(count);
        		stk.push(count);
        	}
        	else if(str.charAt(i)==')')
        	{
        		list.add(stk.peek());
        		stk.pop();
        	}
        }
        return list;
        
    }

}
