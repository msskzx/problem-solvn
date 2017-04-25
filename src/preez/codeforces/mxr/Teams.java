package preez.codeforces.mxr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Teams {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new OutputStreamWriter(System.out));
	static int n, t, gcd, count;
	static int[] a;
	static StringTokenizer st;

	static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			n = Integer.parseInt(br.readLine());
			a = new int[n];
			st = new StringTokenizer(br.readLine());

			for (int i = 0; i < n; i++)
				a[i] = Integer.parseInt(st.nextToken());

			gcd = a[0];
			count = 0;

			for (int i = 1; i < n; i++)
				gcd = gcd(a[i], gcd);
			for (int i = 0; i < n; i++)
				count += a[i] / gcd;
			pr.printf("%d %d\n", gcd, count);
		}

		br.close();
		pr.flush();
		pr.close();
	}

}
