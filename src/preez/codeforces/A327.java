package preez.codeforces;

import java.util.Scanner;

public class A327 {

	static Scanner sc = new Scanner(System.in);
	static int n, max, cur;
	static int[] a;

	public static void main(String[] args) {
		n = sc.nextInt();
		a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				cur = 0;
				for (int k = 0; k < n; k++) {
					if (k <= j && k >= i) {
						if (a[k] == 0) {
							cur++;
						}
					} else {
						if (a[k] == 1)
							cur++;
					}
				}
				max = Math.max(max, cur);
			}
		}

		System.out.println(max);
	}

}
