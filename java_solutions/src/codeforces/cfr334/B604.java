package codeforces.cfr334;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B604 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int n, k, max, ind;
	static StringTokenizer st;
	static int[] a;

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		a = new int[n];
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}

		if (k >= n) {
			System.out.println(a[n - 1]);
		} else {
			ind = 2 * (n - k) - 1;
			max = a[n - 1];
			for (int i = 0; i <= ind / 2; i++) {
				max = Math.max(a[i] + a[ind - i], max);
			}
			System.out.println(max);
		}
	}

}
