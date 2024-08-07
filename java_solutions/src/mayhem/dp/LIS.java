package mayhem.dp;

import java.util.Scanner;

public class LIS {

	// longest increasing sequence

	static Scanner sc = new Scanner(System.in);
	static int n, longest = 1;

	public static void main(String[] args) {
		n = sc.nextInt();
		int[] a = new int[n];
		int[] m = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			m[i] = 1;
		}

		for (int i = 1; i < a.length; i++)
			for (int j = 0; j < i; j++)
				if (a[i] > a[j])
					m[i] = Math.max(m[i], m[j] + 1);

		for (int i = 1; i < a.length; i++)
			if (longest < m[i])
				longest = m[i];
		System.out.println(longest);
	}

}
