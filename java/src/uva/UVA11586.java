package uva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class UVA11586 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new OutputStreamWriter(System.out));
	static String s;
	static int t, m, f;

	public static void main(String[] args) throws NumberFormatException, IOException {
		t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			s = br.readLine();
			m = 0;
			f = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == 'M')
					m++;
				else if (s.charAt(i) == 'F')
					f++;
			}
			if (m == f && m != 1)
				pr.println("LOOP");
			else
				pr.println("NO LOOP");
		}
		br.close();
		pr.flush();
		pr.close();
	}

}
