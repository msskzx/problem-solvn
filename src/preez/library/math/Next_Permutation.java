package preez.library.math;

public class Next_Permutation {

	public static boolean nextPermutation(int[] arr) {
		int length = arr.length;
		int i = length - 2;
		for (; i >= 0; i--) {
			if (arr[i] < arr[i + 1]) {
				break;
			}
		}

		if (i == -1)
			return false;

		for (int j = length - 1; j > i; j--) {
			if (arr[j] > arr[i]) {
				int tmp = arr[j];
				arr[j] = arr[i];
				arr[i] = tmp;
				break;
			}
		}

		int s = i + 1;
		int e = length - 1;

		while (s < e) {
			int tmp = arr[s];
			arr[s] = arr[e];
			arr[e] = tmp;
			s++;
			e--;
		}

		return true;
	}
}