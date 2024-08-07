package codeforces.cfr186;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B313 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new OutputStreamWriter(System.out));
	static int m, n;
	static StringTokenizer st;
	static int[] a;
	static String s;

	public static void main(String[] args) throws IOException {
		s = br.readLine();
		n = s.length();
		a = new int[n];

		for (int i = 1; i < n; i++) {
			a[i] = a[i - 1];
			if (s.charAt(i) == s.charAt(i - 1))
				a[i]++;
		}

		m = Integer.parseInt(br.readLine());

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			pr.println(-a[Integer.parseInt(st.nextToken()) - 1] + a[Integer.parseInt(st.nextToken()) - 1]);
		}
		pr.flush();
		pr.close();
		br.close();

	}

}
