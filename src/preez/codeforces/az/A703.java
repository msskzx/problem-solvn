package preez.codeforces.az;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A703 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int n, a, b, counta, countb;
	static StringTokenizer st;

	public static void main(String[] args) throws NumberFormatException, IOException {
		n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			if (a > b)
				counta++;
			if (b > a)
				countb++;
		}
		System.out.println(counta > countb ? "Mishka" : countb > counta ? "Chris" : "Friendship is magic!^^");
	}

}
