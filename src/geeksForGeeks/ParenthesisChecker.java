package geeksForGeeks;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class ParenthesisChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isBalanced("[()]{} "));

	}
	public static boolean isBalanced(String s) {
	  Stack<Character> stack=new Stack<>();
	  
	  for(char ch:s.toCharArray())
	  {
		  if(ch=='(' ||ch=='['||ch=='{')
		  {
			  stack.push(ch);
		  }
		  else if( ch==')'||ch=='}'||ch==']')
		  {
			  if(stack.isEmpty()) return false;
			  char top=stack.pop();
			  if(!matches(top,ch)) return false;
		  }
	  }
		return stack.isEmpty();
	}
	public static boolean matches(char open, char close) {
		
	 return (open == '(' && close == ')') ||
	               (open == '[' && close == ']') ||
	               (open == '{' && close == '}');
	}
	
	
//	public static boolean isBalanced(String s) {
//     Map<Character, Integer> map=new HashMap<>();
//        char[] ch=s.toCharArray();
//        for(char a:ch)
//        {
//          if(map.containsKey(a))
//          {
//        	  map.put(a,map.get(a) +1);
//          }
//          else
//          {
//        	  map.put(a, 1);
//          }
//        }
//        int sum=0;
//        Set<Character> set=map.keySet();
//          for(char b:set) {
//        	sum=sum+ map.get(b);
//          }
//          if(sum%2==0)
//          {
//        	  return true;
//          }
//          else
//        return false;
//    }
	

}
