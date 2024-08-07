package codeforces.cfr412;

import java.util.Scanner;

public class A807 {

	static Scanner sc = new Scanner(System.in);
	static int n, up1, up2, down1, down2;

	public static void main(String[] args) {
		n = sc.nextInt();
		up1 = sc.nextInt();
		up2 = sc.nextInt();
		boolean rc = false;
		boolean inc = true;
		if (up1 != up2) {
			rc = true;
		}

		for (int i = 1; i < n; i++) {
			if (up1 != up2) {
				rc = true;
				break;
			}
			down1 = sc.nextInt();
			down2 = sc.nextInt();
			if (down1 > up1)
				inc = false;
			up1 = down1;
			up2 = down2;
		}
		if (up1 != up2) 
			rc = true;
		if (rc) {
			System.out.println("rated");
		} else if (!rc && inc) {
			System.out.println("maybe");
		} else
			System.out.println("unrated");
	}

}
