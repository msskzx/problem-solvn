package codeforces.cfr341;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A621 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int n, cur, odd;
	static long sum;
	static StringTokenizer st;

	public static void main(String[] args) throws NumberFormatException, IOException {
		n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		odd = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			cur = Integer.parseInt(st.nextToken());
			sum += cur;
			if (cur % 2 == 1 && cur < odd)
				odd = cur;
		}
		if (sum % 2 == 0)
			System.out.println(sum);
		else
			System.out.println(sum - odd);
	}

}
