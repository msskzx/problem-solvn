package preez.codeforces.mxr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GoodWords {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer tok;
		for (int i = 0; i < n; i++) {
			tok = new StringTokenizer(br.readLine());
			String original = tok.nextToken();
			String sub = tok.nextToken();
			check(original, sub);
		}
	}

	public static void check(String original, String sub) {
		if (original.contains(sub))
			System.out.println("good");
		else if (original.contains("" + sub.charAt(0) + sub.charAt(1) + sub.charAt(2))
				|| original.contains("" + sub.charAt(0) + sub.charAt(1) + sub.charAt(3))
				|| original.contains("" + sub.charAt(1) + sub.charAt(2) + sub.charAt(3))
				|| original.contains("" + sub.charAt(0) + sub.charAt(2) + sub.charAt(3)))

			System.out.println("almost good");
		else
			System.out.println("none");

	}

}
