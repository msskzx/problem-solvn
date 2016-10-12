package preez.codeforces;

import java.util.Scanner;

public class B721 {

	static Scanner sc = new Scanner(System.in);
	static int n, k, password, t1, t2, wrong;
	static int[] a = new int[101];

	public static void main(String[] args) {
		n = sc.nextInt();
		k = sc.nextInt();
		for (int i = 0; i < n; i++) {
			password = sc.next().length();
			a[password]++;
		}
		password = sc.next().length();

		for (int i = 0; i < a.length; i++) {
			if (i == password) {
				t1++;
				t2++;
				a[i]--;
				while (a[i] > 0) {
					wrong++;
					a[i]--;
					if (wrong == k) {
						t2 += 6;
						wrong = 0;
					} else
						t2++;
				}
				break;
			} else {
				while (a[i] > 0) {
					wrong++;
					a[i]--;
					if (wrong == k) {
						t1 += 6;
						t2 += 6;
						wrong = 0;
					} else {
						t1++;
						t2++;
					}
				}
			}
		}

		System.out.println(t1 + " " + t2);

	}

}
