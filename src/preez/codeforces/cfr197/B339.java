package preez.codeforces.cfr197;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B339 {

	static int n, m, cur, target;
	static long time;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		cur = 1;

		for (int i = 0; i < m; i++) {
			target = Integer.parseInt(st.nextToken());
			if (target >= cur)
				time += (target - cur);
			else
				time += (target + n - cur);
			cur = target;
		}
		
		System.out.println(time);

		br.close();
	}

}
