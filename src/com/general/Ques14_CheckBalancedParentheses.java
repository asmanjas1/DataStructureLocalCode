package com.general;

import java.util.HashMap;
import java.util.Stack;

public class Ques14_CheckBalancedParentheses {
	
	//https://leetcode.com/problems/valid-parentheses/submissions/
	//https://www.geeksforgeeks.org/check-for-balanced-parentheses-in-an-expression/
	public static void main(String[] args) {
		System.out.println(checkByTwoPointers("([])"));
	}
	
	static boolean checkByTwoPointers(String str) {
		HashMap<Character, Character> map = new HashMap<>();
		map.put('(', ')');
		map.put('{', '}');
		map.put('[', ']');
		int len=str.length();
		Stack<Character> stack = new Stack<>();
		for(int i=0; i<len; i++) {
			char temp = str.charAt(i);
			if(temp == '(' || temp == '{' || temp == '[') {
				stack.push(temp);
			} else {
				if(stack.isEmpty())
					return false;
				
				if(! (temp == map.get(stack.pop())))
					return false;
			}
		}
		
		if(stack.isEmpty())
			return true;
		
		return false;
	}
}
