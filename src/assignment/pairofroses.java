package assignment;

	



			

import java.util.Scanner;
public class pairofroses{
    public static void main(String[] args) {
Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		for (int i = 0; i < n; i++) {
			String result = "";
			int a = scn.nextInt();
			int[] arr = new int[a];
			for (int j = 0; j < a; j++) {
				arr[j] = scn.nextInt();
			}
			int count = arr.length;
			for (int c = 0; c <= arr.length - 2; c++) {
				for (int j = 0; j <= count - c - 2; j++) {
					if (arr[j] > arr[j + 1]) {
						int temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
					}
				}
			}
			int sum = scn.nextInt();

			int high = arr.length;

			int d = 0;
			int e = 0;
			int c = 10000000;
			for (int lo = 0; lo < high - 1; lo++) {
				for (int hi = lo + 1; hi < high; hi++) {

					if (arr[lo] + arr[hi] == sum) {
						int f = arr[hi] - arr[lo];
						if (c > f) {
							c = f;
							d = arr[hi];
							e = arr[lo];

						}

					}

				}

			}
			result = result + "Deepak should buy roses whose prices are " + e + " " + "and" + " " + d + ".";
			System.out.println(result);
		}
	}
}