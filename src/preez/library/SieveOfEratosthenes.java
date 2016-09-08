package preez.library;

import java.util.Arrays;

public class SieveOfEratosthenes {

	static boolean[] a;

	static void sieve(int n) {
		a = new boolean[n];
		Arrays.fill(a, true);
		a[0] = a[1] = false;

		int prime = 2;

		while (prime <= ((int) Math.sqrt(n))) {
			crossOff(prime);
			prime = getNextPrime(prime);
		}
	}

	static void crossOff(int prime) {
		for (int i = prime * prime; i < a.length; i += prime) {
			a[i] = false;
		}
	}

	static int getNextPrime(int prime) {
		int next = prime + 1;
		while (next < a.length && !a[next]) {
			next++;
		}
		return next;
	}

}
