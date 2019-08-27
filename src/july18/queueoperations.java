package july18;

import july17.dynamicqueue;

public class queueoperations {
	public static void main(String[] args) throws Exception {
		dynamicqueue ab = new dynamicqueue();
		ab.enque(10);
		ab.enque(20);
		ab.enque(30);
		ab.enque(40);
		ab.enque(50);
		ab.enque(60);
		ab.enque(70);
		ab.display();
		reverseddisplay(ab,0);
		
	}
    
	public static void reversedisplaypermanent(dynamicqueue ab) throws Exception {
		if (ab.size() == 0) {
			return;
		}

		int m = ab.deque();

		reversedisplaypermanent(ab);
		ab.enque(m);

	}

	
	public static void reverseddisplay(dynamicqueue ab,int count) throws Exception {
		if(count==ab.size()) {
			return;
		}
		
		
		int temp=ab.deque();
		ab.enque(temp);
		reverseddisplay(ab, count+1);
		System.out.print(temp+" ");
		
	}
	
	
	
	
}
