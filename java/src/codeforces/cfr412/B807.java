package codeforces.cfr412;

import java.util.Scanner;

public class B807 {

	static Scanner sc = new Scanner(System.in);
	static int x, y, p, min, cur;
	static int[] a;

	static void positions(int z) {
		int i = (z / 50) % 475;
		for (int j = 0; j < 25; j++) {
			i = (i * 96 + 42) % 475;
			a[j] = (26 + i);
		}
	}

	static boolean check() {
		for (int i = 0; i < 25; i++) {
			if (a[i] == p)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		p = sc.nextInt();
		x = sc.nextInt();
		y = sc.nextInt();
		a = new int[25];

		pleace: while (true) {
			int i = 0;
			while (true) {
				cur = x - i * 50;
				if (cur < y)
					break;
				positions(cur);
				if (check())
					break pleace;
				i++;
			}
			min++;
			x += 100;
		}
		System.out.println(min);
	}

}
