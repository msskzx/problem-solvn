package preez.codeforces.cfr271;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B474_sol1 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int n, m, cur, k;
	static HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

	public static void main(String[] args) throws NumberFormatException, IOException {
		n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());

		for (int i = 1; i <= n; i++) {
			cur = Integer.parseInt(st.nextToken());
			for (int j = 0; j < cur; j++) {
				k++;
				map.put(k, i);
			}
		}

		m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		br.close();

		for (int i = 0; i < m; i++) {
			cur = Integer.parseInt(st.nextToken());
			pr.println(map.get(cur));
		}

		pr.flush();
		pr.close();
	}

}
