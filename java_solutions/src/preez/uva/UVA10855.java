package preez.uva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class UVA10855 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new OutputStreamWriter(System.out));
	static int N, n;

	static char[][] rotate(char[][] b) {
		char[][] c = new char[b.length][b.length];
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++)
				c[j][b.length - i - 1] = b[i][j];
		}
		return c;
	}

	static int count(char[][] a, char[][] b) {
		int count = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				boolean flag = true;
				there: if (i + n <= N && j + n <= N) {
					for (int k = i; k < N && k - i < n; k++) {
						for (int l = j; l < N && l - j < n; l++) {
							if (a[k][l] != b[k - i][l - j]) {
								flag = false;
								break there;
							}
						}
					}
					if (flag)
						count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			if (N == 0)
				break;

			char[][] a = new char[N][];
			char[][] b = new char[n][];
			char[][] c;

			for (int i = 0; i < N; i++) {
				a[i] = br.readLine().toCharArray();
			}
			for (int i = 0; i < n; i++) {
				b[i] = br.readLine().toCharArray();
			}

			pr.printf("%d ", count(a, b));
			c = rotate(b);
			pr.printf("%d ", count(a, c));
			c = rotate(c);
			pr.printf("%d ", count(a, c));
			c = rotate(c);
			pr.println(count(a, c));
			pr.flush();
		}
		br.close();
		pr.flush();
		pr.close();
	}

}
