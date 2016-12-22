package preez.codeforces.cz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class C4 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new OutputStreamWriter(System.out));
	static Map<String, Integer> map = new HashMap<String, Integer>();
	static int n, count;
	static StringBuilder sb;

	public static void main(String[] args) throws NumberFormatException, IOException {
		n = Integer.parseInt(br.readLine());
		while (n-- > 0) {
			sb = new StringBuilder(br.readLine());
			if (map.containsKey(sb.toString())) {
				count = map.get(sb.toString());
				map.put(sb.toString(), count + 1);
				sb.append(count);
				pr.println(sb.toString());
			} else {
				map.put(sb.toString(), 1);
				pr.println("OK");
			}
		}

		br.close();
		pr.flush();
		pr.close();
	}

}
