package preez.codeforces.cfr306;

import java.util.ArrayList;
import java.util.Scanner;

public class B550 {

	static Scanner sc = new Scanner(System.in);
	static int n, min, max, diff, bit, sum, count, diff1, diff2;
	static int[] a;
	static ArrayList<Integer> chosen;

	public static void main(String[] args) {
		n = sc.nextInt();
		min = sc.nextInt();
		max = sc.nextInt();
		diff = sc.nextInt();
		a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		for (int j = 1; j < (1 << n); j++) {
			// each combination
			bit = 1;
			chosen = new ArrayList<Integer>();
			sum = 0;

			for (int k = n - 1; k >= 0; k--) {
				if ((bit & j) != 0) {
					// take this number
					chosen.add(a[k]);
				}
				bit = bit << 1;
			}
			// constraints
			diff1 = diff2 = chosen.get(0);
			for (int x : chosen) {
				diff1 = Math.min(diff1, x);
				diff2 = Math.max(diff2, x);
				sum += x;
			}

			if (sum >= min && sum <= max && diff2 - diff1 >= diff)
				count++;
		}

		System.out.println(count);

	}

}
