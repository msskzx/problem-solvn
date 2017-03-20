package preez.mayhem.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Jumping {

	/*
	 * Given an array of non negative integers where each element represents the
	 * max number of steps that can be made forward from that element. Write a
	 * function to return the minimum number of jumps to reach the end of the
	 * array from first element
	 *
	 * http://www.geeksforgeeks.org/minimum-number-of-jumps-to-reach-end-of-a-
	 * given-array/
	 * 
	 * https://github.com/mission-peace/interview/blob/master/src/com/interview/
	 * dynamic/MinJumpToReachEnd.java
	 */

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int[] input;
	static int[] a;
	static int n;

	public static void main(String[] args) throws NumberFormatException, IOException {
		n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());

		input = new int[n];
		a = new int[n];

		for (int i = 0; i < n; i++) {
			input[i] = Integer.parseInt(st.nextToken());
			a[i] = i;
		}

		for (int i = 1; i < n; i++)
			for (int j = 0; j < i; j++)
				if (i - j <= input[j])
					a[i] = Math.min(a[i], a[j] + 1);

		System.out.println(a[n - 1]);
	}

}
