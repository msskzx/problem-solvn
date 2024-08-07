package codeforces.cfr362;

import java.util.Scanner;

public class A697 {

	static Scanner sc = new Scanner(System.in);
	static int t, s, x, cur;

	static boolean f() {
		if (x < t)
			return false;
		if (x == t)
			return true;
		cur = x - t;
		if(cur < s)
			return false;
		return cur % s == 0 || (cur - 1) % s == 0;
	}

	public static void main(String[] args) {
		t = sc.nextInt();
		s = sc.nextInt();
		x = sc.nextInt();

		System.out.println(f() ? "YES" : "NO");

	}

}
