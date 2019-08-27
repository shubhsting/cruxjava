package ASSIGNMENT1;

import java.util.Scanner;

import lecture4june12.array;

import java.util.LinkedList;
import java.util.Queue;

public class importanceoftime {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int tc = scn.nextInt();
		Queue<Integer> q = new LinkedList<>();
		Queue<Integer> q1 = new LinkedList<>();
		for (int i = 0; i < tc; i++) {
			int m = scn.nextInt();
			q.add(m);
		}
		for (int i = 0; i < tc; i++) {
			int m = scn.nextInt();
			q1.add(m);
		}
		arrange(q, q1);
	}

	static int count = 0;

	public static void arrange(Queue<Integer> q, Queue<Integer> q1) {

		if (q.size() == 0) {
			System.out.println(count);
			return;
		}
		if (q.peek() == q1.peek()) {
			count = count + 1;
			q.remove();
			q1.remove();
			arrange(q, q1);
		} else {
			q.add(q.remove());

			count = count + 1;
			arrange(q, q1);
		}

	}
}
