package ASSIGNMENT1;

import java.util.*;

class ll2 {

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

	public void merge_sorted_list(ll2 other) throws Exception {
		ll2 list4 = new ll2();
		Node i = this.head;
		Node j = other.head;
		while (i != null || j != null) {
			if (i.data < j.data) {
				list4.addLast(i.data);
				i = i.next;
			} else if (i.data > j.data) {
				list4.addLast(j.data);
				j = j.next;
			} else {
				list4.addLast(i.data);
				list4.addLast(i.data);
				i = i.next;
				j = j.next;
			}
		}
		if (i != null) {
			while (i != null) {
				list4.addLast(i.data);
				i = i.next;
			}
		}
		if (j != null) {
			while (j != null) {
				list4.addLast(j.data);
				j = j.next;
			}
		}
		list4.display();

	}

	public void display() {

		Node temp = this.head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}

	}

	static int carry = 0;

//	static int sum = 0;
//	static int realsum=0;
	public void sum(Node one, Node two, ll2 list1) {
		int sum = 0;
		int realsum = 0;
		if (one == null && two == null) {
			return;
		}

		sum(one.next, two.next, list1);
		// sum(one, two.next, list1);
		realsum = one.data + two.data + carry;
		sum = (one.data + two.data) % 10;
		carry = (one.data + two.data) / 10;
		list1.addFirst(sum);
		return;
	}

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		int t = scn.nextInt();

		while (t > 0) {

			ll2 list1 = new ll2();
			int n1 = scn.nextInt();

			for (int j = 0; j < n1; j++) {
				int item = scn.nextInt();
				list1.addLast(item);
			}

			ll2 list2 = new ll2();
			int n2 = scn.nextInt();

			for (int j = 0; j < n2; j++) {
				int item = scn.nextInt();
				list2.addLast(item);
			}
			// list1.merge_sorted_list(list2);
			ll2 list3 = new ll2();
			list1.sum(list1.head, list2.head, list3);
			list3.display();
			t--;
		}

	}
}
