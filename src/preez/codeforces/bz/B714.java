package preez.codeforces.bz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B714 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int[] a;
	static int n, x;
	static StringTokenizer st;

	static boolean f() {

		for (int i = 0; i < n; i++) {
			if (!(a[i] == a[0] || a[i] + x == a[0] || a[i] - x == a[0] || a[i] + x == a[0] - x
					|| a[i] - x == a[0] + x)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) throws IOException {
		n = Integer.parseInt(br.readLine());
		a = new int[n];
		x = Integer.MAX_VALUE;
		st = new StringTokenizer(br.readLine());
		a[0] = Integer.parseInt(st.nextToken());

		for (int i = 1; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
			if (a[i] - a[0] != 0) {
				x = Math.min(x, Math.abs(a[i] - a[0]));
			}
		}

		if (x == Integer.MAX_VALUE) {
			System.out.println("YES");
		} else {
			System.out.println(f() ? "YES" : "NO");
		}

	}

}
