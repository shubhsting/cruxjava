package july29;

import java.util.Comparator;

public class bubblesortusinggenerics {
	public static void main(String[] args) {
		Integer[] abc = { 10, 20, 30 };// only applicable for classes not primitives
		Car[] ab = new Car[5];
		ab[0] = new Car(1, 11, "ab");
		ab[1] = new Car(2, 22, "abcdefg");
		ab[2] = new Car(25, 33, "abcd");
		ab[3] = new Car(9, 44, "abcde");
		ab[4] = new Car(5, 55, "abcdef");
		bubbleSort1(ab, new classspeedcomparator());
		display(ab);

	}
	//generics always use classes not primitives.............................

//IN CAR WE HAVE TO CREATE COMPARE TO BUT IN STRING AND INT COMPARE TO IS PRESENT BY DEFAULT;
	public static <T extends Comparable<T>> void bubbleSort(T[] arr) {

		int n = arr.length;

		for (int count = 0; count <= n - 2; count++) {

			for (int j = 0; j <= n - count - 2; j++) {

				if (arr[j].compareTo(arr[j + 1]) > 0) {

					// swap
					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

		}

	}

	public static <T> void display(T[] arr) {
		for (T val : arr) {
			System.out.println(val);
		}
	}

	public static <T> void bubbleSort1(T[] arr, Comparator<T> m) {

		int n = arr.length;

		for (int count = 0; count <= n - 2; count++) {

			for (int j = 0; j <= n - count - 2; j++) {

				if ((m.compare(arr[j], arr[j + 1])) > 0) {

					// swap
					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

		}

	}
}
