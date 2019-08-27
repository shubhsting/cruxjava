package july17;

public class clientandoperationsonstack {

	public static void main(String[] args) throws Exception {
	dynamicstack ab=new dynamicstack();
	ab.push(10);
	ab.push(20);
	ab.push(30);
	ab.push(40);
	ab.push(50);
	ab.push(60);
	//
	//displayreverse(ab);
	//ab.display();
	dynamicstack ab1=new dynamicstack();
	actualdisplay(ab, ab1);
	ab.display();
	
//		ab.push(10);
//
		
//		dynamicqueue ab=new dynamicqueue();
//		ab.enque(10);
//		ab.enque(20);
//		ab.enque(30);
//		ab.enque(40);
//		ab.enque(50);
//		ab.enque(60);
//		ab.enque(70);
//		ab.deque();
//		ab.deque();
//		ab.enque(80);
//		ab.enque(90);
//		ab.display();
	}
	public static void displayreverse(dynamicstack stack) throws Exception {
		if(stack.size()==0) {
			return;
		}
		
		int m=stack.pop();
		
		displayreverse(stack);
		System.out.println(m);
		stack.push(m);
	}
	

	
	public static void actualdisplay(dynamicstack stack,dynamicstack helper) throws Exception {
		if(stack.size()==0) {
			actualdisplay2(stack, helper);
			return;
		}
		
		int temp=stack.pop();
		helper.push(temp);
		actualdisplay(stack, helper);
		
		
		
	}
	

	
	
	public static void actualdisplay2(dynamicstack stack,dynamicstack helper) throws Exception {
		if(helper.size()==0) {
			return;
		}
		int k=helper.pop();
		actualdisplay2(stack, helper);
		stack.push(k);
	}


	
	}
