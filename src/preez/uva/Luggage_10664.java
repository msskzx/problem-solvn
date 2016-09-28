package preez.uva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Luggage_10664 {

	static PrintWriter pr = new PrintWriter(new OutputStreamWriter(System.out));
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int n, sum, cur, input;
	static boolean[][] dp;
	static ArrayList<Integer> a;

	static boolean f() {
		if (sum % 2 == 1)
			return false;
		cur = sum / 2;
		dp = new boolean[a.size() + 1][cur + 1];

		for (int i = 1; i < dp.length; i++) {
			dp[i][0] = true;
			for (int j = 1; j < dp[0].length; j++) {
				dp[i][j] = dp[i - 1][j];
				if (j >= a.get(i - 1))
					dp[i][j] = dp[i][j] || dp[i-1][j - a.get(i - 1)];
			}
			if (dp[i][dp[0].length - 1])
				return true;
		}

		return dp[a.size()][cur];
	}

	public static void main(String[] args) throws IOException {
		n = Integer.parseInt(br.readLine());
		while (n-- > 0) {
			st = new StringTokenizer(br.readLine());
			a = new ArrayList<>();
			sum = 0;
			while (st.hasMoreTokens()) {
				input = Integer.parseInt(st.nextToken());
				a.add(input);
				sum += input;
			}
			pr.println(f() ? "YES" : "NO");
		}
		
		br.close();
		pr.flush();
		pr.close();
	}

}
