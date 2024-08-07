package codeforces.cfr197;

import java.util.*;

public class A339 {
	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String s = sc.next();
		if (s.length() == 1)
			System.out.println(s);
		else {
			char[] array = s.toCharArray();
			Arrays.sort(array);
			for (int i = s.length() / 2; i < s.length() - 1; i++) {
				System.out.print(array[i] + "+");
			}
			System.out.print(array[s.length() - 1]);
		}
	}
}