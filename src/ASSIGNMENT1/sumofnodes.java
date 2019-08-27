package ASSIGNMENT1;

import java.util.*;

public class sumofnodes {

	static Scanner scn = new Scanner(System.in);
	static int sum = 0;

	public static void main(String[] args) {

		sumofnodes m = new sumofnodes();
		GenericTree gt = m.new GenericTree();
		System.out.println(gt.countLeafNodes());
	}

	private class GenericTree {
		private class Node {
			int data;
			ArrayList<Node> children = new ArrayList<>();
		}

		private Node root;

		public GenericTree() {
			this.root = this.takeInput(scn, null, -1);
		}

		private Node takeInput(Scanner scn, Node parent, int i) {

			int childData = scn.nextInt();

			int numGC = scn.nextInt();

			Node child = new Node();
			child.data = childData;

			for (int j = 0; j < numGC; j++) {
				Node gc = this.takeInput(scn, child, j);
				child.children.add(gc);
			}

			return child;
		}

		public int countLeafNodes() {
			this.sumLeafNodes(this.root);
			return sum;
		}

		private void sumLeafNodes(Node node) {
//			if (node == null) {
//				return;
//			}
			sum = sum + node.data;
				
			
			
			for (Node child : node.children) {
				
				sumLeafNodes(child);
			}

		}
	}

}
