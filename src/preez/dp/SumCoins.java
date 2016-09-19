package preez.dp;

import java.util.Arrays;
import java.util.Scanner;

public class SumCoins {
	/*
	 * top coder dynamic programming first problem
	 * 
	 * minimum number of coins to get that sum
	 */
	
	static Scanner sc = new Scanner(System.in);
	static int n, sum;
	
	public static void main(String[] args) {
		n = sc.nextInt();
		int[] coins = new int[n];
		int sum = sc.nextInt();
		int[] min = new int[sum + 1];
		Arrays.fill(min, Integer.MAX_VALUE);
		min[0] = 0;
		for (int i = 1; i < sum + 1; i++) {
			for (int j = 0; j < coins.length; j++) {
				if (coins[j] <= i && min[i - coins[j]] + 1 < min[i]) {
					min[i] = min[i - coins[j]] + 1;
				}
			}
		}
		System.out.println(min[sum]);
	}

}
