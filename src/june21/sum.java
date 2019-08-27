package june21;

import java.util.ArrayList;

public class sum {

	public static void main(String[] args) {
		int[] one = { 9, 9, 9, 8 };
		int[] two = { 1, 1 };
		System.out.println(intersection(one, two));

	}

	public static ArrayList<Integer> intersection(int[] one, int[] two) {

		ArrayList<Integer> ans = new ArrayList<>();
		int carry = 0;

		int i = one.length - 1;
		int j = two.length - 1;
		while (i >= 0 || j >= 0) {
			int sum = carry;
			if (i >= 0)
				sum = sum + one[i];
			if (j >= 0)
				sum = sum + two[j];

			int a = sum % 10;
			ans.add(0, a);
			carry = sum / 10;
			i--;
			j--;
		}
		if (carry > 0)
			ans.add(0, carry);
		return ans;
	}

}
