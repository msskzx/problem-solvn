package codeforces.cfr417;

import java.util.Scanner;

public class A812 {

	static Scanner sc = new Scanner(System.in);
	static int[][] a = new int[4][4];

	static boolean accident() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				if (a[i][j] + a[i][3] == 2)
					return true;
				if (a[(i + j + 1) % 4][j] + a[i][3] == 2)
					return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		for(int i = 0;i<4;i++)
			for(int j = 0;j<4;j++)
				a[i][j] = sc.nextInt();
		
		if (accident())
			System.out.println("YES");
		else
			System.out.println("NO");

	}

}
