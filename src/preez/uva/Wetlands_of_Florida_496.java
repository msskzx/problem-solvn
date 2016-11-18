package preez.uva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Wetlands_of_Florida_496 {

	static ArrayList<char[]> a;
	static int N, M, T, qi, qj;

	// S,SE,E,NE,N,NW,W,SW neighbors
	static int dr[] = { 1, 1, 0, -1, -1, -1, 0, 1 };
	static int dc[] = { 0, 1, 1, 1, 0, -1, -1, -1 };

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;

	static int floodFill(int i, int j, char c1, char c2) {
		if (i >= N || i < 0 || j >= M || j < 0 || a.get(i)[j] != c1)
			return 0;
		a.get(i)[j] = c2;
		int ans = 1;
		for (int k = 0; k < dr.length; k++)
			ans += floodFill(i + dr[k], j + dc[k], c1, c2);
		return ans;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		T = Integer.parseInt(br.readLine());
		br.readLine();
		while (T-- > 0) {
			String s = br.readLine();
			a = new ArrayList<>();
			while (s.charAt(0) == 'W' || s.charAt(0) == 'L') {
				a.add(s.toCharArray());
				s = br.readLine();
			}
			N = a.size();
			M = a.get(0).length;

			while (s != null && s.length() != 0) {
				st = new StringTokenizer(s);
				qi = Integer.parseInt(st.nextToken()) - 1;
				qj = Integer.parseInt(st.nextToken()) - 1;
				System.out.println(floodFill(qi, qj, 'W', '.'));
				floodFill(qi, qj, '.', 'W');
				s = br.readLine();
			}
			if(T>0)
				System.out.println();
		}
		br.close();
	}

}
