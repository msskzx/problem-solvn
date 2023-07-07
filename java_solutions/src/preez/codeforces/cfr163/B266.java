package preez.codeforces.cfr163;

import java.util.Scanner;

public class B266 {
	static Scanner sc = new Scanner(System.in);
	static String s;
	static int n, t;

	public static void main(String[] args) {
		n = sc.nextInt();
		t = sc.nextInt();
		s = sc.next();
		char[] a = s.toCharArray();

		for (int i = 0; i < t; i++) {
			for (int j = 1; j < n; j++) {
				if (a[j] == 'G' && a[j - 1] == 'B') {
					a[j] = 'B';
					a[j - 1] = 'G';
					j++;
				}
			}
		}

		for (int i = 0; i < n; i++)
			System.out.print(a[i]);
		System.out.println();

	}
}
