package ASSIGNMENT1;

import java.util.*;

public class StructurallyIdenticalGenericTree {

	Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		StructurallyIdenticalGenericTree m = new StructurallyIdenticalGenericTree();
		GenericTree gt1 = m.new GenericTree();
		GenericTree gt2 = m.new GenericTree();

		System.out.println(gt1.structurallyIdentical(gt2));

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

		public boolean structurallyIdentical(GenericTree other) {
			return this.structurallyIdentical(this.root, other.root);
		}

		private boolean structurallyIdentical(Node tnode, Node onode) {
			if (tnode == null && onode == null) {
				return true;
			}
			if (tnode == null || onode == null) {
				return false;
			}

			for (Node child : tnode.children) {
				for (Node child1 : onode.children) {
					return structurallyIdentical(child, child1);

				}
			}
			return true;

		}

	}

}
