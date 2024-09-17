package codeforces.cfr363;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B699 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int n, m, walls, check, x, y;
	static String s;
	static StringTokenizer st;
	static int[] a;
	static int[] b;
	static char[][] map;
	static boolean flag;

	public static void main(String[] args) throws NumberFormatException, IOException {
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		a = new int[n];
		b = new int[m];
		map = new char[n][m];

		for (int i = 0; i < n; i++) {
			s = br.readLine();
			for (int j = 0; j < m; j++) {
				map[i][j] = s.charAt(j);
				if (map[i][j] == '*') {
					a[i]++;
					b[j]++;
					walls++;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				check = a[i] + b[j];
				if (map[i][j] == '*')
					check--;
				if (check == walls) {
					flag = true;
					x = i+1;
					y = j+1;
					break;
				}
			}
		}

		System.out.println(flag ? String.format("YES\n%d %d", x, y) : "NO");
	}
}
