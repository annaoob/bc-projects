package practice11_Infix2Postfix;

import java.util.*;

public class InfixToPostfix {
	
	public static String post = "";
	public static HashMap<Character, Integer> precedence = new HashMap<>();
	
	public String infix2postfix(String infix) {
		
		loadPrecedence();
		
		Stack<Character> stack = new Stack<Character>();
		post = "";
		boolean num = false;
		for (int j = 0; j < infix.length(); j++) {
			
			char c = infix.charAt(j);
			
			if (c >= '0' && c <= '9') {
				post += String.valueOf(c);
				num = true;
			} else if (num) {
				post += " ";
				num = false;
			}
			
			if(c == '(' || c == '{') {
				stack.push(c);
			}
		
			if (c == ')') {
				char p = ' ';
				while (stack.peek() != '(') {
					p = stack.pop();
					post += p;
				}
				
				p = stack.pop();
				
			}
		
			if (c == '}') {
				char p = ' ';
				while (stack.peek() != '{'){
					p = stack.pop();
					post += p;
					System.out.println(post);
				}
			}
			
			if (c == '+' || c == '-' || c == '*' || c == '/') {				
				while (!stack.isEmpty() && (precedence.get(stack.peek()) >= precedence.get(c))) {	
					char p = stack.pop();
					post += p;
				}
				stack.push(c);
			} 
		}
		while (!stack.isEmpty()) {	
			char p = stack.pop();
			post += p + " ";
		}
		
		return post;
		
	}
	
	public static void loadPrecedence(){
		precedence.put('(', 0);
		precedence.put('{', 0);
		precedence.put('+', 1);
		precedence.put('-', 1);
		precedence.put('*', 2);
		precedence.put('/', 2);	
	}



}