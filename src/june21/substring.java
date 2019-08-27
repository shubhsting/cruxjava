package june21;

import java.util.Scanner;

public class substring {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
	//	String str = scn.next();
		substring("abcd");
		//lotoupper(str);

	}

	public static void printchar(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}

	}

	public static void substring(String str) {
		String s = "";
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {

				s = str.substring(i, j);
				System.out.println(s);
			}

		}

	}

	public static boolean palindrome(String str) {
		String s = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			s = s + str.charAt(i);
		}

		if (s.equals(str)) {
			return true;

		} else {
			return false;
		}
	}

	public static void countpalindrome(String str) {

		String s = "";
		String s1 = "";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {

				s = str.substring(i, j);
				if (palindrome(s)) {
					count++;
				}
			}

		}
		System.out.println(count);
	}

	public static void lotoupper(String str) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			char s = str.charAt(i);
			if (Character.isUpperCase(s)) {

				sb.append(Character.toLowerCase(s));
			} else {

				sb.append(Character.toUpperCase(s));
			}

		}
		System.out.println(sb);
	}

}
