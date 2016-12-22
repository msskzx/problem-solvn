package preez.codeforces.bz;

import java.util.Scanner;

public class B462 {

	static Scanner sc = new Scanner(System.in);
	static int n, k, ind;
	static long ans, cur;
	static String s;
	static int[] a;

	public static void main(String[] args) {
		n = sc.nextInt();
		k = sc.nextInt();
		s = sc.next();
		a = new int[26];

		for (int i = 0; i < s.length(); i++) {
			a[s.charAt(i) - 'A']++;
		}

		for (int i = 0; i < 26 && k > 0; i++) {
			for (int j = 0; j < 26; j++) {
				if (a[j] > a[ind]) {
					ind = j;
				}
			}
			cur = Math.min(a[ind], k);
			k -= a[ind];
			ans += (cur * cur);
			a[ind] = 0;
		}

		System.out.println(ans);
	}

}
