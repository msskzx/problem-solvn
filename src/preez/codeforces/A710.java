package preez.codeforces;

import java.util.Scanner;

public class A710 {

	static Scanner sc = new Scanner(System.in);
	static String s;

	public static void main(String[] args) {
		s = sc.next();
		if ("a8h8a1h1".contains(s)) {
			System.out.println(3);
		} else {
			if (s.charAt(1) == '8' || s.charAt(1) == '1' || s.charAt(0) == 'a' || s.charAt(0) == 'h') {
				System.out.println(5);
			} else {
				System.out.println(8);
			}
		}
	}

}
