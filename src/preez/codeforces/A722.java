package preez.codeforces;

import java.util.Scanner;

public class A722 {

	static Scanner sc = new Scanner(System.in);
	static String in;
	static int hours, mins, sys;
	static String h, m, o;

	public static void main(String[] args) {
		sys = sc.nextInt();
		in = sc.next();
		h = in.substring(0, 2);
		hours = Integer.parseInt(h);
		m = in.substring(3);
		mins = Integer.parseInt(m);
		if (sys == 12) {
			if (hours > 12) {
				h = "0" + h.charAt(1);
				if (h.equals("00"))
					h = "10";
			}
			if (h.equals("00"))
				h = "01";

		} else {
			if (hours > 23) {
				h = "0" + h.charAt(1);
			}
		}
		if (mins > 59) {
			m = "0" + m.charAt(1);
		}
		System.out.println(h + ":" + m);
	}

}
