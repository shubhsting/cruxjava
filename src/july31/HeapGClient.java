package july31;

import java.util.ArrayList;

public class HeapGClient {

	public static void main(String[] args) {
//		GenericHeap<car> heap = new GenericHeap<>();
//
//		car[] ab = new car[5];
//		ab[0] = new car(1, 11, "ab");
//		ab[1] = new car(2, 22, "abc");
//		ab[2] = new car(9, 3, "abcd");
//		ab[3] = new car(4, 44, "abcde");
//		ab[4] = new car(5, 55, "abcdef");
//		for (int i = 0; i < ab.length; i++) {
//			heap.add(ab[i]);
//
//		}
//		ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
//		lists.add(new ArrayList<>());
//		lists.add(new ArrayList<>());
//		lists.add(new ArrayList<>());
//		lists.add(new ArrayList<>());
//		lists.get(0).add(1);
//		lists.get(0).add(8);
//		lists.get(0).add(9);
//		lists.get(0).add(10);
//		lists.get(0).add(12);
//		lists.get(1).add(5);
//		lists.get(1).add(15);
//		lists.get(1).add(20);
//		lists.get(2).add(7);
//		lists.get(2).add(13);
//		lists.get(2).add(25);
//		lists.get(2).add(30);
//		lists.get(3).add(2);
//		lists.get(3).add(3);
//		System.out.println(mergeksortedlists(lists));
		int[] arr = { 20, 50, 30, 40, 5, 4, 45 };
		kLargestElements(arr, 3);

	}

	public static class Pair implements Comparable<Pair> {
		int data;
		int currentindex;
		int listindex;

		@Override
		public int compareTo(Pair o) {
			return o.data - this.data;
		}

	}

	public static ArrayList<Integer> mergeksortedlists(ArrayList<ArrayList<Integer>> list) {
		GenericHeap<Pair> heap = new GenericHeap<>();
		for (int i = 0; i < list.size(); i++) {
			Pair np = new Pair();
			np.data = list.get(i).get(0);
			np.listindex = i;
			np.currentindex = 0;

			heap.add(np);
		}
		ArrayList<Integer> ans = new ArrayList<>();
		while (!heap.isEmpty()) {
			Pair rp = heap.remove();
			ans.add(rp.data);
			rp.currentindex += 1;
			if (rp.currentindex < list.get(rp.listindex).size()) {
				rp.data = list.get(rp.listindex).get(rp.currentindex);
				heap.add(rp);
			}
		}
		return ans;

	}

	public static void kLargestElements(int[] arr, int k) {
		Heap mn = new Heap();
		int i = 0;
		for (i = 0; i < k; i++) {
			mn.add(arr[i]);
		}

		while (i < arr.length) {
			int m = mn.remove();
			if (arr[i] > m) {
				mn.add(arr[i]);
			} else {
				mn.add(m);
			}
			i++;
		}
		mn.display();
	}

	
	
	
}
