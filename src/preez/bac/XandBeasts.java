package preez.bac;

import java.io.*;
import java.util.StringTokenizer;

public class XandBeasts {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO TLE
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int test = Integer.parseInt(br.readLine());
		for (int t = 0; t < test; t++) {
			int n = Integer.parseInt(br.readLine());
			int[] a = new int[n];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++) {
				a[i] = Integer.parseInt(st.nextToken());
			}
			int count = 0;
			for (int i = 0; i < n; i++) {
				int temp = 0;
				for (int j = 1; j <= a[i] / 2; j++) {
					if (a[i] % (1 << j) == 0)
						temp = j;
				}
				count += temp;
			}
			out.println(count);
		}
		out.close();
		out.flush();
	}
}
