package preez.codeforces.az;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class A593 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static String s, key;
	static int n, cur, max, count, value;
	static char c1, c2;
	static boolean[] check;
	static HashMap<String, Integer> map = new HashMap<String, Integer>();
	static int[] a = new int[26];

	public static void main(String[] args) throws NumberFormatException, IOException {
		n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			count = 0;
			s = br.readLine();

			check = new boolean[26];
			for (int j = 0; j < s.length(); j++) {
				c1 = s.charAt(j);
				check[c1 - 'a'] = true;
			}

			for (int j = 0; j < check.length; j++) {
				if (check[j]) {
					count++;
					if (count == 1) {
						c1 = (char) (j + 'a');
					} else {
						if (count == 2) {
							c2 = (char) (j + 'a');
						} else
							break;
					}
				}
			}

			if (count == 1) {
				a[c1 - 'a'] += s.length();
			} else {
				if (count == 2) {

					key = c1 < c2 ? "" + c1 + c2 : "" + c2 + c1;
					value = 0;
					if (map.get(key) != null) {
						value = map.get(key);
					}
					value += s.length();
					map.put(key, value);
				}
			}
		}

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			cur = entry.getValue();
			cur += a[entry.getKey().charAt(0) - 'a'] + a[entry.getKey().charAt(1) - 'a'];
			max = Math.max(max, cur);
		}
		max = Math.max(max, cur);

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				cur = a[i] + a[j];
				max = Math.max(max, cur);
			}
		}
		max = Math.max(max, cur);
		System.out.println(max);

	}

}
