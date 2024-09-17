package codeforces.cfr374;

import java.util.ArrayList;
import java.util.Scanner;

public class A721 {

	static Scanner sc = new Scanner(System.in);
	static String s;
	static int cur, input, output;
	static ArrayList<Integer> a = new ArrayList<Integer>();

	public static void main(String[] args) {
		input = sc.nextInt();
		s = sc.next();

		for (int i = 0; i < input; i++) {
			if (s.charAt(i) == 'B') {
				cur++;
			} else {
				if (cur > 0) {
					a.add(cur);
					output++;
				}
				cur = 0;
			}
		}
		if (cur > 0) {
			a.add(cur);
			output++;
		}
		System.out.println(output);
		for (int x : a) {
			System.out.print(x + " ");
		}
	}

}
