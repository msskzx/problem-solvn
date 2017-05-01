package preez.codeforces.edcfr4;

import java.util.Scanner;

public class A612 {

	static Scanner sc = new Scanner(System.in);
	static int n, p, q, x, y;
	static String s;

	public static void main(String[] args) {
		n = sc.nextInt();
		p = sc.nextInt();
		q = sc.nextInt();
		s = sc.next();

		for (int i = 0; i <= n; i++) {
			if ((i % p) == 0 && (n - i) % q == 0) {
				x = i / p;
				y = (n - i) / q;
				break;
			}
		}
		if (x == 0 && y == 0) {
			System.out.println(-1);
		} else {
			System.out.println(x + y);
			int ind = 0;
			for (int i = 0; i < x; i++) {
				System.out.println(s.substring(ind, ind + p));
				ind += p;
			}
			for (int i = 0; i < y; i++) {
				System.out.println(s.substring(ind, ind + q));
				ind += q;
			}

		}
	}

}
