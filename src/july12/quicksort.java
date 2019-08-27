package july12;

public class quicksort {
	public static void main(String[] args) {
		// int[] arr = { 40, 30, 9, 50, 8, 77 };
		// quicksort(arr, 0, arr.length - 1);
		// for (int val : arr) {
		// System.out.println(val);
		// }
polynomial(5,7);
		System.out.println(palindrome("nnitin"));
	}

	public static void quicksort(int[] arr, int low, int high) {
		if (low >= high) {
			return;

		}
		int lo = low;
		int hi = high;
		int mid = (lo + hi) / 2;

		int pivot = arr[mid];
		while (lo <= hi) {
			while (arr[lo] < pivot) {
				lo++;
			}
			while (arr[hi] > pivot) {
				hi--;

			}
			if (lo <= hi) {
				int temp = arr[hi];
				arr[hi] = arr[lo];
				arr[lo] = temp;
				lo++;
				hi--;
			}
		}

		quicksort(arr, low, hi);
		quicksort(arr, lo, high);
	}

	public static void polynomial(int x,int n) {

		int i = n;
		int result = 0;
		int pwr = 1;
		while (i > 0) {

			
			pwr = pwr * x;
			result = result + i * pwr;
			
			i=i-1;
		}
		System.out.println(result);
	}

	public static int palindrome(String str) {

		int count = 0;
		for (int axis = 0; axis < str.length(); axis++) {
			for (int orbit = 0; axis - orbit >= 0 && axis + orbit < str.length(); orbit++) {

				if (str.charAt(axis - orbit) == str.charAt(axis + orbit)) {
					count++;
				} else {
					break;
				}
			}
		}

		for (double axis1 = 0.5; axis1 < str.length(); axis1++) {
			for (double orbit1 = 0.5; axis1 - orbit1 >= 0 && axis1 + orbit1 < str.length(); orbit1++) {

				if (str.charAt((int) (axis1 - orbit1)) == str.charAt((int) (axis1 + orbit1))) {
					count++;
				} else {
					break;
				}

			}

		}

		return count;
	}
}
