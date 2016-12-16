package preez.codeforces;

import java.util.Scanner;

public class A471 {

	static Scanner sc = new Scanner(System.in);
	static int[] a;
	static boolean alien, bear;

	public static void main(String[] args) {
		a = new int[10];
		for (int i = 0; i < 6; i++)
			a[sc.nextInt()]++;
		alien = true;

		for (int i = 0; i < a.length; i++)
			if (a[i] >= 4) {
				alien = false;
				a[i] -= 4;
			} else if (a[i] == 1)
				bear = true;
			else if (a[i] == 2)
				bear = false;

		System.out.println(alien ? "Alien" : bear ? "Bear" : "Elephant");

	}

}
