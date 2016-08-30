package preez.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class A711 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new OutputStreamWriter(System.out));
	static int n;
	static boolean yes;
	static String[] a;

	public static void main(String[] args) throws NumberFormatException, IOException {
		n = Integer.parseInt(br.readLine());
		a = new String[n];
		for (int i = 0; i < n; i++) {
			a[i] = br.readLine();
		}

		for (int i = 0; i < n && !yes; i++) {
			if (a[i].charAt(0) == 'O' && a[i].charAt(1) == 'O') {
				a[i] = "++" + a[i].substring(2);
				yes = true;
			} else {
				if (a[i].charAt(3) == 'O' && a[i].charAt(4) == 'O') {
					a[i] = a[i].substring(0, 3) + "++";
					yes = true;
				}
			}
		}

		br.close();
		if (yes) {
			pr.println("YES");
			for (int i = 0; i < n; i++)
				pr.println(a[i]);
		} else
			pr.print("NO");

		pr.flush();
		pr.close();

	}
}
