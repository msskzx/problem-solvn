package preez.codeforces.mxr;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Roman {

	static int[] a = { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000 };
	static int[] b = { 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1 };

	static int max, ind;
	static String s, n1, n2;
	static char c1, c2;
	static boolean isBC1, isBC2;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("roman.in"));
		PrintWriter pr = new PrintWriter("roman.out");
		s = br.readLine();
		n1 = n2 = "";
		c1 = c2 = 'B';

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'B' || s.charAt(i) == 'A') {
				c1 = s.charAt(i);
				break;
			} else
				n1 += "" + s.charAt(i);
			ind++;
		}

		for (int i = ind + 3; i < s.length(); i++) {
			if (s.charAt(i) == 'B' || s.charAt(i) == 'A') {
				c2 = s.charAt(i);
				break;
			} else
				n2 += "" + s.charAt(i);
		}

		boolean isBC1 = c1 == 'B';
		boolean isBC2 = c2 == 'B';
		int num1 = Integer.parseInt(n1);
		int num2 = Integer.parseInt(n2);
		if ((isBC1 && isBC2) || (!isBC1 && !isBC2)) {
			pr.println(getRange(num1, num2, isBC1));
		} else {
			pr.println(Math.max(getRange(num1, 1, isBC1), getRange(1, num2, isBC2)));
		}

		br.close();
		pr.flush();
		pr.close();

	}

	public static int getRange(int n1, int n2, boolean isBC) {
		int low = 0, high = 0;
		if (n1 > n2) {
			low = n2;
			high = n1;
		} else {
			low = n1;
			high = n2;
		}

		for (int i = low; i <= high; i++) {
			int x = changeToRoman(changeToAUC(i, isBC));
			if (x > max)
				max = x;
		}

		return max;
	}

	public static int changeToAUC(int n, boolean isBC) {
		if (isBC) {
			return 754 - n;
		}
		return n + 753;
	}

	public static int changeToRoman(int x) {
		int y, i = 1, cur = 0;
		while (x > 0) {
			y = x % 10;
			x /= 10;
			y *= i;
			i *= 10;
			while (y > 0) {
				for (int j = a.length - 1; j >= 0; j--) {
					if (a[j] <= y) {
						cur += b[j];
						y -= a[j];
						break;
					}
				}
			}
		}
		return cur;
	}

}
