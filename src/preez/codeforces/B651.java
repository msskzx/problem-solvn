package preez.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B651 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int n, segs;
	static int[] a;
	static StringTokenizer st;

	public static void main(String[] args) throws NumberFormatException, IOException {
		n = Integer.parseInt(br.readLine());
		a = new int[1001];
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++)
			a[Integer.parseInt(st.nextToken())]++;

		for (int i = 0; i < 1001; i++)
			segs = Math.max(segs, a[i]);

		System.out.println(n-segs);

	}
}
