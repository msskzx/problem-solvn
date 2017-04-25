package preez.codeforces.cfr196;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A337 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int n, m, min;
	static StringTokenizer st;
	static int[] a;

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		a = new int[m];
		for (int i = 0; i < m; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(a);

		min = 1001;
		for (int i = 0; i <= m - n; i++) {
			min = Math.min(min, a[n + i - 1] - a[i]);
		}

		System.out.println(min);
	}

}
