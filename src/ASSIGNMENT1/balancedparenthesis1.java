package ASSIGNMENT1;

import java.util.Scanner;

import java.util.Stack;

public class balancedparenthesis1 {

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		int tc=scn.nextInt();
		while(tc>0) {
		String s = scn.next();
		parenthesis(s);
		tc--;}
	}

	public static void parenthesis(String ab) throws Exception {
		Stack s = new Stack();
		for (int i = ab.length() - 1; i >= 0; i--) {
			s.push(ab.charAt(i));

		}
		int count = 0;
		int max = 0;
		while (!s.isEmpty()) {
			char m = (char) s.pop();
			if (m == '(') {
				count = count + 1;
				max = count;
			} else if (m == ')') {
				count = count - 1;
			}
			else {
				continue;
			}
		}
		if (count == 0) {
			System.out.println(max);
		} else {
			System.out.println("-1");
		}
	}

}
