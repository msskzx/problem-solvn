package preez.codeforces;

import java.io.*;

public class AorBequalsC {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int test = Integer.parseInt(br.readLine());
		for (int t = 0; t < test; t++) {
			int n = Integer.parseInt(br.readLine());
			String a = br.readLine();
			String b = br.readLine();
			boolean valid = true;
			for (int i = 0; i < n; i++) {
				if (a.charAt(i) == '1' && b.charAt(i) == '0')
					valid = false;
			}
			if (valid == false)
				out.println("IMPOSSIBLE");
			else {
				int count = 1;
				for (int i = 0; i < n; i++) {
					if (a.charAt(i) == '1' && b.charAt(i) == '1')
						count *= 2;
					count = count % 1000000007;
				}
				out.println(count);
			}
		}
		out.close();
		out.flush();
	}
}
