package preez.codeforces.bz;

import java.util.Scanner;

public class B746 {

	static Scanner sc = new Scanner(System.in);
	static int n;
	static String s, cur;

	public static void main(String[] args) {
		n = sc.nextInt();
		s = sc.next();
		cur = "";

		for (int i = n-1; i >= 0; i--) {
			cur = cur.substring(0, cur.length() / 2) + s.charAt(i) + cur.substring(cur.length() / 2);
		}
		System.out.println(cur);
	}

}
