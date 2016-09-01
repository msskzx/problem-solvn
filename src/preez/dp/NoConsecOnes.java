package preez.dp;

import java.util.Scanner;

public class NoConsecOnes {
	
	/*
	 * https://www.youtube.com/watch?v=a9-NtLIs1Kk&list=WL&index=6
	 * Given a number n, find total number of numbers from 0 to 2^n-1 
	 * which do not have consecutive 1s in their binary representation.
	 * n>=1
	 * if n = 2
	 * possible numbers: 00, 01, 10, 11
	 * answer = 3
	 */

	static Scanner sc = new Scanner(System.in);
	static int n;
	static int[] memo;

	public static void main(String[] args) {
		n = sc.nextInt();

		memo = new int[n + 1];
		memo[0] = 1;
		memo[1] = 2;

		for (int i = 2; i <= n; i++) {
			memo[i] = memo[i - 1] + memo[i - 2];
		}

		System.out.println(memo[n]);
	}

}
