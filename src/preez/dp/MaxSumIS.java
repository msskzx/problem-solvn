package preez.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxSumIS {

	/*
	 * Given an array of n positive integers. Write a program to find the sum of
	 * maximum sum subsequence of the given array such that the integers in the
	 * subsequence are in increasing order.
	 *
	 * https://youtu.be/99ssGWhLPUE
	 * 
	 * https://github.com/mission-peace/interview/blob/master/src/com/interview/
	 * dynamic/MaximumSumSubsequence.java
	 * 
	 * http://www.geeksforgeeks.org/dynamic-programming-set-14-maximum-sum-
	 * increasing-subsequence
	 * 
	 */

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int[] input;
	static int[] a;
	static StringTokenizer st;
	static int n, max;

	public static void main(String[] args) throws NumberFormatException, IOException {
		n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		input = a = new int[n];

		for (int i = 0; i < n; i++)
			input[i] = a[i] = Integer.parseInt(st.nextToken());
		max = input[0];

		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++)
				if (input[j] < input[i])
					a[i] = Math.max(a[i], input[i] + a[j]);

			max = Math.max(max, a[i]);
		}
		System.out.println("Max Sum for the increasing subsequence: " + max);

	}

}
