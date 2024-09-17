package codeforces.venture_cup_2016_elimination_round;

import java.util.Scanner;

public class B626 {

	static Scanner sc = new Scanner(System.in);
	static int n, r, b, g;
	static String s;

	static String solve() {
		if ((b >= 1 && r >= 1 && g >= 1) || (b > 1 && g > 1) || (b > 1 && r > 1) || (g > 1 && r > 1))
			return "BGR";
		if (b == n || g == n || r == n)
			return s.charAt(0) + "";
		if (b == 1 && g == 1 && r == 0)
			return "R";
		if (b == 1 && r == 1 && g == 0)
			return "G";
		if (g == 1 && r == 1 && b == 0)
			return "B";
		if (g > 1 && (b == 1 && r == 0) || (r == 1 && b == 0))
			return "BR";
		if (b > 1 && (r == 1 && g == 0) || (g == 1 && r == 0))
			return "GR";
		if (r > 1 && (b == 1 && g == 0) || (g == 1 && b == 0))
			return "BG";
		return "";
	}

	public static void main(String[] args) {
		n = sc.nextInt();
		s = sc.next();
		for (int i = 0; i < n; i++)
			if (s.charAt(i) == 'B')
				b++;
			else if (s.charAt(i) == 'G')
				g++;
			else
				r++;
		System.out.println(solve());
	}

}
