package preez.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class PlayingWithStrings {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new OutputStreamWriter(System.out));
	static int t, common;
	static String a, b;
	static Map<Character, Integer> mapa;
	static Map<Character, Integer> mapb;
	static char c;

	public static void main(String[] args) throws NumberFormatException, IOException {
		t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			a = br.readLine();
			b = br.readLine();
			common = 0;

			mapa = new HashMap<Character, Integer>();
			mapb = new HashMap<Character, Integer>();

			for (int j = 0; j < a.length(); j++) {
				c = a.charAt(j);
				if (!mapa.containsKey(c)) {
					mapa.put(c, 1);
				} else {
					mapa.put(c, mapa.get(c) + 1);
				}
			}

			for (int j = 0; j < b.length(); j++) {
				c = b.charAt(j);
				if (!mapb.containsKey(c)) {
					mapb.put(c, 1);
				} else {
					mapb.put(c, mapb.get(c) + 1);
				}
			}

			for (Map.Entry<Character, Integer> entry : mapb.entrySet()) {
				if (mapa.containsKey(entry.getKey())) {
					common += Math.min(entry.getValue(), mapa.get(entry.getKey()));
				}
			}

			pr.println(Math.abs(a.length() - common) + Math.abs(b.length() - common));
		}

		pr.flush();
		br.close();
		pr.close();
	}

}
