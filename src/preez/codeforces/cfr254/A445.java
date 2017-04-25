package preez.codeforces.cfr254;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A445 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new OutputStreamWriter(System.out));
	static int n, m;
	static StringTokenizer st;
	static char[][] a;
	static String s;
	static char x, y;

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		x = 'B';
		y = 'W';
		a = new char[n][m];
		for (int i = 0; i < n; i++) {
			s = br.readLine();
			for (int j = 0; j < m; j++) {
				if (s.charAt(j) == '-')
					a[i][j] = '-';
				else
					a[i][j] = j % 2 == 0 ? x : y;
				pr.print(a[i][j]);
			}
			char tmp = x;
			x = y;
			y = tmp;
			pr.println();
			pr.flush();
		}
		br.close();

		pr.println();
		pr.flush();
		pr.close();
	}

}
