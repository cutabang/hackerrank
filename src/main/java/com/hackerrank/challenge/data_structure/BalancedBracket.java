package com.hackerrank.challenge.data_structure;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBracket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      
	      while (sc.hasNext()) {
	         String input=sc.next();
	         System.out.println(isBalanced(input));
	      }
	}
	
	static String[] braces(String[] values) {
	    String[] result = new String[values.length];

	    for (int i=0;i<values.length;i++) {
	    	result[i] = convertYesNo(isBalanced(values[i]));
	    }
	    
	    return result;
    }
	
	static String convertYesNo(boolean isBalanced) {
        return isBalanced ? "Yes" : "No";
    }
	
	public static boolean isBalanced(String parentheses) {
		Stack<Character> charStack  = new Stack<Character>();
		
        for(int i = 0; i < parentheses.length(); i++) {
            char character = parentheses.charAt(i);
            
            if(character == '[' || character == '(' || character == '{' ) {

                charStack.push(character);

            }else if(character == ']') {
                if(charStack.isEmpty()) return false;
                if(charStack.pop() != '[') return false;

            }else if(character == ')') {
                if(charStack.isEmpty()) return false;
                if(charStack.pop() != '(') return false;

            }else if(character == '}') {
                if(charStack.isEmpty()) return false;
                if(charStack.pop() != '{') return false;
            }

        }
        
        return charStack.isEmpty();
	}

}
