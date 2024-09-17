package codeforces.good_bye_2014;

import java.util.Scanner;

public class A500 {

	static Scanner sc = new Scanner(System.in);
	static int n, t;

	public static void main(String[] args) {
		n = sc.nextInt();
		t = sc.nextInt();
		int[] a = new int[n - 1];
		boolean flag = false;

		for (int i = 0; i < n - 1; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i += a[i]) {
			if (i + 1 == t) {
				flag = true;
				break;
			}
			if (i + 1 > t)
				break;
		}

		System.out.println(flag ? "YES" : "NO");
	}

}
