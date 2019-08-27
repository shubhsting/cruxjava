package july31;
//heap==priority queue 

//left=2*parent+1 or right=2*parent+2;
//parent=(child-1)/2;

import java.util.ArrayList;

public class Heap {

	private ArrayList<Integer> data = new ArrayList<Integer>();

	public int size() {
		return data.size() - 1;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public void display() {
		System.out.println(data);
	}

	public void add(int item) {
		data.add(item);
		upheapify(data.size() - 1);
	}

	private void upheapify(int pi) {
		int parent = (pi - 1) / 2;

		if (data.get(parent) > data.get(pi)) {
			swap(parent, pi);
			upheapify(parent);
		}

	}

	private void swap(int fi, int si) {
		int left = data.get(fi);
		int right = data.get(si);
		data.set(fi, right);
		data.set(si, left);

	}

	public int remove() {
		swap(0, data.size() - 1);
		int temp = data.remove(data.size() - 1);

		downheapify(0);
		return temp;
	}

	private void downheapify(int pi) {
		int lc = 2 * pi + 1;
		int rc = 2 * pi + 2;
		int min = pi;
		if (lc < data.size() && data.get(pi) > data.get(lc)) {
			min = lc;
		}
		if (rc < data.size()  && data.get(min) > data.get(rc)) {
			min = rc;
		}

		if (min != pi) {
			swap(min, pi);
			downheapify(min);
		}
	}

}
