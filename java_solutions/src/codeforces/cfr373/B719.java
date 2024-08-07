package codeforces.cfr373;

import java.util.Scanner;

public class B719 {

	static Scanner sc = new Scanner(System.in);
	static int n, r, b, x;
	static String s;

	public static void main(String[] args) {
		n = sc.nextInt();
		s = sc.next();
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'r' && i % 2 == 0)
				r++;
			else if (s.charAt(i) == 'b' && i % 2 == 1) {
				b++;
			}
		}
		x = Math.max(b, r);
		r = b = 0;

		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'r' && i % 2 == 1)
				r++;
			else if (s.charAt(i) == 'b' && i % 2 == 0) {
				b++;
			}
		}
		
		System.out.println(Math.min(x, Math.max(r, b)));
	}
}