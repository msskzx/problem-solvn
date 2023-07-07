package preez.mayhem.implementation.vjn;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RowRLE {
	
	/*
	 * Run Length Encoding without zigzag
	 */

	static Scanner sc = new Scanner(System.in);
	static int[][] a;

	public static void rle() {
		int prev = a[0][0];
		int count = 0;
		for(int i =0;i<a.length;i++) {
			for(int j = 0;j<a[0].length;j++) {
				if(a[i][j] == prev) {
					count++;
				}
				else {
					System.out.print(count + ", ");
					count = 1;
				}
				prev = a[i][j];
			}
		}
	}

	public static void main(String[] args) {
		int n = 10;
		int m = 10;
		a = new int[n][m];

		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				a[i][j] = new Random().nextInt(2);
		
		for(int i =0;i<n;i++)
			System.out.println(Arrays.toString(a[i]));

		rle();

	}

}
