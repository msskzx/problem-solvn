package uva;

import java.util.Scanner;

public class UVA11799 {

	static Scanner sc = new Scanner(System.in);
	static int t, max, n, cur;

	public static void main(String[] args) {
		t = sc.nextInt();
		for (int i = 1; i <= t; i++) {
			max = 0;
			n = sc.nextInt();
			while (n-- > 0) {
				cur = sc.nextInt();
				max = Math.max(max, cur);
			}
			System.out.printf("Case %d: %d\n", i, max);
		}
	}

}
