package preez.mayhem.recursion.copy;

import java.util.Scanner;

public class Path_Matrix {

	/*
	 * starting at the cell containing 1 can you visit the whole grid in an
	 * increasing sequence.
	 * 
	 * The grid contains numbers from 1 to n*m;
	 * 
	 * codefights
	 */

	static Scanner sc = new Scanner(System.in);
	static int n, m, ii, jj;
	static int[][] a;

	public static boolean f(int i, int j, int prev) {
		if (i < 0 || j < 0 || j >= m || i >= n || a[i][j] != prev + 1)
			return false;
		if (prev + 1 == n * m)
			return true;
		return f(i + 1, j, prev + 1) || f(i - 1, j, prev + 1) || f(i, j + 1, prev + 1) || f(i, j - 1, prev + 1);
	}

	public static void main(String[] args) {
		n = sc.nextInt();
		m = sc.nextInt();
		a = new int[n][m];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++) {
				a[i][j] = sc.nextInt();
				if (a[i][j] == 1) {
					ii = i;
					jj = j;
				}
			}

		System.out.println(f(ii, jj, 0));
	}

}
