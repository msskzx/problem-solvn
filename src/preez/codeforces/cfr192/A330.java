package preez.codeforces.cfr192;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A330 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int r, c, r_, c_;
	static int[] rows;
	static int[] cols;
	static StringTokenizer st;
	static String s;

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());

		rows = new int[r];
		cols = new int[c];

		for (int i = 0; i < r; i++) {
			s = br.readLine();
			for (int j = 0; j < c; j++) {
				if (s.charAt(j) == 'S') {
					cols[j] = -1;
					rows[i] = -1;
				} else {
					if (s.charAt(j) == '.' && cols[j] == 0) {
						cols[j] = 1;
					}
					if (s.charAt(j) == '.' && rows[i] == 0) {
						rows[i] = 1;
					}

				}
			}
		}

		for (int i = 0; i < r; i++)
			if (rows[i] == -1)
				r_++;

		for (int i = 0; i < c; i++)
			if (cols[i] == -1)
				c_++;

		System.out.println(r * c - r_ * c_);
	}

}
