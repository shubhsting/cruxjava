package july16;

public class client {

	public static void main(String[] args) throws Exception {
	queue s=new queue();
		s.enque(10);
		s.enque(20);
		s.enque(30);
		s.enque(40);
		s.enque(50);
		System.out.println(s.deque());
		System.out.println(s.deque());
		s.enque(60);
		s.enque(70);
		s.display();
//		
		
//		
		
//		Queue1 s=new Queue1();
//		s.enqueue(10);
//		s.enqueue(20);
//		s.enqueue(30);
//		s.enqueue(40);
//		s.enqueue(50);
//		System.out.println(s.dequeue());
//		System.out.println(s.dequeue());
//		s.enqueue(60);
//		s.enqueue(70);
//		s.display();
		
	}

}
