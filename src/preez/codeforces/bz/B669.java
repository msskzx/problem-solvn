package preez.codeforces.bz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B669 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static String s;
	static StringTokenizer st;
	static int[] a;
	static boolean[] b;
	static int n;
	static boolean flag;

	static boolean check() {
		int i = 0;
		while (!b[i]) {
			if (i < 0 || i >= n)
				return true;
			b[i] = true;

			if (s.charAt(i) == '<')
				i -= a[i];
			else
				i += a[i];
			if (i < 0 || i >= n)
				return true;
		}

		if (i < 0 || i >= n)
			return true;

		return false;

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		n = Integer.parseInt(br.readLine());
		s = br.readLine();
		a = new int[n];
		b = new boolean[n];
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
			if (a[i] > 100000)
				flag = true;
		}

		if (flag)
			System.out.println("FINITE");
		else
			System.out.println(check() ? "FINITE" : "INFINITE");
	}

}
