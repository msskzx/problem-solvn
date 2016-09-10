package preez.codeforces;

import java.util.Scanner;

public class C709 {

	static Scanner sc = new Scanner(System.in);
	static String s;
	static StringBuilder sb;
	static int i;
	static boolean flag;

	public static void main(String[] args) {
		s = sc.next();
		sb = new StringBuilder();

		rev: for (i = 0; i < s.length(); i++) {
			if (s.charAt(i) != 'a') {
				flag = true;
				for (; i < s.length(); i++) {
					if (s.charAt(i) != 'a') {
						sb.append(((char) (s.charAt(i) - 1)) + "");
					} else {
						break rev;
					}
				}
			} else
				sb.append(s.charAt(i) + "");
		}

		for (; i < s.length(); i++)
			sb.append(s.charAt(i) + "");

		if (!flag) {
			sb.replace(s.length()-1, s.length(), "z");
		}

		System.out.println(sb);

	}

}
