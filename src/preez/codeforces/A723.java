package preez.codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class A723 {

	static Scanner sc = new Scanner(System.in);
	static int[] a = { sc.nextInt(), sc.nextInt(), sc.nextInt() };

	public static void main(String[] args) {
		Arrays.sort(a);
		System.out.println(Math.abs(a[0] - a[1]) + Math.abs(a[1] - a[2]));
	}

}
