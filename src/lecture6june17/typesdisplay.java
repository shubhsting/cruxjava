package lecture6june17;

public class typesdisplay {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3, 4, 5 }, 
				        { 6, 7, 8, 9, 10 },
				        { 11, 12, 13, 14, 15 },
				        { 16, 17, 18, 19, 20 } };
		verticaldisplay(arr);
		System.out.println();
		wavedisplay(arr);
		System.out.println();
		spiraldisplay(arr);
	}

	public static void verticaldisplay(int[][] arr) {
		int c = arr[0].length;
		for (int col = 0; col < c; col++) {
			for (int row = 0; row < arr.length; row++) {
				System.out.print(arr[row][col] + ",");
			}

		}

	}

	public static void wavedisplay(int[][] arr) {
		int c = arr[0].length;
		for (int col = 0; col < c; col++) {
			if (col % 2 != 0) {
				for (int row = arr.length - 1; row >= 0; row--) {
					System.out.print(arr[row][col] + ",");
				}
			} else
				for (int row = 0; row < arr.length; row++) {
					System.out.print(arr[row][col] + ",");
				}
		}

	}

	public static void spiraldisplay(int[][] arr) {
		int minrow = 0;
		int maxrow = arr.length - 1;
		int mincol = 0;
		int maxcol = arr[0].length - 1;
		int total = arr.length * arr[0].length;
		int count = 0;
		while (count < total) {
			for (int row = minrow; row <= maxrow && count < total; row++) {
				System.out.print(arr[row][mincol] + ",");
				count++;
			}
			mincol++;
			
			for (int col = mincol; col <= maxcol && count < total; col++) {
				System.out.print(arr[maxrow][col] + ",");
				count++;
			}
			maxrow--;

			for (int row = maxrow; row >= minrow && count < total; row--) {
				System.out.print(arr[row][maxcol] + ",");
				count++;
			}

			maxcol--;
			
			for (int col = maxcol; col >= mincol && count < total; col--) {
				System.out.print(arr[minrow][col] + ",");
				count++;
			}
			minrow++;

		}

	}
}
