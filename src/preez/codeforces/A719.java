package preez.codeforces;

import java.util.Scanner;

public class A719 {

	static Scanner sc = new Scanner(System.in);
	static int n, prev, cur;

	public static void main(String[] args) {
		n = sc.nextInt();
		if (n == 1) {
			cur = sc.nextInt();
			if (cur == 0)
				System.out.println("UP");
			else if (cur == 15)
				System.out.println("DOWN");
			else
				System.out.println(-1);
		} else {
			for (int i = 0; i < n - 2; i++) {
				sc.nextInt();
			}
			prev = sc.nextInt();
			cur = sc.nextInt();
			if (cur == 15)
				System.out.println("DOWN");
			else if (cur == 0)
				System.out.println("UP");
			else
				System.out.println(prev < cur ? "UP" : "DOWN");
		}
	}

}
