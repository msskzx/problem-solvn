package codeforces.cfr367;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A706 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int n;
	static double x, y, v, d, t, xo, yo;

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		xo = Integer.parseInt(st.nextToken());
		yo = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(br.readLine());
		t = 500;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			v = Integer.parseInt(st.nextToken());

			d = Math.sqrt(Math.pow((xo - x), 2) + Math.pow((yo - y), 2));

			t = Math.min(t, (d / v));
		}

		br.close();
		System.out.println(t);

	}

}
