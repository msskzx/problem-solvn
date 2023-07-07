package preez.mayhem.implementation;

import java.util.Arrays;

public class Shaker_Sort {

	static int[] a = { 5, 4, 6, 3, 2, 1 };

	static void sort() {
		int tmp;
		for (int i = 0; i < a.length / 2; i++) {
			for (int j = i; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp;
				}
			}

			for (int j = a.length - 2 - i; j > i; j--) {
				if (a[j] < a[j - 1]) {
					tmp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = tmp;
				}
			}

		}
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(a));
		sort();
		System.out.println(Arrays.toString(a));
	}

}
