package preez.codeforces.bz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B363 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int k, n, min, j, sum;
	static StringTokenizer st;
	static int[] a;

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
			if (i < k) {
				sum += a[i];
			}
		}
		min = sum;
		for (int i = k; i < n; i++) {
			sum += a[i] - a[i - k];
			if (min > sum) {
				min = sum;
				j = i - k+1;
			}
		}

		System.out.println(j + 1);
	}

}
