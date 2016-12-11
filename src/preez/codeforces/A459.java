package preez.codeforces;

import java.util.Scanner;

public class A459 {

	static Scanner sc = new Scanner(System.in);
	static int x1, y1, x2, y2, d;

	public static void main(String[] args) {
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		x2 = sc.nextInt();
		y2 = sc.nextInt();

		if (x1 == x2) {
			d = Math.abs(y1 - y2);
			System.out.printf("%d %d %d %d", x1 + d, y1, x2 + d, y2);
		} else {
			if (y1 == y2) {
				d = Math.abs(x1 - x2);
				System.out.printf("%d %d %d %d", x1, y1 + d, x2, y2 + d);
			} else {
				d = Math.abs(x1 - x2);
				if (d == Math.abs(y1 - y2)) {
					if (y1 > y2)
						System.out.printf("%d %d %d %d", x1, y1 - d, x2, y2 + d);
					else
						System.out.printf("%d %d %d %d", x1, y1 + d, x2, y2 - d);
				} else
					System.out.println(-1);
			}

		}
	}

}
