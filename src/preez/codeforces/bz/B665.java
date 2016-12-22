package preez.codeforces.bz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B665 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int n, k, m, time, item;
	static int[] a;
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		a = new int[k];

		for (int i = 0; i < k; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}

		// users
		for (int i = 0; i < n; i++) {
			// items
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				item = Integer.parseInt(st.nextToken());
				// item
				int prev = a[0];
				int cur;
				if (prev == item) {
					time += 1;
				} else {
					for (int t = 1; t < k; t++) {
						if (a[t] == item) {
							time += t + 1;
							a[t] = prev;
							a[0] = item;
							break;
						}
						cur = a[t];
						a[t] = prev;
						prev = cur;
					}
				}

			}
		}

		br.close();
		System.out.println(time);

	}

}
