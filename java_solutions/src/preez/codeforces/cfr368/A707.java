package preez.codeforces.cfr368;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A707 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int n, m;
	static boolean color;
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		loop: for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				char c = st.nextToken().charAt(0);
				if (c == 'C' || c == 'Y' || c == 'M') {
					color = true;
					break loop;
				}
			}
		}
		br.close();

		System.out.println(color ? "#Color" : "#Black&White");
	}

}
