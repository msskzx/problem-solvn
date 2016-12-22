package preez.codeforces.az;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A462 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int n, check;
	static char[][] a;

	static boolean f() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				check = 0;
				// check up
				if (i != 0) {
					if (a[i - 1][j] == 'o')
						check++;
				}
				// check down
				if (i != n - 1) {
					if (a[i + 1][j] == 'o')
						check++;
				}
				// check right
				if (j != n - 1) {
					if (a[i][j + 1] == 'o')
						check++;
				}
				// check left
				if (j != 0) {
					if (a[i][j - 1] == 'o')
						check++;
					if (check % 2 != 0)
						return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		n = Integer.parseInt(br.readLine());
		a = new char[n][n];

		for (int i = 0; i < n; i++)
			a[i] = br.readLine().toCharArray();

		System.out.println(f() ? "YES" : "NO");

	}

}
