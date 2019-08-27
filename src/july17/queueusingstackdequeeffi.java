package july17;

public class queueusingstackdequeeffi {
	dynamicstack ab = new dynamicstack();

	public void enque(int item) throws Exception {
		try {
			dynamicstack temp = new dynamicstack();
			while (!ab.isEmpty()) {
				int m = ab.pop();
				temp.push(m);

			}
			temp.push(item);
			while (!temp.isEmpty()) {
				int m = temp.pop();
				ab.push(m);

			}
		} catch (Exception e) {
			throw new Exception("Queue is full.");
		}
	}

	public int deque() throws Exception {
		try {
			int m = ab.pop();
			return m;
		} catch (Exception e) {
			throw new Exception("Queue is Empty.");
		}
	}

	public void display() {
		ab.display();
	}
}
