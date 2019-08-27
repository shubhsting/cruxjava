
public class minimumnosequence {

	public static void main(String[] args) {
		int[] a = { 10, 15, 25 };
		int[] b = { 1, 5, 20, 30 };

		splitarray(a, b, 0, 0, "");
	}

	public static void splitarray(int[] a, int[] b, int ac, int bc, String ans) {
		if (ac == bc) {

			System.out.println(ans);
			return;

		}

		for (int i = 0; i < a.length; i++) {

			for (int k = i; k < b.length; k++) {
				if (a[i] > b[k]) {
					splitarray(a, b, ac, bc + 1, ans + a[i] + b[k]);
					for (int p = k; p < a.length; p++) {

						if (a[p] > b[k]) {

							splitarray(a, b, ac + 1, bc, ans + a[p] + b[k]);
						}
					}
				}

			}

		}

	}
}
