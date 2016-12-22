package preez.codeforces.az;

import java.util.Scanner;

public class A705 {

	static Scanner sc = new Scanner(System.in);
	static int n;
	static StringBuilder sb;

	public static void main(String[] args) {
		n = sc.nextInt();
		sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(i % 2 == 0 ? "I hate " : "I love ");
			if (i < n - 1)
				sb.append("that ");
		}
		sb.append("it");
		System.out.println(sb);
	}

}
