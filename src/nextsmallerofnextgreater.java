import java.util.Scanner;

public class nextsmallerofnextgreater {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int tc = scn.nextInt();

		while (tc > 0) {
			int n = scn.nextInt();

			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scn.nextInt();
			}
			int[] arr1 = nextgreater(arr);
			 int[] result = nextsmaller(arr1, arr);
			for (int i = 0; i < arr.length; i++) {
				System.out.print(result[i]+" ");
			}
		tc--;}
	}

	public static int[] nextgreater(int[] arr) {
		int[] arr1 = new int[arr.length];
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					arr1[i] = arr[j];
					break;
				}
				
			}

		}
		for (int k = 0; k < arr1.length; k++) {
			if (arr1[k] == 0) {
				arr1[k] = -1;
			}
		}
		return arr1;

	}

	public static int[] nextsmaller(int[] arr, int[] orig) {
		int[] arr1 = new int[arr.length];
		for (int i = 0; i <= arr1.length - 1; i++) {
			if (arr[i] == -1) {
				arr1[i] = -1;
			} else {

				int index = 0;
				for (int j = 0; j <= arr.length; j++) {
					if (orig[j] == arr[i]) {
						index = j;
						break;
					}

				}
				for (int k = index; k <= orig.length - 1; k++) {

					if (arr[i] > orig[k]) {
						arr1[i] = orig[k];
						break;
					}
				}
			}
		}
		for (int k = 0; k < arr1.length; k++) {
			if (arr1[k] == 0) {
				arr1[k] = -1;
			}
		}
		return arr1;

	}
}
