package codeforces.cfr412;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C807 {

	static long t, p, q, x, y;

	static void solve() {
		long r = (int) 1e9, l = -1, m;

		if (!check(r)) {
			System.out.println(-1);
			return;
		}

		while (r - l > 1) {
			m = (l + r) / 2;
			if (check(m))
				r = m;
			else
				l = m;
		}
		System.out.println(r * q - y);
	}

	static boolean check(long c) {
		return p * c >= x && q * c - p * c >= y - x;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			p = Integer.parseInt(st.nextToken());
			q = Integer.parseInt(st.nextToken());

			solve();
		}
	}

}
