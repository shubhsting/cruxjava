import java.util.ArrayList;
import java.util.HashMap;

public class hashmap {

	public static void main(String[] args) {
		// String str = "abacdddd";
		// System.out.println(maxFreqChar(str));
		int[] one = { 1, 2, 3, 4, 5, 6, 0, 77, 8, 99, 33, 55 };
		longestConsecutive(one);
//		int[] two = { 10, 10, 20, 20, 65 };
//		commonElements(one, two);
	}

	public static char maxFreqChar(String str) {
		int max = -1;
		HashMap<Character, Integer> ma = new HashMap<>();
		for (int m = 0; m < str.length(); m++) {
			char p = str.charAt(m);
			if (ma.containsKey(p)) {

				ma.put(p, ma.get(p) + 1);
			} else {
				ma.put(p, 1);
			}
		}
		// int val=ma.getOrDefault(ch,0)+1;
		// map.put(ch,val);
		ArrayList<Character> keyset = new ArrayList<>(ma.keySet());
		char ch = 0;
		for (int m = 0; m < keyset.size(); m++) {
			int temp = ma.get(keyset.get(m));

			if (temp > max) {
				ch = keyset.get(m);
				max = temp;
			}

		}

		return ch;
	}

	public static void commonElements(int[] one, int[] two) {

		HashMap<Integer, Integer> ma = new HashMap<>();
		for (int m = 0; m < one.length; m++) {
			int ch = one[m];

			int val = ma.getOrDefault(ch, 0) + 1;
			ma.put(ch, val);

		}

		for (int m = 0; m < two.length; m++) {
			int ch = two[m];
			if (ma.containsKey(ch) && ma.get(ch) > 0) {
				System.out.println(ch);
				ma.put(ch, ma.get(ch) - 1);
			}

		}
	}

	public static void longestConsecutive(int[] arr) {
		HashMap<Integer, Boolean> ma = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			if (ma.containsKey(temp - 1)) {
				ma.put(temp, false);
			} else {
				ma.put(temp, true);
			}

			if (ma.containsKey(temp + 1)) {
				ma.put(temp + 1, false);
			}
		}

		int max = 0;

		String str = "";
		int start = 0;
		for (Integer val : ma.keySet()) {
			int count = 0;
			if (ma.get(val)) {
				while (ma.containsKey(val + count)) {
					count++;
				}
				if (count > max) {
					start = val;
					max = count;

				}

			}
		}
		for (int i = 0; i < max; i++) {
			System.out.print(start + i + " ");
		}

	}
}
