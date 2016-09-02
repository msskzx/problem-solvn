package preez.naccepted;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bonapity101028 {

	public static void main(String[] args) throws IOException {
		// TODO WA
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer tok;
		for (int i = 0; i < n; i++) {
			tok = new StringTokenizer(br.readLine());
			if (isArabic(tok.nextToken(), tok.nextToken()))
				System.out.println("Yes");
			else
				System.out.println("No");

		}

	}

	public static boolean isArabic(String eng, String arab) {
		if (eng.length() != arab.length())
			return false;

		eng = eng.toLowerCase();
		arab = arab.toLowerCase();

		for (int i = 0; i < eng.length(); i++) {
			if (!((eng.charAt(i) == arab.charAt(i)) || (eng.charAt(i) == 'p' && arab.charAt(i) == 'b')
					|| (eng.charAt(i) == 'b' && arab.charAt(i) == 'p')
					|| (eng.charAt(i) == 'e' && arab.charAt(i) == 'i')
					|| (eng.charAt(i) == 'i' && arab.charAt(i) == 'e')))
				return false;
		}

		return true;
	}

}
