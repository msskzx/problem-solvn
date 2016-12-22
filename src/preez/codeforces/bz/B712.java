package preez.codeforces.bz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class B712 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new OutputStreamWriter(System.out));
	static int ud, rl;
	static String s;

	public static void main(String[] args) throws NumberFormatException, IOException {
		s = br.readLine();

		if (s.length() % 2 == 0) {
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == 'U') {
					ud++;
				} else {
					if (s.charAt(i) == 'D') {
						ud--;
					} else {
						if (s.charAt(i) == 'R') {
							rl++;
						} else {
							rl--;
						}
					}
				}
			}
			ud = Math.abs(ud);
			rl = Math.abs(rl);

			pr.println((ud + rl) / 2);

		} else {
			pr.println(-1);
		}

		br.close();
		pr.flush();
		pr.close();
	}

}
