package ASSIGNMENT1;

import java.util.LinkedList;
import java.util.Scanner;

public class tripletll {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		LinkedList<Integer> one = new LinkedList<>();
		LinkedList<Integer> two = new LinkedList<>();
		LinkedList<Integer> three = new LinkedList<>();
		for (int i = 1; i <= a; i++) {
			int onea = scn.nextInt();
			one.addLast(onea);
		}
		for (int j = 1; j <= b; j++) {
			int twob = scn.nextInt();
			two.addLast(twob);
		}
		for (int k = 1; k <= c; k++) {
			int threec = scn.nextInt();
			three.addLast(threec);
		}
		int sum = scn.nextInt();
		sumtriplet(one, two, three, sum);

	}

	public static void sumtriplet(LinkedList<Integer> a, LinkedList<Integer> b, LinkedList<Integer> c, int sum) {

		for (int i = 0; i < a.size(); i++) {
			for (int j = 0; j < b.size(); j++) {
				for (int k = 0; k < c.size(); k++) {
					if (sum == (a.get(i) + b.get(j) + c.get(k))) {
						System.out.print(a.get(i) + " " + b.get(j) + " " + c.get(k));
						return;
					}
				}
			}
		}
	}

	public static void sumtriplet1(LinkedList<Integer> a, LinkedList<Integer> b, LinkedList<Integer> c, int sum,
			int tempsum, String ans) {

		if (tempsum == sum) {
			System.out.println(ans);
			return;
		}
	
		if (tempsum < sum && a.size() > 0) {
			int k = a.removeFirst();
			sumtriplet1(a, b, c, sum, tempsum + k, ans + k + " ");
			a.addFirst(k);
			return;
		}
		if (tempsum < sum && b.size() > 0) {
			int k = b.removeFirst();
			sumtriplet1(a, b, c, sum, tempsum + k, ans + k + " ");
			b.addFirst(k);
			return;
		}
		if (tempsum < sum && c.size() > 0) {
			int k = c.removeFirst();
			sumtriplet1(a, b, c, sum, tempsum + k, ans + k + " ");
			c.addFirst(k);
			return;
		}
	}
}
