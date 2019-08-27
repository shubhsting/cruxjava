package july18;

public class linkedlist {
//complexities are written over each function;
	private class node {
		int data;
		node next;

		public node(int a) {
			this.data = a;
		}

		public node() {
		}
	}

	private node head;
	private node tail;
	private int size;

//o(1)
	public boolean isEmpty() {
		return size == 0;
	}

//O(1)
	public int getFirst() throws Exception {
		if (size == 0) {
			throw new Exception("LL is empty");
		}
		return head.data;
	}

//O(1)
	public int getLast() throws Exception {
		if (size == 0) {
			throw new Exception("LL is empty");
		}

		return tail.data;
	}

//O(n)
	public void display() {
		node temp = head;
		System.out.println("--------------------------------------");
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
		System.out.println("--------------------------------------");
	}

//O(1)
	public void addLast(int item) {
		// create
		node nn = new node();

		nn.data = item;
		nn.next = null;

		if (size > 0) {

			tail.next = nn;

			tail = nn;
		} else {
			head = nn;
			tail = nn;
		}
		size++;

	}

//O(1)
	public void addFirst(int item) {

		node nn = new node();

		nn.data = item;
		nn.next = null;

		if (size == 0) {
			head = nn;
			tail = nn;

		} else {
			nn.next = head;
			head = nn;
		}
		size++;
	}

//O(n)
	public node getNodeAt(int idx) throws Exception {

		node temp = head;
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

//O(N)
	public int getElement(int idx) throws Exception {

		node temp = head;
		if (idx < 0) {
			throw new Exception("INVALID INDEX");
		}
		if (idx == 0) {
			return temp.data;
		}
		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}
		return temp.data;
	}

//O(n)
	public void addAt(int item, int idx) throws Exception {

		if (idx < 0 || idx > size) {
			throw new Exception("INVALID INDEX");

		}
		if (idx == 0) {
			addFirst(item);
		} else if (idx == size) {
			addLast(item);
		} else {
			node nn = new node();

			nn.data = item;
			nn.next = null;

			node nm1 = getNodeAt(idx - 1);
			node np1 = nm1.next;
			nn.next = np1;
			nm1.next = nn;
			size++;
		}
	}

//O(1)
	public int removefirst() throws Exception {
		if (size == 0) {
			throw new Exception("LL is empty");
		}
		int temp = head.data;
		head = head.next;
		size--;
		return temp;

	}

//O(n)
	public int removelast() throws Exception {
		if (size == 0) {
			throw new Exception("LL is empty");
		}
		int temp = tail.data;
		node newtail = getNodeAt(size - 1);
		newtail.next = null;
		newtail = tail;
		size--;
		return temp;

	}

//O(n)
	public int removeAt(int idx) throws Exception {
		if (idx < 0 || idx >= size) {
			throw new Exception("invalid idx");
		}
		if (idx == 0) {
			removefirst();
		} else if (idx == size - 1) {
			removelast();
		}

		else {
			node nm1 = getNodeAt(idx - 1);
			node n = nm1.next;
			int temp = n.data;
			node np1 = n.next;
			nm1.next = np1;
			size--;
			return temp;
		}
		return 0;

	}

//O(N^2)
	public void ReverseDataIteratively() throws Exception {
		int i = 0;
		int j = size - 1;
		while (i < j) {

			node datai = getNodeAt(i);
			node dataj = getNodeAt(j);
			int temp = dataj.data;
			dataj.data = datai.data;
			datai.data = temp;
			i++;
			j--;

		}
	}

//O(N)
	public void ReversePointerIteratively() {
		node prev = head;
		node curr = head.next;

		while (curr != null) {
			node ahead = curr.next;
			curr.next = prev;

			prev = curr;
			curr = ahead;

		}
		node temp = head;
		head = tail;
		tail = temp;
		tail.next = null;
	}

	// O(N)
	public void ReversePointerRecursively() {
		ReversePointerRecursively(head, head.next);
		node temp = head;
		head = tail;
		tail = temp;
		tail.next = null;

	}

	private void ReversePointerRecursively(node prev, node curr) {
		if (curr == null) {
			return;
		}
		ReversePointerRecursively(curr, curr.next);
		curr.next = prev;
	}

