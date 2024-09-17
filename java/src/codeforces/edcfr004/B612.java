package codeforces.edcfr004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B612 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int n;
	static long ans;
	static StringTokenizer st;
	static int[] a;

	public static void main(String[] args) throws NumberFormatException, IOException {
		n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		a = new int[n];
		for (int i = 0; i < n; i++) {
			a[Integer.parseInt(st.nextToken()) - 1] = i;
		}

		br.close();

		for (int i = 1; i < n; i++)
			ans += Math.abs(a[i] - a[i - 1]);

		System.out.println(ans);

	}

}
