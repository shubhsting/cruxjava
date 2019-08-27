package july31;

public class HeapClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Heap m = new Heap();
		m.add(20);
		m.display();
		m.add(40);
		m.display();
		m.add(10);
		m.display();
		m.add(79);
		m.display();
		m.add(5);
		m.display();
		System.out.println(m.remove());
		m.display();
	}

}
