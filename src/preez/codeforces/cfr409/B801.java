package preez.codeforces.cfr409;

import java.util.Scanner;

public class B801 {

	static Scanner sc = new Scanner(System.in);
	static String a, b, c;

	public static void main(String[] args) {
		a = sc.next();
		b = sc.next();
		c = "";
		boolean flag = true;

		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) < b.charAt(i)) {
				flag = false;
				break;
			}
		}
		System.out.println(flag ? b : "-1");
	}

}
