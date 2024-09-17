package mayhem.dp;

import java.util.Scanner;

public class Knapsack01 {

	/*
	 * 0/1 Knapsack Problem - Given items of certain weights/values and maximum
	 * allowed weight how to pick items to pick items from this set to maximize
	 * sum of value of items such that sum of weights is less than or equal to
	 * maximum allowed weight.
	 *
	 * Time complexity - O(W*total items)
	 *
	 * Topdown DP - https://youtu.be/149WSzQ4E1g
	 *
	 * Bottomup DP - https://youtu.be/8LusJS5-AGo
	 *
	 * http://www.geeksforgeeks.org/dynamic-programming-set-10-0-1-knapsack-
	 * problem/
	 * 
	 * https://en.wikipedia.org/wiki/Knapsack_problem
	 */

	static Scanner sc = new Scanner(System.in);
	static int[] w;
	static int[] v;
	static int n, sum;
	static int[][] dp;

	public static void main(String[] args) {
		n = sc.nextInt();
		sum = sc.nextInt();

		w = new int[n + 1];
		v = new int[n + 1];

		for (int i = 1; i < n; i++)
			w[i] = sc.nextInt();

		for (int i = 1; i < n; i++)
			v[i] = sc.nextInt();

		dp = new int[n + 1][sum + 1];

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sum; j++) {
				if (w[i] > j) {
					dp[i][j] = dp[i - 1][j];
				} else {
					dp[i][j] = Math.max(v[i] + dp[i - 1][j - w[i]], dp[i - 1][j]);
				}
			}
		}
		
		System.out.println(dp[n][sum]);
		
	}

}
