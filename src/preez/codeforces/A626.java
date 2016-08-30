package preez.codeforces;

import java.util.Scanner;

public class A626 {

	static Scanner sc = new Scanner(System.in);
	static int n, ud, rl, count;
	static String s;

	public static void main(String[] args) {
		n = sc.nextInt();
		s = sc.next();

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				rl = ud = 0;
				for (int k = i; k <= j; k++) {
					if (s.charAt(k) == 'U') {
						ud++;
					} else {
						if (s.charAt(k) == 'D') {
							ud--;
						} else {
							if (s.charAt(k) == 'R') {
								rl++;
							} else {
								rl--;
							}
						}
					}
				}
				if (rl == 0 && ud == 0)
					count++;
			}
		}

		System.out.println(count);
	}

}
