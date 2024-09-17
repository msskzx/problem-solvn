package uva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class UVA10443 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pr = new PrintWriter(System.out);

		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			if (r == 0 || c == 0)
				;
			else {
				char[][] a = new char[r][];
				char[][] b = new char[r][c];

				for (int i = 0; i < r; i++)
					a[i] = br.readLine().toCharArray();

				while (d-- > 0) {
					for (int i = 0; i < r; i++) {
						for (int j = 0; j < c; j++) {
							if (i + 1 < r) {
								if (a[i][j] == 'R' && a[i + 1][j] == 'P')
									b[i][j] = 'P';
								else if (a[i][j] == 'P' && a[i + 1][j] == 'R')
									b[i + 1][j] = 'P';
								else if (a[i][j] == 'R' && a[i + 1][j] == 'S')
									b[i + 1][j] = 'R';
								else if (a[i][j] == 'S' && a[i + 1][j] == 'R')
									b[i][j] = 'R';
								else if (a[i][j] == 'S' && a[i + 1][j] == 'P')
									b[i + 1][j] = 'S';
								else if (a[i][j] == 'P' && a[i + 1][j] == 'S')
									b[i][j] = 'S';
							}
							if (j + 1 < c) {
								if (a[i][j] == 'R' && a[i][j + 1] == 'P')
									b[i][j] = 'P';
								else if (a[i][j] == 'P' && a[i][j + 1] == 'R')
									b[i][j + 1] = 'P';
								else if (a[i][j] == 'R' && a[i][j + 1] == 'S')
									b[i][j + 1] = 'R';
								else if (a[i][j] == 'S' && a[i][j + 1] == 'R')
									b[i][j] = 'R';
								else if (a[i][j] == 'S' && a[i][j + 1] == 'P')
									b[i][j + 1] = 'S';
								else if (a[i][j] == 'P' && a[i][j + 1] == 'S')
									b[i][j] = 'S';
							}
							if (b[i][j] != 'R' && b[i][j] != 'P' && b[i][j] != 'S')
								b[i][j] = a[i][j];
						}
					}

					for (int i = 0; i < r; i++) {
						for (int j = 0; j < c; j++) {
							a[i][j] = b[i][j];
						}
					}
				}
				for (int i = 0; i < r; i++) {
					for (int j = 0; j < c; j++)
						pr.print(a[i][j]);
					pr.println();
				}
			}
			if (t != 0)
				pr.println();
		}

		br.close();
		pr.flush();
		pr.close();
	}

}
