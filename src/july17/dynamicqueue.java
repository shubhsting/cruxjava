package july17;

import july16.queue;

public class dynamicqueue extends queue {
@Override
public void enque(int item) throws Exception {
	if(isFull()) {
		
		int[] na=new int[2*data.length];
		for (int i = 0; i < size(); i++) {
			int idx = (front + i) % data.length;
			na[i]=data[idx];
			
		}
		data=na;
		front=0;
	}
	super.enque(item);
}
}
