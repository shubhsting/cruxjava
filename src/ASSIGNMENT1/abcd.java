package ASSIGNMENT1;

import java.util.*;

public class abcd {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		abcd m = new abcd();
		BinaryTree bt = m.new BinaryTree();
		bt.Tsum();
	}

	private class BinaryTree {
		private class Node {
			int data;
			Node left;
			Node right;
		}

		private Node root;
		private int size;

		public BinaryTree() {
			this.root = this.takeInput(null, false);
		}

		public Node takeInput(Node parent, boolean ilc) {

			int cdata = scn.nextInt();
			Node child = new Node();
			child.data = cdata;
			this.size++;

			// left
			boolean hlc = scn.nextBoolean();

			if (hlc) {
				child.left = this.takeInput(child, true);
			}

			// right
			boolean hrc = scn.nextBoolean();

			if (hrc) {
				child.right = this.takeInput(child, false);
			}

			// return
			return child;
		}

		public void Tsum() {
			int sum = scn.nextInt();
			Tsum(root, sum, 0);
		}

		public void Tsum(Node node, int sum, int temp) {
			if (node == null) {
				return;
			}
			if (temp == sum) {
				return;
			}
			if (temp > sum) {
				return;
			}
			if (temp < sum) {
				System.out.print(node.data + " ");
				Tsum(node.left, sum, temp + node.data);
				return;
			}
			if (temp < sum) {
				System.out.print(node.data + " ");
				Tsum(node.right, sum, temp + node.data);
				return;
			}
		}

	}

}
