import java.util.*;



public class addduplicate {
	private class Node {
		int data;
		Node left;
		Node right;

		public Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}

		public Node() {
			
		}
	}

	private Node root;
	private int size;

	public addduplicate() {
		this.root = null;
		this.size = 0;
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size() == 0;
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


	public void display() {
		this.display(this.root);
	}

	private void display(Node node) {
		if (node.left != null) {
			System.out.print(node.left.data + " => ");
		} else {
			System.out.print("END => ");
		}
		System.out.print(node.data);
		if (node.right != null) {
			System.out.print(" <= " + node.right.data);
		} else {
			System.out.print(" <= END");
		}
		System.out.println();
		if (node.left != null) {
			display(node.left);
		}
		if (node.right != null) {
			display(node.right);
		}
	}

	public void duplicate() {
		this.duplicate(this.root);
	}

	private void duplicate(Node node) {
		if (node == null) {
			return;
		}
		
		duplicate(node.left);
		duplicate(node.right);
		this.addNode2(node.data);
		
	}

	public static void main(String[] args) {
		addduplicate bst = new addduplicate();
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			bst.addNode2(s.nextInt());
		}
		bst.duplicate();
		bst.display();
	}
}
