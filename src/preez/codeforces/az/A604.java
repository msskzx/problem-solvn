package preez.codeforces.az;

import java.util.Scanner;

public class A604 {

	static Scanner sc = new Scanner(System.in);
	static int[] x = { 500, 1000, 1500, 2000, 2500 };
	static int[] m = new int[5];
	static int[] w = new int[5];
	static int sh, uh;
	static double score;

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++)
			m[i] = sc.nextInt();

		for (int i = 0; i < 5; i++)
			w[i] = sc.nextInt();

		sh = sc.nextInt();
		uh = sc.nextInt();

		for (int i = 0; i < 5; i++) {
			score += Math.max(0.3 * x[i], (1 - m[i] * 1.0 / 250) * x[i] - 50 * w[i]);
		}

		score += (100 * sh);
		score += (-50 * uh);

		System.out.println(((int) score));

	}

}
