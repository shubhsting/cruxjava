package july26;

import java.util.Scanner;

public class BST {

	Scanner scn = new Scanner(System.in);

	private class Node {
		int data;
		Node left;
		Node right;

	}

	private Node root;

	public BST(int[] in) {
		root = construct(in, 0, in.length - 1);
	}

	private Node construct(int[] in, int lo, int hi) {
		if (lo > hi) {
			return null;
		}

		int mid = (lo + hi) / 2;
		Node newnode = new Node();
		newnode.data = in[mid];
		newnode.left = construct(in, lo, mid - 1);
		newnode.right = construct(in, mid + 1, hi);
		return newnode;
	}

	public void display() {
		display(root);
	}

	private void display(Node node) {
		if (node == null) {
			return;
		}
		String str = "";
		if ((node.left == null)) {
			str += ".";

		} else {
			str += node.left.data;

		}

		str += "-->" + node.data + "<--";

		if (node.right == null) {
			str += ".";

		} else {
			str += node.right.data;

		}
		System.out.println(str);
		display(node.left);
		display(node.right);

	}

	public int size() {
		return size(root);
	}

	private int size(Node node) {
		if (node == null) {
			return 0;
		}
		int lf = size(node.left);
		int rf = size(node.right);
		return rf + lf + 1;
	}

	public int max() {
		return max(root);
	}

	// O(n)
	private int max(Node node) {
		if (node.right == null) {
			return node.data;
		}

		int rm = max(node.right);

		return rm;
	}

	public boolean find(int item) {
		return find(root, item);
	}

	// O(n)
	private boolean find(Node node, int item) {

		if (node == null) {
			return false;
		}

		if (item > node.data) {
			return find(node.right, item);
		} else if (item < node.data) {
			return find(node.left, item);
		} else {
			return true;
		}
	}

	public int ht() {
		return ht(root);
	}

	// O(n)
	private int ht(Node node) {
		if (node == null) {
			return -1;
		}
		int htl = ht(node.left);
		int rtl = ht(node.right);
		return Math.max(htl, rtl) + 1;
	}

	public void printInRange(int start, int end) {
		printInRange(root, start, end);
	}

	private void printInRange(Node node, int start, int end) {
		if (node == null) {
			return;
		}

		if (node.data >= start && node.data <= end) {
			printInRange(node.left, start, end);
			System.out.print(node.data + " ");
			printInRange(node.right, start, end);

		}
		if (node.data < start) {
			printInRange(node.right, start, end);
		}
		if (node.data > end) {
			printInRange(node.left, start, end);
		}

		// System.out.print(node.data + " ");

	}

	public void replacewithSumLarger() {
		replacewithSumLarger(root);
	}

	int maxsum = 0;

	private void replacewithSumLarger(Node node) {
		if (node == null) {
			return;
		}
		replacewithSumLarger(node.right);
		int temp = node.data;
		node.data = maxsum;
		maxsum = maxsum + temp;
		replacewithSumLarger(node.left);

	}

	public void addNode(int item) {
		addNode(root, item);
	}

	private void addNode(Node node, int item) {

		if (node == null) {
			return;
		}

		if (item > node.data) {
			addNode(node.right, item);
		}
		if (item <= node.data) {
			addNode(node.left, item);
		}
		
		
		if (item > node.data && node.right == null) {
			Node m = new Node();
			m.data = item;
//			m.right = null;
//			m.left = null;
			node.right = m;
		}
		if (item <= node.data && node.left == null) {
			Node m = new Node();
			m.data = item;
//			m.right = null;
//			m.left = null;
			node.left = m;
		}
		
		
	}

	public void addNode2(int item) {
		root = addNode2(root, item);
	}

	private Node addNode2(Node node, int item) {

		if (node == null) {
			Node m = new Node();
			m.data = item;
			return m;
		}
		if (item <= node.data) {
			node.left = addNode2(node.left, item);
		} else {
			node.right = addNode2(node.right, item);
		}
		return node;
	}

	public void removeNode(int item) {
		if (root.data == item) {
			if (root.left == null) {
				root = root.right;
			} else if (root.right == null) {
				root = root.left;
			} else {
				removeNode(root, null, item);
			}

		} else {
			removeNode(root, null, item);
		}

	}

	private void removeNode(Node node, Node parent, int item) {

		if (node == null) {
			return;
		}

		if (item > node.data) {
			removeNode(node.right, node, item);
		} else if (item < node.data) {
			removeNode(node.left, node, item);
		} else {
			if (node.left == null && node.right == null) {
				if (item > parent.data)
					parent.right = null;
				else
					parent.left = null;

			}

			else if (node.left == null && node.right != null) {
				if (item > parent.data)
					parent.right = node.right;
				else
					parent.left = node.right;

			} else if (node.left != null && node.right == null) {
				if (item > parent.data)
					parent.right = node.left;
				else
					parent.left = node.left;

			} else {
				int m = max(node.left);
				node.data = m;
				removeNode(node.left, node, m);
			}

		}

	}

}
