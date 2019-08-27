package ASSIGNMENT1;

import java.util.Scanner;
import java.util.Stack;

public class prateeksirandcoding {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int tc = scn.nextInt();
		Stack s = new Stack();
		while (tc > 0) {
			int t = scn.nextInt();
			if (t == 2) {
				int tb = scn.nextInt();

				s.push(tb);

			}
			if (t == 1) {
				if(s.isEmpty())
					System.out.println("No Code" );
				
				else
				System.out.println(s.pop());

			}
			tc--;
		}

	}

}
