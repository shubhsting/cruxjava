package ASSIGNMENT1;

import java.util.Scanner;

import java.util.Stack;

public class balancedparenthesis {

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		parenthesis(s);
	}

	public static void parenthesis(String ab) throws Exception {
		Stack s = new Stack();
		char c = 0;

		for (int i = 0; i < ab.length(); i++) {
			if (s.isEmpty()) {
				s.push(ab.charAt(i));
				continue;
			}

			c = ab.charAt(i);

			if (c == '(' && s.peek().equals('(')) {
				s.push(c);
			} else if (c == '(' && s.peek().equals(')')) {
				s.push(c);
			} else if (c == ')' && s.peek().equals('(')) {
				s.pop();
			} else if (c == ')' && s.peek().equals(')')) {
				s.push(c);
			}
		}
		if (s.isEmpty()) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}
