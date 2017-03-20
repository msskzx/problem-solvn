package preez.mayhem.implementation;

import java.util.Arrays;
import java.util.Random;

public class Bogo_Sort {

	static int[] a = { 2, 3, 1, 5, 9, 0 };
	static int tmp, ind;

	static void sort() {
		while (notSorted()) {
			shuffle();
		}
	}

	static boolean notSorted() {
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1])
				return true;
		}
		return false;
	}

	static void shuffle() {
		for (int i = 0; i < a.length; i++) {
			ind = new Random().nextInt(a.length);
			tmp = a[i];
			a[i] = a[ind];
			a[ind] = tmp;
		}
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(a));
		sort();
		System.out.println(Arrays.toString(a));
	}

}
