package preez.recursion;

import java.util.Arrays;

public class Staircase {

	static int[] a;

	static int f(int n) {
		if (n == 0)
			return 1;
		if (n < 0)
			return 0;
		if (a[n] != -1)
			return a[n];
		return a[n] = f(n - 1) + f(n - 2) + f(n - 3);
	}

	public static void main(String[] args) {
		int n = 2;
		a = new int[n+1];
		Arrays.fill(a, -1);
		
		System.out.println(f(n));
	}

}
