package preez.bac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class E632 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int[] a;
	static int n, k;
	static HashSet<Integer> dp = new HashSet<Integer>();
	static StringTokenizer st;

	public static void f(int pos, int k, int cost) {
		if (k == 0) {
			dp.add(cost);
			return;
		}
		for (int i = pos; i < n; i++) {
			f(i, k - 1, cost + a[i]);
			f(i + 1, k, cost);
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO TLE
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());

		a = new int[n];

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++)
			a[i] = Integer.parseInt(st.nextToken());
		f(0, k, 0);

		int[] ans = new int[dp.size()];

		int i = 0;
		for (Integer x : dp)
			ans[i++] = x;

		Arrays.sort(ans);

		i = 0;
		for (; i < ans.length; i++)
			System.out.print(ans[i] + " ");

	}

}
