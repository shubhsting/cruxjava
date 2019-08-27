package july18;

import java.util.Scanner;

public class clientLL {

	public static void main(String[] args) throws Exception {
		
		Scanner scn=new Scanner(System.in);
		int tc=scn.nextInt();
		while(tc>0) {
			linkedlist ll=new linkedlist();
			int c=scn.nextInt();
			for(int i=0;i<c;i++) {
				int d=scn.nextInt();
				ll.addLast(d);
			}
			ll.fold();
			ll.display();
			
		}
//		ll.addLast(10);
//		ll.addLast(20);
//		ll.addLast(30);
//		ll.addLast(40);
//		ll.addLast(50);
//		ll.addLast(60);
//		ll.addLast(70);
//		ll.addLast(80);
//		ll.display();
		//ll.addLast(90);
	
	
		//ll.display();
		//System.out.println(ll.getElement(3));
		//ll.ReverseDataRecursively();
		//ll.fold();
		//ll.display();
	//	System.out.println(ll.kfromlast(3));
		//ll.createDummyList();
		
		//System.out.println(ll.linkedListIntersection());
		//System.out.println(ll.FloydCycleDetectandRemove());
		//ll.display();
//		ll.kReverse(3);
//		ll.display();
		
	}

}
