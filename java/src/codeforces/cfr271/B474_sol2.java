package codeforces.cfr271;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B474_sol2 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int n, m, q, cur, low, hi, mid;
	static int[] a;

	public static void main(String[] args) throws NumberFormatException, IOException {
		n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		a = new int[n];

		for (int i = 0; i < n; i++) {
			cur += Integer.parseInt(st.nextToken());
			a[i] = cur;
		}

		m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		br.close();

		for (int i = 0; i < m; i++) {
			q = Integer.parseInt(st.nextToken());
			low = 0;
			hi = n - 1;
			while (low < hi) {
				mid = (hi + low) / 2;
				if (q > a[mid]) {
					low = mid + 1;
				} else {
					hi = mid;
				}
			}
			pr.println(hi+1);
		}
		pr.flush();
		pr.close();
	}

}
