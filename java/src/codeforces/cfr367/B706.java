package codeforces.cfr367;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B706 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int n, q, m;
	static int[] a;

	private static int binarySearch(int m) {
		int high = a.length - 1, low = 0, mid;
		while (low < high) {
			mid = low + (high - low + 1) / 2;
			if (m >= a[mid])
				low = mid;
			else
				high = mid - 1;
		}
		return m < a[low] ? -1 : low;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		a = new int[n];

		for (int i = 0; i < n; i++)
			a[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(a);

		m = Integer.parseInt(br.readLine());
		for (int i = 0; i < m; i++) {
			pr.println(binarySearch(Integer.parseInt(br.readLine())) + 1);
		}
		br.close();
		pr.flush();
		pr.close();
	}

}
