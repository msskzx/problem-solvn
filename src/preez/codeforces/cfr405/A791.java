package preez.codeforces.cfr405;

import java.util.Scanner;

public class A791 {

	static Scanner sc = new Scanner(System.in);
	static int a, b;

	public static void main(String[] args) {
		a = sc.nextInt();
		b = sc.nextInt();
		int i = 0;
		while (a <= b) {
			a*=3;
			b*=2;
			i++;
		}
		System.out.println(i);
	}

}
