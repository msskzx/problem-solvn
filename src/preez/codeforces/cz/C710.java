package preez.codeforces.cz;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class C710 {

	static Scanner sc = new Scanner(System.in);
	static PrintWriter pr = new PrintWriter(new OutputStreamWriter(System.out));
	static int n, num, k, two, start, one;
	static int[][] a;

	public static void main(String[] args) {
		n = sc.nextInt();
		a = new int[n][n];
		num = 1;
		start = n / 2;
		k = 1;
		one = -1;
		two = 2;

		// odd
		for (int i = 0; i < n; i++) {
			for (int j = start; j < start + k; j++) {
				a[i][j] = num;
				num += 2;
			}
			if (i == n / 2) {
				two = -2;
				one = 1;
			}
			start += one;
			k += two;
		}

		num = 2;
		// even
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] == 0) {
					a[i][j] = num;
					num += 2;
				}
				pr.printf("%d ", a[i][j]);
			}
			pr.println();
			pr.flush();
		}

		pr.close();

	}

}
