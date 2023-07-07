package preez.codefights.arcade.core;

public class WeakNumbers {

	/**
	 * https://codefights.com/arcade/code-arcade/labyrinth-of-nested-loops/
	 * oL7YuygJKtMSNLeJn
	 */

	static int[] d;
	static int[] w;

	int[] weakNumbers(int n) {
		// number of divisors
		d = new int[n + 1];
		// weakness
		w = new int[n + 1];

		// initialize
		for (int i = 1; i <= n; i++) {
			d(i);
			w(i);
		}

		// find maximum weakness
		int max = 1;
		for (int i = 1; i <= n; i++)
			if (w[i] >= w[max] && d[i] == 2)
				max = i;

		// count numbers with that weakness
		int c = 0;
		for (int i = 1; i <= n; i++)
			if (w[i] == w[max])
				c++;

		return new int[] { w[max], c };
	}

	// number of divisors for a given number
	static void d(int n) {
		int c = 0;
		for (int i = 1; i <= n; i++)
			if (n % i == 0)
				c++;
		d[n] = c;
	}

	// weakness of a a given number
	static void w(int n) {
		int c = 0;
		for (int i = 1; i < n; i++)
			if (d[i] > d[n])
				c++;
		w[n] = c;
	}

}
