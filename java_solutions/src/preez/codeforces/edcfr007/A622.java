package preez.codeforces.edcfr007;

import java.util.*;

public class A622 {
	static Scanner sc = new Scanner(System.in);
	static long n, l = 1;

	public static void main(String[] args) {
		n = sc.nextLong();
		while (n > l) {
			n -= l;
			l++;
		}
		System.out.println(n);
	}

}