package codeforces.cfr313;

import java.util.Scanner;

public class A560 {

	static Scanner sc = new Scanner(System.in);
	static int n;
	static boolean flag;

	public static void main(String[] args) {
		n = sc.nextInt();
		for (int i = 0; i < n; i++)
			if (sc.nextInt() == 1)
				flag = true;

		System.out.println(flag ? -1 : 1);

	}

}
