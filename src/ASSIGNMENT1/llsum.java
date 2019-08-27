package ASSIGNMENT1;

import java.util.LinkedList;
import java.util.Scanner;

public class llsum {

	public static void main(String[] args) {
		LinkedList<Integer> first = new LinkedList<>();
		LinkedList<Integer> second = new LinkedList<>();
		LinkedList<Integer> third = new LinkedList<>();
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		for (int i = 0; i < a; i++) {
			int val = scn.nextInt();
			first.addLast(val);
		}
		for (int i = 0; i < b; i++) {
			int val = scn.nextInt();
			second.addLast(val);
		}

		sum(first, second, first.size() - 1, second.size() - 1, third);
		while (!third.isEmpty()) {
			int am = first.removeFirst();
			System.out.print(am + " ");
		}

	}

	public static int sum(LinkedList<Integer> one, LinkedList<Integer> two, int k1, int k2, LinkedList<Integer> ans) {
		if (one.isEmpty() && two.isEmpty()) {
			return 0;
		}

		if (one.isEmpty() && !two.isEmpty()) {
			while (two.isEmpty()) {
				int a = two.removeLast();
				ans.addFirst(a);
			}
			return 0;
		}
		if (!one.isEmpty() && two.isEmpty()) {
			while (one.isEmpty()) {
				int a = one.removeLast();
				ans.addFirst(a);
			}
			return 0;
		}
		int carry = sum(one, two, k1 - 1, k2 - 1, ans);

		int sum = one.get(k1) + two.get(k2);
		int s = sum % 10;
		ans.addFirst(s);
		int c = sum / 10;
		return c;

	}
}
