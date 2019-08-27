package lecture5june14;

import java.util.Scanner;

public class subset {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = takeInput();
		int[] arr1 = bubblesort(arr);
		display(arr1);

	}

	public static int[] takeInput() {

		System.out.println("size");
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			int val = scn.nextInt();
			arr[i] = val;
		}

		return arr;
	}

	public static void subset(int[] arr) {

	}

	public static int[] bubblesort(int[] arr) {
		int count = arr.length ;
		for (int c = 0; c <= arr.length - 2; c++) {
			for (int j = 0; j <= count - c - 2; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}

			}

		}
		return arr;

	}

	public static void display(int[] arr1) {

		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " \t");

		}
		System.out.println();

	}
}
