package preez.uva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class UVA156 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pr = new PrintWriter(System.out);
		HashMap<String, Integer> map = new HashMap<>();
		HashMap<String, String> origin = new HashMap<>();

		loop: while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				String x = st.nextToken();
				String s = x;
				if (s.equals("#"))
					break loop;

				s = s.toLowerCase();
				char[] a = s.toCharArray();
				Arrays.sort(a);
				s = "";
				for (int i = 0; i < a.length; i++) {
					s += a[i];
				}
				if (map.get(s) != null) {
					map.put(s, map.get(s) + 1);
				} else {
					map.put(s, 1);
				}
				if (origin.get(s) == null)
					origin.put(s, x);
			}
		}

		int j = 0;
		String[] res = new String[1000];
		Arrays.fill(res, "");
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			if (value == 1)
			{
				res[j++] = origin.get(key);
			}
		}
		Arrays.sort(res);
		for (int i = 0; i < 1000; i++) {
			if (res[i] != null && res[i].length() > 0)
				pr.println(res[i]);
		}

		br.close();
		pr.flush();
		pr.close();
	}

}
