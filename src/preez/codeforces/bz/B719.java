package preez.codeforces.bz;

import java.util.Scanner;

public class B719 {

	static Scanner sc = new Scanner(System.in);
	static int r, b, rr, bb, swaps, n, x;
	static String s;

	public static void main(String[] args) {
		n = sc.nextInt();
		s = sc.next();
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'r')
				r++;
			else
				b++;
		}

		for (int i = 0; i < n - 1; i++) {
			if (s.charAt(i) == 'r' && s.charAt(i + 1) == 'r')
				rr++;
			if (s.charAt(i) == 'b' && s.charAt(i + 1) == 'b')
				bb++;
		}

		if (Math.abs(r - b) <= 1)
			System.out.println((int) Math.ceil(Math.max(rr, bb) * 1.0 / 2));
		else {
			if (rr == 0 || bb == 0) {
				System.out.println((int) Math.max(r, b) / 2);
			} else {
				x = Math.min(bb, rr);
				r-= (2*x);
				b-=(2*x);
				rr-=x;
				bb-=x;
				if (Math.abs(r - b) <= 1)
					System.out.println(((int) Math.ceil(Math.max(rr, bb) * 1.0 / 2))+x);
				else 
						System.out.println(((int) Math.max(r, b) / 2)+x);
			}
		}

	}
}