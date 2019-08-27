package lecture6june17;

public class matrixmultiplication {

	public static void main(String[] args) {

	}

	public static void matrix(int[][] one, int[][] two) {
		int r1 = one.length;
		int r2 = two.length;
		int c1 = one[0].length;
		int c2 = two.length;
		int[][] arr = new int[r1][c2];
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c2; j++) {
				int sum = 0;
				for (int k = 0; k < r2; k++) {

					sum = sum + one[i][k] * two[k][j];

				}

				arr[i][j] = sum;
			}

		}

	}
}
