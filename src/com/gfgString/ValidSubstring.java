package com.gfgString;

import java.util.Stack;

public class ValidSubstring {

	public static void main(String[] args) {
		String  s = "(()(";
		System.out.println(maxLen(s));

	}
	public static  int maxLen(String s) {
		
		int maxl=0;
		Stack<Integer> stack= new Stack<>();
		stack.push(-1);
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='(') {
				stack.push(i);
			}
			else {
				stack.pop();
			}
			if(stack.isEmpty())
			{
				stack.push(i);//reset new index
			}
			else {
				maxl=Math.max(maxl,i-stack.peek() );
			}
			
		}
		return maxl;
        
    }

}
