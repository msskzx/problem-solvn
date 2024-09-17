package codeforces.aim_tech_round_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B709 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int n, dist1, dist2, start;
	static int[] a;

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken()) + 1;
		a = new int[n];
		a[0] =start= Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());

		for (int i = 1; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(a);

		if (n == 1) {
			System.out.println(0);
		} else {
			dist1 = a[n - 2] - a[0] + Math.min(Math.abs(start - a[0]), Math.abs(start - a[n - 2]));
			dist2 = a[n - 1] - a[1] + Math.min(Math.abs(start - a[1]), Math.abs(start - a[n - 1]));
			System.out.println(Math.min(dist1, dist2));
		}
	}

}
