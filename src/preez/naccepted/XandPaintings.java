package preez.naccepted;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class XandPaintings {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new OutputStreamWriter(System.out));
	static int t, R, C, r1, r2, c1, c2, I;
	static StringTokenizer st;
	static char[][] a;
	static char color;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO WA
		t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			R = Integer.parseInt(st.nextToken());
			C = Integer.parseInt(st.nextToken());
			I = Integer.parseInt(st.nextToken());
			a = new char[R][C];

			for (int i = 0; i < R; i++)
				Arrays.fill(a[i], '.');

			while (I-- > 0) {
				st = new StringTokenizer(br.readLine());
				r1 = Integer.parseInt(st.nextToken()) - 1;
				c1 = Integer.parseInt(st.nextToken()) - 1;
				r2 = Integer.parseInt(st.nextToken()) - 1;
				c2 = Integer.parseInt(st.nextToken()) - 1;
				color = st.nextToken().charAt(0);

				for (int i = r1; i <= r2; i++) {
					for (int j = c1; j <= c2; j++) {
						a[i][j] = color;
					}
				}
			}

			for (int i = 0; i < R; i++) {
				for (int j = 0; j < C; j++) {
					pr.print(a[i][j]);
				}
				pr.println();
			}
		}

		br.close();
		pr.flush();
		pr.close();
	}

}
