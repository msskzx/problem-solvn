package preez.mayhem.dp;

import java.util.Arrays;
import java.util.Scanner;

public class CoinChange {

	/*
	 * given a set of coins find the total number of different ways of making changes for any amount
	 * of money in cents.
	 */

	static Scanner sc = new Scanner(System.in);
	static int[] a = { 1, 5, 10, 25, 50 };
	static int money;
	static int[][] dp1;
	static int[][] dp2;

	static int rec(int i, int sum) {
		if (sum == 0)
			return 1;
		if (sum < 0 || i > 4)
			return 0;
		return rec(i, sum - a[i]) + rec(i + 1, sum);
	}

	static int dp1() {
		dp1 = new int[a.length + 1][money + 1];

		for (int i = 1; i < dp1.length; i++) {
			dp1[i][0] = 1;
			for (int j = 1; j < dp1[0].length; j++) {
				if (a[i - 1] <= j) {
					dp1[i][j] = dp1[i][j - a[i - 1]];
				}
				dp1[i][j] += dp1[i - 1][j];
			}
		}
		return dp1[a.length][money];
	}

	static int dp2(int i, int sum) {
		if (sum == 0)
			return 1;
		if (sum < 0 || i > 4)
			return 0;
		if (dp2[i][sum] != -1)
			return dp2[i][sum];
		return dp2[i][sum] = dp2(i, sum - a[i]) + dp2(i + 1, sum);
	}

	public static void main(String[] args) {
		money = sc.nextInt();
		dp2 = new int[a.length + 1][money + 1];
		for(int i = 0;i<dp2.length;i++)
			Arrays.fill(dp2[i], -1);
		System.out.println(rec(0, money));
		System.out.println(dp1());
		System.out.println(dp2(0, money));

	}

}
