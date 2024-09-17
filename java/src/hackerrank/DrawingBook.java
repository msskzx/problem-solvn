package hackerrank;

import java.util.Scanner;

public class DrawingBook {

	/**
	 * https://www.hackerrank.com/contests/w27/challenges/drawing-book
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int p = in.nextInt();
		in.close();

		if (p == 1 || p == n || (p == n - 1 && n % 2 == 1))
			System.out.println(0);
		else if (n % 2 == 0)
			System.out.println((int) Math.min(Math.ceil((n - p) / 2.0), Math.ceil((p - 1) / 2.0)));
		else
			System.out.println((int) Math.min(Math.floor((n - p) / 2.0), Math.ceil((p - 1) / 2.0)));

	}
}
