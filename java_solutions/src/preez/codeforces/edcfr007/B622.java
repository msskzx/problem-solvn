package preez.codeforces.edcfr007;

import java.util.*;

public class B622 {

	static Scanner sc = new Scanner(System.in);
	static int h, m, x, xh, xm;
	static String s;
	static String[] a;

	public static void main(String[] args) {
		s = sc.next();
		x = sc.nextInt();
		a = s.split(":");
		h = Integer.parseInt(a[0]);
		m = Integer.parseInt(a[1]);
		xh = x / 60;
		xm = x % 60;
		h += xh;
		m += xm;
		while (m > 59) {
			m -= 60;
			h++;
		}
		while (h > 23)
			h -= 24;
		System.out.printf("%02d:%02d", h, m);
	}

}