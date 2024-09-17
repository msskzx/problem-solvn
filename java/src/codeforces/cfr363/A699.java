package codeforces.cfr363;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A699 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int n, min = Integer.MAX_VALUE, time;
	static String s;
	static StringTokenizer st;
	static int[] a;

	public static void main(String[] args) throws NumberFormatException, IOException {
		n = Integer.parseInt(br.readLine());
		s = br.readLine();
		st = new StringTokenizer(br.readLine());
		a = new int[n];
		br.close();

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'R') {
				if (i + 1 < s.length() && s.charAt(i + 1) == 'L') {
					time = Math.abs(a[i] - a[i + 1]);
					time /= 2;
					min = Math.min(min, time);
				}
			}
		}
		System.out.println(min == Integer.MAX_VALUE ? -1 : min);

	}
}