package codeforces.edcfr007;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class C622 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new OutputStreamWriter(System.out));
	static int n, m, l, r, x;
	static StringTokenizer st;
	static int[] a = new int[200200];
	static int[] z = new int[200200];

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}

		z[0] = -1;

		for (int i = 1; i < n; i++) {
			if (a[i] != a[i - 1])
				z[i] = i - 1;
			else
				z[i] = z[i - 1];
		}

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			l = Integer.parseInt(st.nextToken());
			r = Integer.parseInt(st.nextToken());
			x = Integer.parseInt(st.nextToken());

			if (a[r - 1] != x) {
				pr.println(r);
			} else {
				if (z[r - 1] >= l - 1) {
					pr.println(z[r - 1] + 1);
				} else {
					pr.println(-1);
				}
			}
		}

		br.close();
		pr.flush();
		pr.close();
	}
}
