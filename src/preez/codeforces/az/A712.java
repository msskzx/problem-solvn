package preez.codeforces.az;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A712 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new OutputStreamWriter(System.out));
	static int n;
	static StringTokenizer st;
	static int[] a;
	static int[] b;

	public static void main(String[] args) throws NumberFormatException, IOException {
		n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		a = new int[n];
		b = new int[n];

		for (int i = 0; i < n; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < n - 1; i++) {
			a[i] = b[i] + b[i + 1];
		}

		a[n - 1] = b[n - 1];

		for (int i = 0; i < n; i++) {
			pr.printf("%d ", a[i]);
		}

		br.close();
		pr.flush();
		pr.close();
	}

}