	// O(N)
	public void ReverseDataRecursively() {
		// ReverseDataRecursively(head, head, 0);
		heapmover hp = new heapmover();
		hp.left = head;
		ReverseDataRecursivelyHeap(hp, head, 0);

	}

	private node ReverseDataRecursively(node left, node right, int count) {
		if (right == null) {
			return left;
		}

		node nl = ReverseDataRecursively(left, right.next, count + 1);

		if (count >= size / 2) {
			int temp = nl.data;
			nl.data = right.data;
			right.data = temp;
		}
		return nl.next;
	}

	public void ReverseDataRecursivelyHeap(heapmover hp, node right, int count) {
		if (right == null) {
			return;
		}

		ReverseDataRecursivelyHeap(hp, right.next, count + 1);

		if (count >= size / 2) {
			int temp = hp.left.data;
			hp.left.data = right.data;
			right.data = temp;
		}
		hp.left = hp.left.next;
	}

	private class heapmover {
		private node left;
	}

	public void fold() {
		fold(head, head, 0);
	}

	private node fold(node left, node right, int count) {
		if (right == null) {
			return left;
		}
		left = fold(left, right.next, count + 1);
		if (count > size / 2) {
			node ahead = left.next;
			left.next = right;
			right.next = ahead;
			return ahead;
		}
		if (count == size / 2) {
			tail = right;
			tail.next = null;
		}
		return null;
	}

	public int mid() {
		node slow = head;
		node fast = head;
		while (fast.next != null && fast.next.next != null) {
			// while (fast != null && fast.next!=null) { this is for getting second element
			// as mid
			// for even length
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}

	public int kfromlast(int k) {
		node slow = head;
		node fast = head;
		for (int i = 1; i < k; i++) {
			fast = fast.next;
		}

		while (fast.next != null) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow.data;
	}

	public int linkedListIntersection() {

		node a1 = new node(10);
		node a2 = new node(20);
		node a3 = new node(30);
		node a4 = new node(40);
		node a5 = new node(50);
		node a6 = new node(60);
		node b1 = new node(70);
		node b2 = new node(80);
		node b3 = new node(90);
		node b4 = new node(100);
		node b5 = new node(110);
		node b6 = new node(120);
		a1.next = a2;
		a2.next = a3;
		a3.next = a4;
		a4.next = a5;
		a5.next = a6;
		b1.next = b2;
		b2.next = b3;
		b3.next = b4;
		b4.next = b5;
		b5.next = b6;
		b6.next = a3;
		// logic ....

		node fp = a1;
		node ep = b1;
		while (fp != ep) {
			if (fp == null) {
				fp = b1;
			} else {
				fp = fp.next;
			}

			if (ep == null) {
				ep = a1;
			} else {
				ep = ep.next;
			}
		}
		return fp.data;
	}

	public void createDummyList() {
		node a1 = new node(10);
		node a2 = new node(20);
		node a3 = new node(30);
		node a4 = new node(40);
		node a5 = new node(50);
		node a6 = new node(60);
		node a7 = new node(70);
		node a8 = new node(80);
		a1.next = a2;
		a2.next = a3;
		a3.next = a4;
		a4.next = a5;
		a5.next = a6;
		a6.next = a7;
		a7.next = a8;
		a8.next = a2;
		head = a1;
	}

	public boolean FloydCycleDetectandRemove() {
		node slow = head;
		node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (fast == slow) {

				break;
			}
		}
		if (fast == slow) {

			// remove the cycle........
			node start = head;
			node next = slow;
			while (start.next != next.next) {
				start = start.next;
				next = next.next;
			}

			next.next = null;
			return true;
		}
		return false;
	}

	public void kReverse(int k) throws Exception {

		linkedlist update = null;

		while (size != 0) {
			linkedlist curr = new linkedlist();
			for (int i = 1; i <= k && this.size != 0; i++) {
				curr.addFirst(this.removefirst());

			}
			if (update == null) {
				update = curr;
//				update.head=curr.head;
//				update.tail=curr.tail;
//				update.size=curr.size;

			} else {

				update.tail.next = curr.head;
				update.tail = curr.tail;
				update.size += curr.size;
			}
		}
		this.head = update.head;
		this.tail = update.tail;
		this.size = update.size;
	}

}