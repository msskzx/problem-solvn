package preez.dp;

import java.util.Scanner;

public class MaxSumMatrix {

	/*
	 * A table composed of N x M cells, each having a certain quantity of
	 * apples, is given. You start from the upper-left corner. At each step you
	 * can go down or right one cell. Find the maximum number of apples you can
	 * collect.
	 * 
	 * https://www.topcoder.com/community/data-science/data-science-tutorials/
	 * dynamic-programming-from-novice-to-advanced/
	 */

	static Scanner sc = new Scanner(System.in);
	static int[][] a;
	static int[][] dp;
	static int n, m;

	static int sum() {
		dp = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (i == 0 && j == 0) {
					dp[i][j] = a[i][j];
				} else {
					if (i == 0) {
						dp[i][j] = a[i][j] + dp[i][j - 1];
					} else {
						if (j == 0) {
							dp[i][j] = a[i][j] + dp[i - 1][j];
						} else {
							dp[i][j] = a[i][j] + Math.max(dp[i][j - 1], dp[i - 1][j]);
						}
					}

				}

			}
		}

		return dp[n - 1][m - 1];
	}

	public static void main(String[] args) {
		n = sc.nextInt();
		m = sc.nextInt();
		a = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		System.out.println(sum());

	}

}
