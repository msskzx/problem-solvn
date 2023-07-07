package preez.codeforces.cfr350;

import java.util.Scanner;

public class A670 {

	static Scanner sc = new Scanner(System.in);
	static int n, max, min;

	public static void main(String[] args) {
		n = sc.nextInt();
		min = max = (n / 7) * 2;
		max += n % 7 > 2 ? 2 : n % 7;
		if (n % 7 > 5)
			min++;
		System.out.println(min + " " + max);
	}

}
