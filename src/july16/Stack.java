package july16;
//stack using arrays 
public class Stack {

	protected int[] data;
	protected int tos;

	public Stack() {
		this.data = new int[5];
		this.tos = -1;
	}

	public Stack(int cap) {
		this.data = new int[cap];
		this.tos = -1;
	}

	public void push(int item) throws Exception {
		if (isFull()) {
			throw new Exception("stack is full.");
		}
		tos++;
		data[tos] = item;
	}

	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("stack is empty.");
		}
		int temp = data[tos];
		data[tos] = 0;
		tos--;
		return temp;
	}

	public int peek() throws Exception {
		if (isEmpty()) {
			throw new Exception("stack is empty.");
		}
		int temp = data[tos];
		return temp;
	}

	public int size() {

		return tos + 1;
	}

	public boolean isEmpty() {
		if (size() == 0) {
			return true;
		}

		return false;
	}

	public boolean isFull() {

		if (size() == data.length) {
			return true;
		}
		return false;

	}

	public void display() {
		for (int i = tos; i >= 0; i--) {
			System.out.println(data[i] );
		}
	}
}
