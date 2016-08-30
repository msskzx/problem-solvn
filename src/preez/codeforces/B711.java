package preez.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B711 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int n, di, dj;
	static long sum, cur, lost;
	static long[][] a;
	static StringTokenizer st;

	public static long check() {
		// sum
		for (int i = 0; i < n; i++) {
			if (i != di) {
				for (int j = 0; j < n; j++) {
					sum += a[i][j];
				}
				break;
			}
		}

		// rows
		for (int i = 0; i < n; i++) {
			if (i != di) {
				cur = 0;
				for (int j = 0; j < n; j++) {
					cur += a[i][j];
				}

				if (cur != sum)
					return -1;
			}
		}

		if (cur != sum)
			return -1;

		// cols
		for (int i = 0; i < n; i++) {
			if (i != dj) {
				cur = 0;
				for (int j = 0; j < n; j++) {
					cur += a[j][i];
				}

				if (cur != sum) {
					return -1;
				}
			}
		}

		if (cur != sum)
			return -1;

		for (int i = 0; i < n; i++) {
			lost += a[di][i];
		}

		if (sum - lost <= 0) {
			return -1;
		}

		a[di][dj] = sum - lost;
		cur = 0;

		// diagonal - one
		for (int i = 0; i < n; i++)
			cur += a[i][i];
		if (cur != sum)
			return -1;

		// diagonal - two
		cur = 0;
		for (int i = 0; i < n; i++)
			cur += a[i][n - 1 - i];

		if (cur != sum)
			return -1;

		return a[di][dj];
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		n = Integer.parseInt(br.readLine());
		a = new long[n][n];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				a[i][j] = Long.parseLong(st.nextToken());
				if (a[i][j] == 0) {
					di = i;
					dj = j;
				}
			}
		}

		System.out.println(n == 1 ? 1 : check());
	}

}
