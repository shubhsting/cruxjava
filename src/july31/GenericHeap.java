package july31;
//heap==priority queue 

//left=2*parent+1 or right=2*parent+2;
//parent=(child-1)/2;

import java.util.ArrayList;

import july29.Car;

public class GenericHeap<T extends Comparable<T>> {

	private ArrayList<T> data = new ArrayList<>();

	public int size() {
		return data.size() - 1;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public void display() {
		System.out.println(data);
	}

//log(n)
	public void add(T ab) {
		data.add(ab);
		upheapify(data.size() - 1);
	}

	private void upheapify(int ci) {
		int parent = (ci - 1) / 2;

		if (data.get(ci).compareTo(data.get(parent)) > 0) {
			swap(parent, ci);
			upheapify(parent);
		}

	}

	private void swap(int fi, int si) {
		T left = data.get(fi);
		T right = data.get(si);
		data.set(fi, right);
		data.set(si, left);

	}

//LOG(N)
	public T remove() {
		swap(0, data.size() - 1);
		T temp = data.remove(data.size() - 1);

		downheapify(0);
		return temp;
	}

	private void downheapify(int pi) {
		int lc = 2 * pi + 1;
		int rc = 2 * pi + 2;
		int min = pi;
		if (lc < data.size()  && data.get(lc).compareTo(data.get(min)) > 0) {
			min = lc;
		}
		if (rc < data.size()  && data.get(rc).compareTo(data.get(min)) > 0) {
			min = rc;
		}

		if (min != pi) {
			swap(min, pi);
			downheapify(min);
		}
	}

}
