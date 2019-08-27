package ASSIGNMENT1;



public class sumof2ll {
	

	static class ll2 {

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

		public void display() {

			Node temp = this.head;

			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}

		}

		public void sum(Node one, Node two, ll2 list1) {
			int carry = 0;
			int sum = 0;
			int realsum;
			if (one == null || two == null) {
				return;
			}

			sum(one.next, two, list1);
			sum(one, two.next, list1);
			realsum = one.data + two.data + carry;
			sum = (one.data + two.data) % 10;
			carry = (one.data + two.data) / 10;
			list1.addFirst(sum);
		}

	
	public static void main(String[] args) {
		ll2 list1 = new ll2();
		ll2 list2 = new ll2();
		list1.addFirst(5);
		list1.addFirst(6);
		list1.addFirst(3);
		list2.addFirst(8);
		list2.addFirst(4);
		list2.addFirst(2);
		
	
	}
}}
