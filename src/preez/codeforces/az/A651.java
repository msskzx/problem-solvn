package preez.codeforces.az;

import java.util.Scanner;

public class A651 {

	static Scanner sc = new Scanner(System.in);
	static int a, b, t;

	public static void main(String[] args) {
		a = sc.nextInt();
		b = sc.nextInt();
		if (a == 1 && b == 1)
			System.out.println(0);
		else {
			while (a > 0 && b > 0) {
				if (a < b) {
					a++;
					b -= 2;
				} else {
					b++;
					a -= 2;
				}
				t++;
			}
			System.out.println(t);
		}
	}

}
