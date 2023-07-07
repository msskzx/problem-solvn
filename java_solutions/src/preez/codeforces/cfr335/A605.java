package preez.codeforces.cfr335;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A605 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int n, cur, max;
	static int[] a;
	static StringTokenizer st;

	public static void main(String[] args) throws NumberFormatException, IOException {
		n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		a = new int[100001];

		for (int i = 0; i < n; i++) {
			a[Integer.parseInt(st.nextToken())] = i;
		}
		cur = 1;
		for (int i = 2; i <= n; i++) {
			if (a[i] > a[i - 1]) {
				cur++;
			} else {
				max = Math.max(cur, max);
				cur = 1;
			}
		}
		max = Math.max(cur, max);
		System.out.println(n - max);
	}

}
