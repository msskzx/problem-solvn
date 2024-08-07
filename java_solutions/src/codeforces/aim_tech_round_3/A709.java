package codeforces.aim_tech_round_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A709 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int n, b, d, count, c, a;

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		d = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		br.close();

		for (int i = 0; i < n; i++) {
			a = Integer.parseInt(st.nextToken());
			if (a <= b) {
				c += a;
				if (c > d) {
					count++;
					c = 0;
				}
			}
		}
		
		System.out.println(count);
	}

}
