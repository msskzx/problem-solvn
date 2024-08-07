package codefights.tournaments;

import java.util.Arrays;

public class SumDigitsDP {

	/**
	 * not solved...
	 * 
	 * Bug fix
	 * 
	 * https://codefights.com/tournaments/kNqwavD493TLCHLMa/A
	 * 
	 * @param sum
	 * @param numberLength
	 * @return
	 */

	static int digitSumInverse(int sum, int numberLength) {

		int[][] dp = new int[numberLength + 1][numberLength * 9 + 1];

		if (sum > 9 * numberLength) {
			return 0;
		}

		dp[0][0] = 1;
		for (int i = 0; i < numberLength; i++) {
			for (int j = 0; j < i * 9; j++) {
				for (int digit = 0; digit < 10; digit++) {
					dp[i + 1][j + digit] += dp[i][j];
				}
			}
		}

		System.out.println(Arrays.toString(dp[0]));
		System.out.println(Arrays.toString(dp[1]));

		return dp[numberLength][sum];
	}

	public static void main(String[] args) {
		digitSumInverse(5, 2);
	}
}
