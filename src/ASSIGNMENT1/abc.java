package ASSIGNMENT1;

import java.util.*;



class LinkedList {

	private class Node {

		int data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	public int getFirst() throws Exception {
		if (this.size == 0)
			throw new Exception("linked list is empty");

		return head.data;
	}

	public int getLast() throws Exception {
		if (this.size == 0)
			throw new Exception("linked list is empty");

		return tail.data;
	}

	public void addLast(int item) {
		// create a new node
		Node nn = new Node();

		nn.data = item;
		nn.next = null;

		// update summary
		if (size == 0) {
			this.head = nn;
			this.tail = nn;
			size++;
		} else

		{
			this.tail.next = nn;
			this.tail = nn;

			size++;
		}

	}

	public void addFirst(int item) {
		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		if (size == 0) {
			this.head = nn;
			this.tail = nn;
			size++;
		} else {
			nn.next = this.head;
			this.head = nn;
			size++;
		}

	}

	public int removeFirst() throws Exception {
		Node fn = this.head;

		if (this.size == 0)
			throw new Exception("linked list is empty");

		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			size = 0;
		} else {
			Node np1 = this.head.next;
			this.head = np1;
			size--;
		}

		return fn.data;
	}

	public void partition() throws Exception {
		partition(head, 0);
	}

	static int v = 0;

	private void partition(Node node, int count) throws Exception {
		if (count == size - 1) {
			tail = this.getNodeAt(count + v);
			return;
		}

		if (node.data % 2 == 0) {
			int m = removeAt(count);
			this.addLast(m);
			v++;

		}

		partition(node.next, count + 1);
	}

	public int removeAt(int idx) throws Exception {
		if (idx < 0 || idx >= size) {
			throw new Exception("invalid idx");
		}
		if (idx == 0) {
			removeFirst();
		} else if (idx == size - 1) {
			removelast();
		}

		else {
			Node nm1 = getNodeAt(idx - 1);
			Node n = nm1.next;
			int temp = n.data;
			Node np1 = n.next;
			nm1.next = np1;
			size--;
			return temp;
		}
		return 0;

	}

	public void display() {

		Node temp = this.head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}

	}

	public int removelast() throws Exception {
		if (size == 0) {
			throw new Exception("LL is empty");
		}
		int temp = tail.data;
		Node newtail = getNodeAt(size - 1);
		newtail.next = null;
		newtail = tail;
		size--;
		return temp;

	}

	public Node getNodeAt(int idx) throws Exception {

		Node temp = head;
		if (idx < 0) {
			throw new Exception("INVALID INDEX");
		}
		if (idx == 0) {
			return temp;
		}
		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}
		return temp;
	}

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		LinkedList ll = new LinkedList();
		int n = scn.nextInt();

		for (int j = 0; j < n; j++) {
			int item = scn.nextInt();
			ll.addLast(item);
		}

		ll.partition();
		ll.display();

	}

	

	
}
