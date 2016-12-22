package preez.codeforces.bz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B546 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int n, coins;
	static int[] f;

	public static void main(String[] args) throws NumberFormatException, IOException {
		n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		f = new int[n];

		for (int i = 0; i < n; i++) {
			f[Integer.parseInt(st.nextToken()) - 1]++;
		}

		for (int i = 0; i < n - 1; i++) {
			if (f[i] != 0) {
				coins += f[i] - 1;
				f[i + 1] += f[i] - 1;
			}
		}
		while (f[n - 1]-- > 1)
			coins += f[n - 1];

		System.out.println(coins);
	}

}
