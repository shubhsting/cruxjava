package assignment;

import java.util.Scanner;

public class ABCV {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] arr = takeinput();
		wavedisplay1(arr);

	}

	public static int[][] takeinput() {

		int row = scn.nextInt();
		int c = scn.nextInt();
		int[][] arr = new int[row][c];
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				int d = scn.nextInt();
				arr[i][j] = d;
			}

			System.out.println();
		}
		return arr;
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
		System.out.print("END");
	}

	public static void spiraldisplay(int[][] arr) {
		int minrow = 0;
		int maxrow = arr.length - 1;
		int mincol = 0;
		int maxcol = arr[0].length - 1;
		int total = arr.length * arr[0].length;
		int count = 0;
		while (count < total) {
			for (int col = mincol; col <= maxcol && count < total; col++) {
				System.out.print(arr[minrow][col] + ", ");
				count++;
			}
			minrow++;
			for (int row = minrow; row <= maxrow && count < total; row++) {
				System.out.print(arr[row][maxcol] + ", ");
				count++;
			}
			maxcol--;

			for (int col = maxcol; col >= mincol && count < total; col--) {
				System.out.print(arr[maxrow][col] + ", ");
				count++;
			}
			maxrow--;

			for (int row = maxrow; row >= minrow && count < total; row--) {
				System.out.print(arr[row][mincol] + ", ");
				count++;
			}

			mincol++;

		}
		System.out.print("END");
	}

	public static void wavedisplay1(int[][] arr) {
		int r = arr.length;
		for (int rw = 0; rw < r; rw++) {
			if (rw % 2 != 0) {
				for (int col = arr[0].length - 1; col >= 0; col--) {
					System.out.print(arr[rw][col] + ",");
				}
			} else
				for (int col = 0; col < arr[0].length; col++) {
					System.out.print(arr[rw][col] + ",");
				}
		}
		System.out.print("END");
	}
}
