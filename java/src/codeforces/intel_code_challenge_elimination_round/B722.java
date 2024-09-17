package codeforces.intel_code_challenge_elimination_round;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B722 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int n, count;
	static int[] a;
	static String s;
	static boolean flag;
	static StringTokenizer st;

	public static void main(String[] args) throws NumberFormatException, IOException {
		n = Integer.parseInt(br.readLine());
		a = new int[n];
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++)
			a[i] = Integer.parseInt(st.nextToken());

		for (int i = 0; i < n; i++) {
			s = br.readLine();
			count = 0;
			for (int j = 0; j < s.length(); j++) {
				if ("aeiouy".contains("" + s.charAt(j))) {
					count++;
				}
			}
			if (count != a[i]) {
				flag = true;
				break;
			}
		}
		System.out.println(flag ? "NO" : "YES");
	}

}
