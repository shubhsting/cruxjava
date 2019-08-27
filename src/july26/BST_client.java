package july26;

import java.util.Scanner;

public class BST_client {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int[] n = new int[a];
		for (int i = 0; i < a; i++) {
			n[i] = scn.nextInt();
		}

		BST m = new BST(n);
		//m.display();
m.addNode(2);
m.addNode(1);
m.addNode(3);
//
		m.display();
//		
		
		
//		m.removeNode(80);
//		System.out.println();
//		System.out.println();
//		m.display();

	}

}
