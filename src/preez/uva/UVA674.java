package preez.uva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class UVA674 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new OutputStreamWriter(System.out));
	static int[] a = { 1, 5, 10, 25, 50 };
	static long[][] dp;
	static int money;

	static void d() {
		dp = new long[6][7500];

		for (int i = 1; i < 6; i++) {
			dp[i][0] = 1;
			for (int j = 1; j < 7500; j++) {
				dp[i][j] = dp[i - 1][j];
				if (a[i - 1] <= j) {
					dp[i][j] += dp[i][j - a[i - 1]];
				}
			}
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		d();
		while (br.ready()) {
			money = Integer.parseInt(br.readLine());
			pr.println(dp[5][money]);
		}
		br.close();
		pr.flush();
		pr.close();
	}

}
