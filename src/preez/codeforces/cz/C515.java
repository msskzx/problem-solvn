package preez.codeforces.cz;

import java.util.Scanner;

public class C515 {

	static Scanner sc = new Scanner(System.in);
	static int n, x;
	static String s;
	static StringBuilder sb = new StringBuilder("");
	static StringBuilder two = new StringBuilder("");
	static StringBuilder three = new StringBuilder("");
	static StringBuilder five = new StringBuilder("");
	static StringBuilder seven = new StringBuilder("");
	// { "", "", "2", "3", "322", "5", "53", "7", "7222", "7332" };

	public static void main(String[] args) {
		n = sc.nextInt();
		s = sc.next();
		for (int i = 0; i < n; i++) {
			x = Integer.parseInt(s.charAt(i) + "");
			if (x == 2) {
				two.append("2");
			} else {
				if (x == 3) {
					three.append("3");
				} else {
					if (x == 4) {
						three.append("3");
						two.append("22");
					} else {
						if (x == 5) {
							five.append("5");
						} else {
							if (x == 6) {
								five.append("5");
								three.append("3");
							} else {
								if (x == 7) {
									seven.append("7");
								} else {
									if (x == 8) {
										seven.append("7");
										two.append("222");
									} else {
										if (x == 9) {
											seven.append("7");
											three.append("33");
											two.append("2");
										}
									}
								}
							}
						}
					}
				}
			}
		}

		sb.append(seven).append(five).append(three).append(two);
		System.out.println(sb);

	}
}
