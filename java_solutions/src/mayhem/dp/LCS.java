package mayhem.dp;

import java.util.Scanner;

public class LCS {

	/*
	 * http://www.geeksforgeeks.org/dynamic-programming-set-4-longest-common-
	 * subsequence/
	 */

	static Scanner sc = new Scanner(System.in);
	static String a, b;
	static int[][] dp;

	static int lcs(String a, String b) {
		dp = new int[a.length() + 1][b.length() + 1];

		for (int i = 1; i <= a.length(); i++) {
			for (int j = 1; j <= b.length(); j++) {
				if (a.charAt(i - 1) == b.charAt(j - 1)) {
					dp[i][j] = 1 + dp[i - 1][j - 1];
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}

		return dp[a.length()][b.length()];
	}

	static void print() {
		int i = a.length(), j = b.length();
		String ans = "";
		while (i > 0 && j > 0) {
			if (a.charAt(i - 1) == b.charAt(j - 1)) {
				ans = a.charAt(i - 1) + ans;
				i--;
				j--;
			}

			// If not same, then find the larger of two and
			// go in the direction of larger value
			else if (dp[i - 1][j] > dp[i][j - 1])
				i--;
			else
				j--;
		}

		System.out.println(ans);
	}

	public static void main(String[] args) {
		a = sc.next();
		b = sc.next();

		System.out.println(lcs(a, b));
		print();

	}

}
