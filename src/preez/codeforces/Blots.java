package preez.codeforces;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Blots {

	static String s;
	static int N, M, ones, blots;
	static StringTokenizer st;
	static char[][] a;

	static int f(int i, int j) {
		if (i >= N || i < 0 || j >= M || j < 0 || a[i][j] == '0') {
			return 0;
		}
		a[i][j] = '0';
		return 1 + f(i - 1, j) + f(i + 1, j) + f(i, j + 1) + f(i, j - 1);

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("blot.in"));
		PrintWriter pr = new PrintWriter("blot.out");

		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		a = new char[N][M];

		for (int i = 0; i < N; i++) {
			s = br.readLine();
			a[i] = s.toCharArray();
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (a[i][j] == '1')
					blots++;
				ones = Math.max(ones, f(i, j));
			}
		}

		pr.println(blots + " " + ones);
		pr.flush();
		br.close();
		pr.close();
	}

}
