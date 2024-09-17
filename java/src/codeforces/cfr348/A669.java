package codeforces.cfr348;

import java.util.Scanner;

public class A669 {

	static Scanner sc = new Scanner(System.in);
	static int n;

	public static void main(String[] args) {
		n = sc.nextInt();
		System.out.println((n / 3 * 2 + (n % 3 == 0 ? 0 : 1)));
	}

}
