package preez.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class CodefrocesRating {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new OutputStreamWriter(System.out));
	static int n, rating, t, check;
	static StringTokenizer st;

	public static void main(String[] args) throws NumberFormatException, IOException {
		t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			rating = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			check = 1500;

			while (n-- > 0) {
				check += Integer.parseInt(st.nextToken());
			}

			pr.println(check == rating ? "Correct" : "Bug");
		}
		br.close();
		pr.flush();
		pr.close();
	}

}
