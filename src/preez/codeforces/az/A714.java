package preez.codeforces.az;

import java.util.Scanner;

public class A714 {

	static Scanner sc = new Scanner(System.in);
	static long a, b, c, d, k, min, max, time, k1, k2, t1, t2;

	public static void main(String[] args) {
		a = sc.nextLong();
		b = sc.nextLong();
		c = sc.nextLong();
		d = sc.nextLong();
		k = sc.nextLong();

		if (b < c || d < a) {
			System.out.println(0);
		} else {

			min = Math.min(a, c);
			max = Math.max(b, d);

			time = Math.abs(a - c) + Math.abs(d - b);
			time = max - min - time + 1;

			if (k >= Math.max(a, c) && k <= Math.min(b, d)) {
				time--;
			}

			System.out.println(time);

		}

	}
}