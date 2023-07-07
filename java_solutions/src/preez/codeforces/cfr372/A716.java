package preez.codeforces.cfr372;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A716 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int n, c, count, prev, cur;
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		prev = Integer.parseInt(st.nextToken());

		count = 1;

		for (int i = 1; i < n; i++) {
			cur = Integer.parseInt(st.nextToken());
			if (cur - prev <= c) {
				count++;
			} else {
				count = 1;
			}
			prev = cur;
		}

		System.out.println(count);

	}
}