package preez.dp;

import java.util.Scanner;

public class SubsetSum {

	/*
	 * Given an array of non negative numbers and a total, is there subset of
	 * numbers in this array which adds up to given total.
	 *
	 * Time complexity - O(input.size * total_sum) Space complexity -
	 * O(input.size*total_sum)
	 *
	 * Youtube video - https://youtu.be/s6FhG--P7z0
	 */

	static Scanner sc = new Scanner(System.in);
	static boolean[][] dp;
	static int[] input;
	static int n, sum;

	public static void main(String[] args) {
		n = sc.nextInt();
		sum = sc.nextInt();
		dp = new boolean[n + 1][sum + 1];
		input = new int[n];

		for (int i = 0; i < n; i++)
			input[i] = sc.nextInt();

		for (int i = 0; i <= n; i++) {
			dp[i][0] = true;
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sum; j++) {
				if (input[i - 1] > j) {
					dp[i][j] = dp[i - 1][j];
				} else {
					dp[i][j] = dp[i - 1][j] || dp[i - 1][j - input[i - 1]];
				}
			}
		}

		System.out.println(dp[n][sum]);

	}

}
