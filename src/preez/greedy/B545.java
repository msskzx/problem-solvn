package preez.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B545 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static String s, t;
	static StringBuilder p;
	static int count;

	public static void main(String[] args) throws IOException {
		s = br.readLine();
		t = br.readLine();
		p = new StringBuilder("");

		for (int i = 0; i < s.length(); i++)
			if (s.charAt(i) != t.charAt(i)) {
				p.append(count % 2 == 0 ? s.charAt(i) : t.charAt(i));
				count++;
			} else
				p.append('0');

		System.out.println(count % 2 == 0 ? p : "impossible");

	}

}
