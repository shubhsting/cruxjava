package july16;

public class Queue1 {
	private int[] data;
	private int front;
	private int size;

	public Queue1() {
		data = new int[5];
		front = size = 0;
	}

	public Queue1(int cap) {
		data = new int[cap];
		front = size = 0;
	}

	public void enqueue(int item) throws Exception {

		if (isFull()) {
			throw new Exception("Queue is Full.");
		}

		int idx = (front + size) % data.length;
		data[idx] = item;
		size++;
	}

	public int dequeue() throws Exception {

		if (isEmpty()) {
			throw new Exception("Queue is Empty.");
		}

		int temp = data[front];
		data[front] = 0;
		front = (front + 1) % data.length;
		size--;

		return temp;
	}

	public int getFront() throws Exception {

		if (isEmpty()) {
			throw new Exception("Queue is Empty.");
		}

		int temp = data[front];
		return temp;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public boolean isFull() {
		return size() == data.length;
	}

	public void display() {

		System.out.println("--------------------");

		for (int i = 0; i < size(); i++) {
			int idx = (i + front) % data.length;
			System.out.print(data[idx] + " ");
		}

		System.out.println(".");
		System.out.println("--------------------");
	}

}
