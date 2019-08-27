package ASSIGNMENT1;

import java.util.*;

public class noofleafnodes {

	static Scanner scn = new Scanner(System.in);
	static int count = 0;

	public static void main(String[] args) {

		noofleafnodes m = new noofleafnodes();
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
			this.countLeafNodes(this.root);
			return count;
		}

		private void countLeafNodes(Node node) {
			if (node == null) {
				return;
			}
			if (node.children.isEmpty()) {
				count = count + 1;
				return;
			}
			for (Node child : node.children) {

				countLeafNodes(child);
			}

		}
	}

}
