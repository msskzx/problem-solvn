package preez.codeforces.cfr355;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B677 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static long n, h, k, c, s, a;
	static StringTokenizer st;

	public static void main(String[] args) throws NumberFormatException, IOException {
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		h = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			a = Integer.parseInt(st.nextToken());
			if (a + c <= h)
				c += a;
			else {
				c = a;
				s++;
			}
			s += c / k;
			c %= k;
		}
		
		s += c/k;
		c %=k;
		if(c>0)
			s++;
		System.out.println(s);
	}

}
